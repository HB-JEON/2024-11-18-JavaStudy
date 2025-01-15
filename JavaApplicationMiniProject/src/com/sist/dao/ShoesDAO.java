package com.sist.dao;
import java.util.*;
import java.sql.*;
public class ShoesDAO {
	private Connection conn;
	private PreparedStatement ps;
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
	private static ShoesDAO dao;
	
	public ShoesDAO()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception ex) {}	
	}
	public static ShoesDAO newInstance()
	{
		if(dao==null)
			dao=new ShoesDAO();
		return dao;
	}
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
	// 크롤링 데이터 추가해야함
	public void ShoesInsert(ShoesVO vo)
	{
		try
		{
			getConnection();
			String sql="INSERT INTO detail "
					+ "VALUES((SELECT NVL(MAX(mno)+1, 1) FROM detail), "
					+ "?, ?, ?, ?, ?, ?, ?";
			ps=conn.prepareStatement(sql);
			ps.setString(1, vo.getName());
			ps.setString(2, vo.getImage());
			ps.setInt(3, vo.getSale_price());
			ps.setInt(4, vo.getPrice());
			ps.setString(5, vo.getBrand());
			ps.setInt(6, vo.getD_size());
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}finally
		{
			disConnection();
		}
	}
}
