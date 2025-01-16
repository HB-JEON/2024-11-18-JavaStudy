package com.sist.dao;
// 로그인 처리 / 회원 가입 / 회원 탈퇴 / 회원 수정
import java.sql.*;
import com.sist.vo.*;
public class MemberShipDAO {
	private Connection conn;
	private PreparedStatement ps;
	private static MemberShipDAO dao;
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
	
	// 드라이버 등록
	public MemberShipDAO()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch (Exception ex) {}
	}
	// WEB => JDBC => DBCP
	// JDBC => 연결 / 닫기 => 연결에 시간 소모가 많다
	//  => 미리 연결한 후에 사용 => 재사용(반환) => WEB에서 일반화
	// 2. 연결
	public static MemberShipDAO newInstance()
	{
		if(dao==null)
			dao=new MemberShipDAO();
		return dao;
	}
	// 3. 열기
	public void getConnection()
	{
		try
		{
			conn=DriverManager.getConnection(URL, "hr_3", "happy");
		}catch(Exception ex) {}
	}
	// 4. 닫기
	public void disConnection()
	{
		try
		{
			if(ps!=null) ps.close();
			if(conn!=null) conn.close();
		}catch(Exception ex) {}
	}
	// 기능
	// 1. 로그인
	public MemberShipVO isLogin(String id, String pwd)
	{
		MemberShipVO vo=new MemberShipVO();
		try
		{
			getConnection();
			// SQL문장 전송 => ID 존재 여부 확인
			String sql="SELECT COUNT(*) FROM membership "
					+ "WHERE id=?";
			ps=conn.prepareStatement(sql);
			ps.setString(1, id);
			ResultSet rs=ps.executeQuery();
			rs.next();
			int count=rs.getInt(1);
			rs.close();
			
			if(count==0) // ID를 보유하지 않은 상태
			{
				vo.setMsg("NO ID");
			}
			else // ID를 보유한 상태
			{
				// 비밀번호 확인
				sql="SELECT id, pwd, name, sex FROM membership "
						+ "WHERE id=?";
				ps=conn.prepareStatement(sql);
				// 실행 전에 ? 값 채우기
				ps.setString(1, id);
				// 결과 값
				rs=ps.executeQuery();
				rs.next(); // 한줄(RECORD)씩 읽어오기
				vo.setId(rs.getString(1));
				vo.setName(rs.getString(3));
				vo.setSex(rs.getString(4));
				String db_pwd=rs.getString(2);
				
				// 비밀번호 검사
				if(db_pwd.equals(pwd)) // 로그인
				{
					vo.setMsg("OK");
				}
				else // 비밀번호를 틀린 상태
				{
					vo.setMsg("NO PWD");
				}
			}
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}finally
		{
			disConnection();
		}
		return vo;
	}
	// 2. 회원가입
	// 3. 회원수정
	// 4. 회원 탈퇴
}