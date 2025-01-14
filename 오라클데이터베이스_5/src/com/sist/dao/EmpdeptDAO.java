package com.sist.dao;
import java.util.*;
import java.sql.*;
public class EmpdeptDAO {
	private Connection conn;
	private PreparedStatement ps;
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
	private static EmpdeptDAO dao;
	
	public EmpdeptDAO()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception ex) {}
	}
	
	public static EmpdeptDAO newIstance()
	{
		if(dao==null)
			dao=new EmpdeptDAO();
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
	// 일반 SQL 사용
	public void sqlExcute()
	{
		try
		{
			// 1. 연결
			getConnection();
			String sql="SELECT empno, ename, job, hiredate, sal, rank, dname, loc, grade "
					+"FROM (SELECT empno, ename, job, hiredate, sal,"
					+"RANK() OVER(ORDER BY sal DESC) rank,"
					+"dname, loc, grade "
					+"FROM emp, dept, salgrade "
					+"WHERE emp.deptno=dept.deptno "
					+"AND sal BETWEEN losal AND hisal)";
			ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				System.out.println(
					rs.getInt(1)+" "
					+rs.getString(2)+" "
					+rs.getString(3)+" "
					+rs.getDate(4).toString()+" "
					+rs.getInt(5)+" "
					+rs.getInt(6)+" "
					+rs.getString(7)+" "
					+rs.getString(8)+" "
					+rs.getInt(9)
				);
			}
			rs.close();
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}finally
		{
			disConnection();
		}
	}
	// View 사용
	public void viewExcute()
	{
		try
		{
			getConnection();
			String sql="SELECT * FROM empAllData";
		ps=conn.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			System.out.println(
				rs.getInt(1)+" "
				+rs.getString(2)+" "
				+rs.getString(3)+" "
				+rs.getDate(4).toString()+" "
				+rs.getInt(5)+" "
				+rs.getInt(6)+" "
				+rs.getString(7)+" "
				+rs.getString(8)+" "
				+rs.getInt(9)
			);
		}
		rs.close();
	}catch(Exception ex)
	{
		ex.printStackTrace();
	}finally
	{
		disConnection();
	}
		
	}
}
