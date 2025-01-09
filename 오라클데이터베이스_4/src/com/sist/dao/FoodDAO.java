package com.sist.dao;
import java.util.*;
import java.sql.*;
import com.sist.vo.*;
public class FoodDAO {
	private Connection conn;
	private PreparedStatement ps;
	private DataBase db=new DataBase();
	private static FoodDAO dao;
	
	public static FoodDAO newInstance()
	{
		if(dao==null)
			dao=new FoodDAO();
		return dao;
	}
	
	public List<FoodVO> foodListData(int page)
	{
		List<FoodVO> list=new ArrayList<FoodVO>();
		try
		{
			conn=db.getConnection();
			int rowSize=20;
			int start=(rowSize*page)-(rowSize-1);
			int end=rowSize*page;
			/*
			   WHERE num BETWEEN start AND end
			   1page                 1      20
			   2page                21      40
			   3                    41      60
			 */
			String sql="SELECT fno, name, num "
					+ "FROM (SELECT fno, name, rownum as num "
					+ "FROM (SELECT fno, name "
					+ "FROM food_house ORDER BY fno)) "
					+ "WHERE num BETWEEN "+start+" AND "+end;
			ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				FoodVO vo=new FoodVO();
				vo.setFno(rs.getInt(1));
				vo.setName(rs.getString(2));
				list.add(vo);
			}
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}finally
		{
			db.disConnection(conn, ps);
		}
		return list;
	}
}