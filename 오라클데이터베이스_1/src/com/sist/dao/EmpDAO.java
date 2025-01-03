package com.sist.dao;
/*
 *  자바 12장
 *  오라클 연동
 *  ---------
 *   1. 드라이버 설정
 *     => 한 번만 설정
 *     => 생성자 이용
 *     => Class.forName("드라이버명")
 *                      ---------- oracle.jdbc.driver.OracleDriver
 *                                 com.mysql.cj.jdbc.Driver
 *   2. 연결
 *     Connection conn=DriverManager.getConnection(URL, "hr", "happy")
 *   3. 오라클로 SQL문장 전송
 *              ----------
 *     RreparedStatement ps=conn.preparedStatemnet(sql)
 *   4. 오라클에서 SQL실행 후 결과값 요청
 *     ResultSet rs=ps.executeQuery();
 *     
 *       rs
 *       ---------------------------
 *          id      pwd      name
 *       ---------------------------
 *         aaa     1234     홍길동     | => next()
 *       ---------------------------
 *         bbb     1234     심청이
 *       ---------------------------
 *         ccc     1234     박문수
 *       ---------------------------
 *         ddd     1234     이순신     | => previous()
 *       ---------------------------
 *        | cursor 위치
 *        
 *       => rs.close()
 *       => ps.close()
 *       => conn.close()
 *     
 *     *** rs.next() => record 단위 => 한 줄에 있는 모든 데이터를 읽는다
 */
import java.util.*;
import java.sql.*;
import com.sist.vo.*;
/*
 *    => SQL => ; 사용 X
 *    => 변경 => LIKE 
 *    => LIKE '%'||문자열||'%' => 문자열 결합
 *    => LIKE CONCAT('%',문자열,'%') => MYSQL
 *    => JOIN => Oracle JOIN / ANSI JOIN
 *                             ---------
 */
public class EmpDAO {
	
	  // 1. 연결 객체
	  private Connection conn;
	  // 2. 오라클 SQL 송수신 => 클래스 전체에서 사용
	  private PreparedStatement ps;
	  /*
	   *    SQL 문장을 전송
	   *    오라클 실행 결과 읽기
	   *    ------------------
	   *    Statement : 데이터와 동시에 SQL문장을 전송
	   *    PreparedStatement : SQL 먼저 전송
	   *                        나중에 데이터를 채운다 ***
	   *    CallableStatement : Procedure 호출 => 함수
	   *                          | SQL문장이 노출되지 않음
	   *                          | 보안
	   *                          | ERP => 관리 프로그램
	   *                            E4NET
	   *    EmpVO
	   *    String sql="INSERT INTO emp VALUES("+vo.getEmpno()+",'"
	   *    									+vo.getEname()+"','"
	   *    									+vo.getJob()+"','"
	   *    									+vo.getHiredate()+"',"
	   *    									+vo.getSal()
	   *    String sql="INSERT INTO emp VALUES(?,?,?,?,?...)"
	   *    	=> MyBatis / JPA
	   */
	  // 3. DAO => 오라클 연동 => 사용자 한 명당 1개 사용 (싱글턴)
	  private static EmpDAO dao;
	  // 3-1. URL
	  private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
	  // => TCP => Socket 이용하여 오라클로 SQL 문장을 전송
	  // 오라클 서버 => 자바응용프로그램 : Client
	  public EmpDAO()
	  {
		  try
		  {
			  Class.forName("oracle.jdbc.driver.OracleDriver");
		  }catch(Exception ex) {}
	  }
	  
	  // 4. 기능
	  // 모든 메소드에서 공통으로 사용되는 기능
	  // 4-0. : 오라클 연결 / 오라클 연결 해제 
	  public void getConnection()
	  {
		  try
		  {
			  conn=DriverManager.getConnection(URL, "hr", "happy");
		  }catch(Exception ex) {}
	  }
	  public void disConnection()
	  {
		  try
		  {
			  if(ps!=null) ps.close();
			  if(conn!=null) conn.close();
		  }catch(Exception ex) {}
	  }
	  // 4-0-1. : 싱글턴 => 메모리 공간 한 개만 생성
	  public static EmpDAO newInstance()
	  {
		  if(dao==null)
			  dao=new EmpDAO();
		  return dao;
	  }
	  // --------------------------------------- 항상 jar
	  // 2차 => JSP : MyBatis(XML) => JQuery, AJax
	  // 3차 => Spring : MyBatis(Annotation) => VueJS
	  // 4-1. : 목록 ====> SELECT column_list
	  public List<EmpVO> empListData(int type)
	  {
		  List<EmpVO> list=new ArrayList<EmpVO>();
		  String order="";
		  if(type==1)
			  order="ORDER BY empno ASC";
		  else if(type==2)
			  order="ORDER BY hiredate DESC";
		  else if(type==3)
			  order="ORDER BY ename ASC";
		  try
		  {
			  // 1. 오라클 연결
			  getConnection();
			  // 2. SQL 문장 제작
			  String sql="SELECT empno, ename, job, hiredate FROM emp "+order;
			  // 3. 오라클 전송
			  ps=conn.prepareStatement(sql);
			  // 4. SQL 실행 후 결과 값 출력
			  ResultSet rs=ps.executeQuery();
			  // 정수 - getInt() / 실수 - getDouble() / 문자열 - getString() / 날짜 - getDate()
			  // => 커서 위치 변경
			  // 7839 KING    PRESIDENT    81/11/17
			  // 4-2. : 정렬 ====> ORDER BY
			  while(rs.next()) // 처음부터 마지막까지 읽어오기
			  {
				  EmpVO vo=new EmpVO();
				  vo.setEmpno(rs.getInt(1));
				  vo.setEname(rs.getString(2));
				  vo.setJob(rs.getString(3));
				  vo.setHiredate(rs.getDate(4));
				  list.add(vo);
			  }
			  rs.close();
		  }catch(Exception ex)
		  {
			  // 오류 확인
		  }
		  finally
		  {
			  // 오라클 해제
			  disConnection();
		  }
		  return list;
	  }
	  // 4-3. : 상세보기 => WHERE
	  // List - 여러명 / EmpVO - 1명 상세보기
	  public EmpVO empDetailData(int empno)
	  {
		  EmpVO vo=new EmpVO();
		  try
		  {
			  // 연결
			  getConnection();
			  // SQL
			  String sql="SELECT * FROM emp WHERE empno="+empno;
			  ps=conn.prepareStatement(sql);
			  ResultSet rs=ps.executeQuery();
			  rs.next();
			  vo.setEmpno(rs.getInt(1));
			  vo.setEname(rs.getString(2));
			  vo.setJob(rs.getString(3));
			  vo.setMgr(rs.getInt(4));
			  vo.setHiredate(rs.getDate(5));
			  vo.setSal(rs.getInt(6));
			  vo.setComm(rs.getInt(7));
			  vo.setDeptno(rs.getInt(8));
			  rs.close();
		  }catch(Exception ex)
		  {
			  ex.printStackTrace();
		  }
		  finally
		  {
			  disConnection();
		  }
		  return vo;
	  }
	 
}
