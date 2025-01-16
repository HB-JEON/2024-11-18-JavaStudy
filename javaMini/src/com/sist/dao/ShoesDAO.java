package com.sist.dao;
import java.util.*;
import java.sql.*;
import com.sist.vo.*;
public class ShoesDAO {
	private Connection conn;
	private PreparedStatement ps;
	private static ShoesDAO dao;
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
	
	public ShoesDAO()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch (Exception ex) {}
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
			conn=DriverManager.getConnection(URL,"hr_3","happy");
		}catch (Exception ex) {}
	}
	public void disConnection()
	{
		try
		{
			if(ps!=null) ps.close();
			if(conn!=null) conn.close();
		}catch (Exception ex) {}
	}
	public List<ShoesVO> ShoesListData(int page)
	{
		List<ShoesVO> list = new ArrayList<ShoesVO>();
		try
		{
			getConnection();
			String sql="SELECT goods_id,name_kr,img, num "
					+ "FROM (SELECT goods_id, name_kor, img, rownum as num "
					+ "FROM (SELECT /*+ INDEX_ASC(shoes sh_goods_id_pk)*/goods_id, name_kor, img"
					+ "FROM shoes))"
					+ "WHERE goods_id BETWEEN ? AND ?";
			ps=conn.prepareStatement(sql);
			int rowSize=12;
			int start=(rowSize*page)-(rowSize-1);
			int end=rowSize*page;
			
			ps.setInt(1, start);
			ps.setInt(2, end);
			
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				ShoesVO vo=new ShoesVO();
				vo.setGoods_id(rs.getInt(1));
				vo.setName_kor(rs.getString(2));
				vo.setImg(rs.getString(3));
				list.add(vo);
			}
		   rs.close();

		}catch (Exception ex) {
			ex.printStackTrace();
		}
		finally
		{
			disConnection();
		}
		return list;
	}
	public int shoesTotalPage()
	{
		int total=0;
		try
		{
			getConnection();
			String sql="SELECT CEIL(COUNT(*)/12.0) FROM shoes";
			ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			rs.next();
			total=rs.getInt(1);
			rs.close();
		}catch (Exception ex) {
			ex.printStackTrace();
		}
		finally
		{
			disConnection();
		}
		return total;
	}
}
