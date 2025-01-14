package com.sist.dao;
import java.util.*;

import javax.swing.ListSelectionModel;

import java.sql.*;
import com.sist.vo.*;
public class FreeBoardDAO {
	// 오라클 연결 객체
	private Connection conn;
	// 오라클 송수신 담당 (송신(SQL문장) / 수신(실행결과 값))
	private PreparedStatement ps;
	// 오라클 주소 => 고정 (상수)
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
	// 객체를 한 번만 생성해서 재사용 (메모리 절약)
	// Connection 객체 수를 조절 => 50명
	// 싱글턴
	private static FreeBoardDAO dao;
	
	// 1. 드라이버 등록
	public FreeBoardDAO()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception ex) {}
	}
	// 2. 오라클 연결
	public void getConnection()
	{
		try
		{
			conn=DriverManager.getConnection(URL, "hr", "happy");
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	// 3. 오라클 해제
	// 윈도우 / 명령프롬프트 / 웹 / React / Vue ... 상관없이 전부 사용
	// ----------------------- 오라클 연동 불가능 <=> 자바
	//						   웹의 85%
	public void disConnection()
	{
		try
		{
			if(ps!=null) ps.close();
			if(conn!=null) conn.close();
		}catch(Exception ex) {}
	}
	// 4. 싱글턴 생성
	// ============================== 필수 조건
	/*
	 *  Back-End : DB 연동, AI
	 */
	public static FreeBoardDAO newInstance()
	{
		if(dao==null)
			dao=new FreeBoardDAO();
		return dao;
	}
	// 기능
	// 1. 목록 (페이징 기법) => 인라인뷰
	public List<FreeBoardVO> boardListData(int page)
	{
		List<FreeBoardVO> list=new ArrayList<FreeBoardVO>();
		try
		{
			// 1. 오라클 연결
			getConnection();
			// 2. SQL문장 제작
			String sql="SELECT no, subject, name, regdate, hit, num "
					+"FROM (SELECT no, subject, name, regdate, hit, rownum as num "
					+"FROM (SELECT no, subject, name, regdate, hit "
					+"FROM freeboard ORDER BY no DESC)) "
					+"WHERE num BETWEEN ? AND ?";
			// 페이지 나누는 방법 => 인라인뷰 => ROWNUM
			ps=conn.prepareStatement(sql);
			// 실행 전에 ? 값 채우기
			int rowSize=10;
			int start=(rowSize*page)-(rowSize-1);
			// ROWNUM은 1부터 시작
			int end=rowSize*page;
			// 1page => 10, 2page => 20 ...
			ps.setInt(1, start);
			ps.setInt(2, end);
			// 실행 후에 결과 값을 불러오기
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				FreeBoardVO vo=new FreeBoardVO();
				vo.setNo(rs.getInt(1));
				vo.setSubject(rs.getString(2));
				vo.setName(rs.getString(3));
				vo.setRegdate(rs.getDate(4));
				vo.setHit(rs.getInt(5));
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
	// 1-1. 총 페이지 구하기
	public int boardTotalPage()
	{
		int total=0;
		try 
		{
			getConnection();
			String sql="SELECT CEIL(COUNT(*)/10.0) FROM freeboard";
			// 총 페이지 구하기
			ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			rs.next();
			total=rs.getInt(1);
			rs.close();
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			disConnection();
		}
		return total;
	}
	// 2. 상세보기 => WHERE => PRIMARY KEY 값을 넘겨준다.
	//    게시물 번호 => 자동 증가
	public FreeBoardVO boardDetailData(int no)
	{
		FreeBoardVO vo=new FreeBoardVO();
		try
		{
			// 한개의 기능 수행시 => SQL 문장 어려개를 한번에 처리 가능
			// 서브쿼리는 SELECT
			// 연결
			getConnection();
			// 조회수 증가
			String sql="UPDATE freeboard SET "
					+ "hit=hit+1 "
					+"WHERE no="+no;
			ps=conn.prepareStatement(sql);
			// 실행 명령
			ps.executeUpdate();
			/*
			 *   executeQuery() => 데이터 검색 SELECT
			 *   executeUpdate() => 데이터 변경 INSERT / UPDATE / DELETE 
			 *   ----------------------------------------------------- COMMIT()
			 *   JAVA => AUTOCOMMIT()
			 */
			sql="SELECT no, name, subject, content, regdate, hit "
					+"FROM freeboard "
					+"WHERE no="+no;
			ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			rs.next(); // 한 번만 수행
			// 값 채우기
			vo.setNo(rs.getInt(1));
			vo.setName(rs.getString(2));
			vo.setSubject(rs.getString(3));
			vo.setContent(rs.getString(4));
			vo.setRegdate(rs.getDate(5));
			vo.setHit(rs.getInt(6));
			rs.close();
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}finally
		{
			disConnection();
		}
		return vo;
	}
	// 3. 글 쓰기 => INSERT
	public void boardInsert(FreeBoardVO vo)
	{
		// 리턴형 / 매개변수
		try
		{
			getConnection();
			// hit=0, regdate=SYSDATE
			// PRIMARY KEY => 자동 증가번호
			// SELECT MAX()+1
			// SEQUENCE : fb_no_seq.nextval
			String sql="INSERT INTO freeboard(no, name, subject, content, pwd) "
					+"VALUES(fb_no_seq.nextval, ?, ?, ?, ?)";
			ps=conn.prepareStatement(sql);
			ps.setString(1, vo.getName());
			ps.setString(2, vo.getSubject());
			ps.setString(3, vo.getContent());
			ps.setString(4, vo.getPwd());
			// 실행
			ps.executeUpdate();
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}finally
		{
			disConnection();
		}
	}
	// 4. 수정 => UPDATE => 비밀번호 검사 
	// 1) 수정 데이터 읽기 (이전)
	public FreeBoardVO boardUpdateData(int no)
	{
		// 한개의 게시물 읽기 / 맛집 /상품 /영화 => PRIMARY KEY
		FreeBoardVO vo=new FreeBoardVO();
		// VO는 게시물 한개에 대한 모든 데이터를 보유
		// 한개 찾기 => VO => 중복 없는 데이터
		// 여러개 찾기 (검색) => List<VO> => 검색어 => LIKE
		try
		{
			getConnection();
			String sql="SELECT no, name, subject, content "
					+ "FROM freeboard "
					+ "WHERE no="+no;
			ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			rs.next();
			vo.setNo(rs.getInt(1));
			vo.setName(rs.getString(2));
			vo.setSubject(rs.getNString(3));
			vo.setContent(rs.getString(4));
			rs.close();
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}finally
		{
			disConnection();
		}
		return vo;
		
	}
	// 2) 실제 수정
	public boolean boardUpdate(FreeBoardVO vo)
	{
		boolean bCheck=false;
		try
		{
			// 1. 연결
			getConnection();
			// 2. SQL => 비밀번호 읽기
			String sql="SELECT pwd FROM freeboard "
					+ "WHERE no="+vo.getNo();
			ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			rs.next();
			String db_pwd=rs.getString(1);
			rs.close();
			
			if(db_pwd.equals(vo.getPwd()))
			{
				bCheck=true;
				sql="UPDATE freeboard SET "
						+"name=?, subject=?, content=? "
						+"WHERE no=?";
				ps=conn.prepareStatement(sql);
				ps.setString(1, vo.getName());
				ps.setString(2, vo.getSubject());
				ps.setString(3, vo.getContent());
				ps.setInt(4, vo.getNo());
				// 실행
				ps.executeUpdate();
			}
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}finally 
		{
			disConnection();
		}
		return bCheck;
	}
	// 5. 삭제 => DELETE => 비밀번호 검사
	public boolean boardDelete(int no, String pwd)
	{
		boolean bCheck=false;
		try
		{
			// 1. 연결
			getConnection();
			// 2. SQL문장 제작
			String sql="SELECT pwd FROM freeboard "
					+ "WHERE no="+no;
			// SQL문장 전송
			ps=conn.prepareStatement(sql);
			// 결과값 가져오기
			ResultSet rs=ps.executeQuery();
			rs.next();
			String db_pwd=rs.getString(1);
			rs.close();
			
			if(db_pwd.equals(pwd))
			{
				bCheck=true;
				sql="DELETE FROM freeboard "
						+ "WHERE no="+no;
				ps=conn.prepareStatement(sql);
				ps.executeUpdate();
			}
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}finally
		{
			disConnection();
		}
		return bCheck;
	}
	// 6. 검색 => LIKE
	public List<FreeBoardVO> boardFindData(String col, String fd)
	{
		// 이름 / 제목 / 내용
		// col = name, content, subject
		List<FreeBoardVO> list=new ArrayList<FreeBoardVO>();
		try
		{
			getConnection();
			String sql="SELECT no, subject, name, regdate, hit "
					+"FROM freeboard "
					+"WHERE "+col+" LIKE '%'||?||'%'";
			// 							 '%"+fd+"%'";
			// ? => setString(1, '홍길동')
			//      --------- '홍길동'
			ps=conn.prepareStatement(sql);
			ps.setString(1, fd);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				FreeBoardVO vo=new FreeBoardVO();
				vo.setNo(rs.getInt(1));
				vo.setSubject(rs.getString(2));
				vo.setName(rs.getString(3));
				vo.setRegdate(rs.getDate(4));
				vo.setHit(rs.getInt(5));
				list.add(vo);
			}
			rs.close();
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}finally
		{
			disConnection();
		}
		return list;
	}
	// 6-1.
	public int boardFindCount(String col, String fd)
	{
		int count=0;
		List<FreeBoardVO> list=new ArrayList<FreeBoardVO>();
		try
		{
			getConnection();
			String sql="SELECT COUNT(*) "
					+"FROM freeboard "
					+"WHERE "+col+" LIKE '%'||?||'%'";
			// 							 '%"+fd+"%'";
			// ? => setString(1, '홍길동')
			//      --------- '홍길동'
			ps=conn.prepareStatement(sql);
			ps.setString(1, fd);
			ResultSet rs=ps.executeQuery();
			rs.next();
			count=rs.getInt(1);
			rs.close();
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}finally
		{
			disConnection();
		}
		return count;
	}
	// ------------------------------- CRUD
}
