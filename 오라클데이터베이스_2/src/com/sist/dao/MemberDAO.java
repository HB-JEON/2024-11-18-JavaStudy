package com.sist.dao;
import java.util.*;
import com.sist.vo.*;
import java.sql.*;
// 로그인 처리 => COUNT
// 회원가입
// JDBC => DBCP => ORM (MyBatis, Hibernate, JPA)
public class MemberDAO {
	private Connection conn;
	private PreparedStatement ps;
	private final String URL="jdbc:oracle:thin:@localhst:1521:XE";
	private static MemberDAO dao;
	
	public MemberDAO()
	{
		try
		{
			// ojdbc8.jar
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception ex) {}
	}
	public static MemberDAO newInstance()
	{
		if(dao==null)
			dao=new MemberDAO();
		return dao;
	}
	public void getConnection()
	{
		try
		{
			conn=DriverManager.getConnection(URL,"hr","happy");
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
	///////////////////////////////////// 오라클 연결에 필수 사항
	// 기능처리
	// COUNT(*) => 로그인
	public MemberVO isLogin(String id, String pwd)
	{
		MemberVO vo=new MemberVO();
		try
		{
			// 1. 연결
			getConnection(); // conn hr/happy
			// 2. SQL 문장 전송
			String sql="SELECT COUNT(*) FROM Member WHERE id=?";
			// 0 (아이디가 없는 경우) / 1 (아이디가 존재하는 경우)
			ps=conn.prepareStatement(sql);
			// ? 값 채우기
			ps.setString(1, id); // hong
			// 실행 후 결과값 출력
			ResultSet rs=ps.executeQuery();
			int count=rs.getInt(1);
			rs.close();
			if(count==0)
			{
				vo.setMsg("NO ID");
			}
			else
			{
				sql="SELECT pwd, name, sex, address, FROM member WHERE id=?";
				ps.getConnection().prepareStatement(sql);
				ps.setString(1, id);
				rs=ps.executeQuery();
				rs.next();
				String db_pwd=rs.getString(1);
				String name=rs.getString(2);
				String sex=rs.getString(3);
				String address=rs.getString(4);
				rs.close();
				
				if(db_pwd.equals(pwd))
				{
					vo.setMsg("OK");
					vo.setName(name);
					vo.setSex(sex);
					vo.setName(name);
					// HttpSession 저장
				}
				else
				{
					vo.setMsg("NO PWD");
				}
			}
		}catch(Exception ex)
		{
			// 오류 처리
			ex.printStackTrace();
		}finally
		{
			// 오라클 닫기
			disConnection();
		}
		return vo;
	}
}
