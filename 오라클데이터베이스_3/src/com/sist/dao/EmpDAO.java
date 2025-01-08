package com.sist.dao;
// 데이터베이스 연결하는 클래스
import java.util.*;
import java.sql.*;
import com.sist.vo.*;
/*
    오라클 => SQL
             --- 자바에서의 실행 여부 확인 => 자바에서 오라클 SQL 문장 정리
     => 오라클 / 자바 => 숙지
        -----------
         자바스크립트
        ----------- 통합해서 사용 (Spring)
          

 */
public class EmpDAO {
	// 오라클 연결
	private Connection conn; // Socket
	// 오라클 SQL 전송 = 결과값 출력
	private PreparedStatement ps;
	// DAO => 사용자당 한개만 생성 => 메모리 최소화
	private static EmpDAO dao;
	// 고정 데이터 : URL (오라클 주소)
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
	// XE => 데이터베이스명 => 모든 테이블이 들어가 있다.
	// => 폴더 (파일 여러개)
	// 자바 12장
	// 1. 드라이버 등록
	public EmpDAO()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 클래스 명으로 메모리 할당
			/*
			 *  1. 생성자
			 *  2. 멤버변수
			 *  3. 메소드 => 매개변수도 처리
			 *  ---------- 제어할 수 있다.
			 *   => 리플렉션 : 스프링 / 메소드를 자동 호출이 가능
			 */
		}catch(Exception ex) 
		{
			ex.printStackTrace();
		}
	}
	// 싱글턴 => 메모리 공간 / 재사용
	// newInstance() / getInstance()
	// Calendar.getInstance()
	public static EmpDAO newInstance()
	{
		if(dao==null)
			dao=new EmpDAO();
		return dao;
	}
	// 오라클 연결
	public void getConnection()
	{
		try
		{
			// SQLplus
			conn=DriverManager.getConnection(URL, "hr", "happy");
		}catch(Exception ex) {}
	}
	// 오라클 닫기
	public void disConnection()
	{
		try
		{
			if(ps!=null) ps.close();
			if(conn!=null) conn.close();
			// exit
		}catch(Exception ex) {}
	}
	// ----------------------------------- 공통 사항
	/*
	 *  DAO =====> 테이블 1개에 대한 제어
	 *   => BoardDAO
	 *   => ReplyDAO
	 *  Service => 관련된 테이블 여러개 제어
	 *   => BoardService : Board/Reply
	 */
	// 1. 기능
	/*
	       사원(사번, 이름, 직위, 입사일, 급여)
	       부서 정보(부서명, 근무지)
	       등급(등급)
	       -------------------------------- 테이블 3개에서 출력에 필요한 데이터 추출
	                                        테이블 추출 : 조인
	 */
	public List<EmpVO> empJoinAllData()
	{
		List<EmpVO> list=new ArrayList<EmpVO>();
		try
		{
			// 1. 연결
			getConnection();
			// 2. 오라클 SQL 문장 보내기
			String sql="SELECT empno, ename, job, hiredate, TO_CHAR(sal,'$999,999'), dname, loc, grade FROM emp, dept, salgrade"
						+"WHERE emp.deptno=dept.deptno AND sal BETWEEN losal AND hisal";
			// 2-1 전송
			ps=conn.prepareStatement(sql);
			// 3. SQL 실행 후에 결과값 메모리에 저장
			ResultSet rs=ps.executeQuery();
			// 4. 커서의 위치 변경 => 첫번째 출력 위치 => rs.next()
			/*
			        1      2     3      4       5     6     7     8  
			      empno, ename, job, hiredate, sal, dname, loc, grade
			      int    String String date    int   String String ind
			 */
			while(rs.next()) // 다음 줄 출력 => 데이터가 없는 경우 false
			{
				EmpVO vo=new EmpVO(); // Record 단위
				vo.setEmpno(rs.getInt(1));
				vo.setEname(rs.getString(2));
				vo.setJob(rs.getString(3));
				vo.setHiredate(rs.getDate(4));
//				vo.setSal(rs.getInt(5));
				vo.setStrSal(rs.getString(5));
				vo.getDvo().setDname(rs.getString(6));
				vo.getDvo().setLoc(rs.getString(7));
				vo.getSvo().setGrade(rs.getInt(8));
				
				list.add(vo);
			}
			rs.close();
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			disConnection();
		}
		return list;
	}
	public EmpVO empFindData(int empno)
	{
		EmpVO vo=new EmpVO();
		try
		{
			// 1. 연결
			getConnection();
			// 2. 오라클 SQL 문장 보내기
			String sql="SELECT empno, ename, job, hiredate, TO_CHAR(sal,'$999,999'), dname, loc, grade FROM emp, dept, salgrade"
						+"WHERE emp.deptno=dept.deptno AND sal BETWEEN losal AND hisal AND empno="+empno;
			// 2-1 전송
			ps=conn.prepareStatement(sql);
			// 3. SQL 실행 후에 결과값 메모리에 저장
			ResultSet rs=ps.executeQuery();
			// 4. 커서의 위치 변경 => 첫번째 출력 위치 => rs.next()
			/*
			        1      2     3      4       5     6     7     8  
			      empno, ename, job, hiredate, sal, dname, loc, grade
			      int    String String date    int   String String ind
			 */
			
				EmpVO vo=new EmpVO(); // Record 단위
				vo.setEmpno(rs.getInt(1));
				vo.setEname(rs.getString(2));
				vo.setJob(rs.getString(3));
				vo.setHiredate(rs.getDate(4));
//				vo.setSal(rs.getInt(5));
				vo.setStrSal(rs.getString(5));
				vo.getDvo().setDname(rs.getString(6));
				vo.getDvo().setLoc(rs.getString(7));
				vo.getSvo().setGrade(rs.getInt(8));
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
