package com.sist.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
import com.sist.vo.*;
/*
 *   Collection
 *   ----------
 *     => 단순 목록 - ArrayList
 *                   => 수정 / 추가 / 삭제 => 속도 저조
 *                   => 가변형
 *   1. 목록 => 페이지 나누기 => ArrayList
 *   2. 상세보기 => MusicVO
 *                 => 버튼 클릭 => 동영상 실행
 *   3. 검색 => ArrayList
 *   4. 게시판 => LinkedList
 *                => 수정 / 삭제 => 속도 빠름
 *   5. 구매 => Map
 *              => 두개 저장
 *   6. 찜하기 => Set
 *                => 한 사람당 1개
 *    => 프로젝트 - 크롤링 => 오라클
 *   ----------------------------------------
 */
public class MusicDAO {
	// 연결 객체
	private Connection conn;
	// SQL 문장 전송 객체
	private PreparedStatement ps;
	// URL 등록
	private final String URL="jdbc:oracle:thin:@211.238.142.124:1521:XE";
	// 싱글턴 => 열기 / 닫기
	private static MusicDAO dao;
	// => ArrayList
	// 1. 드라이버 등록
	public MusicDAO()
	{
		try
		{
			// ojdbc.jar => 자바 지원 X => 오라클 지원
			// mvnrepository.com
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException ex) {}
	}
	// 2. 오라클 연결
	public void getConnection()
	{
		try
		{
			conn=DriverManager.getConnection(URL, "hr", "happy");
			// 오라클 => conn hr/happy
		}catch(Exception ex) {ex.printStackTrace();}
	}
	// 3. 오라클 닫기
	public void disConnection()
	{
		try
		{
			if(ps!=null) ps.close();
			if(conn!=null) conn.close();
		}catch(Exception ex) {}
	}
	/*
	 *   데이터베이스 사용 시 공통 기반
	 *   DAO는 사용자 당 1개만 사용 가능하게 생성
	 *   ----------------------------------
	 *    => 싱글턴
	 *   
	 *   디자인 패턴
	 *    => 싱글턴 => static
	 *    => 팩토리 패턴 => map
	 *    => MV 패턴 => JSP(Java+HTML)
	 *       -------       --------- Java => model
	 *                               HTML => View
	 *    => MVC 패턴 
	 *       -------
	 *    => Observer
	 *    => prototype
	 *    
	 *    문법 => 형식
	 *    응용
	 *    디자인 패턴 / 알고리즘
	 */
	public static MusicDAO newInstance()
	{
		if(dao==null)
			dao=new MusicDAO();
		return dao;
	}
	// 4. 뮤직 목록 출력
	// 5. 뮤직 상세보기
	// 6. 뮤직 검색
	// DAO => 공용 (웹, 윈도우, 애플리케이션)
	// return selectList(sql)
	public List<MusicVO> musicFindData(String fd)
	{
		List<MusicVO> list=new ArrayList<MusicVO>();
		try 
		{
			// 오라클 연결
			getConnection();
			// 오라클 전송 문장
			String sql="SELECT mno,title,singer,album,poster "+"FROM genie_music "+"WHERE title LIKE '%'||?||'%'"; // contains() => LIKE => REGEXP_LIKE
			// SQL 전송
			ps=conn.prepareStatement(sql);
			// ? 값 채우기
			ps.setString(1, fd);
			// 실행 후 결과 값 가져오기
			ResultSet rs=ps.executeQuery();
			// List 값 채우기
			while(rs.next()) // 처음부터 마지막까지 읽어오기
			{
				// 한줄 씩 읽어옴
				MusicVO vo=new MusicVO();
				vo.setMno(rs.getInt(1));
				vo.setTitle(rs.getString(2));
				vo.setSinger(rs.getString(3));
				vo.setAlbum(rs.getString(4));
				vo.setPoster(rs.getString(5));
				list.add(vo);
			}
			rs.close();
		}catch(Exception ex)
		{
			// 에러 확인
			ex.printStackTrace();
		}
		finally
		{
			disConnection();
		}
		return list;
	}
	// 동영상 키
	public String getKey(int mno)
	{
		String key="";
		try
		{
			// 연결
			getConnection();
			// SQL 문장 제작
			// DISTINCT => 중복 제거
			String sql="SELECT DISTINCT key FROM genie_music "+"WHERE mno="+mno;
			// 오라클로 SQL 전송
			ps.getConnection().prepareStatement(sql);
			// 실행 후 결과 값 받기
			ResultSet rs=ps.executeQuery();
			// 값 채운 후 대기
			rs.next();
			key=rs.getString(1);
			rs.close();
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			disConnection();
		}
		return key;
	}
}
