package com.sist.main;
import java.io.*;
import java.util.*;
public class IO_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectInputStream ois=null;
		// 역직렬화 => 객체 단위로 원상 복귀
		try
		{
			FileInputStream fis=new FileInputStream("c:\\java_data\\sawon_info.txt");
			ois=new ObjectInputStream(fis);
			List<Sawon> list=(List<Sawon>)ois.readObject();
			// List<Sawon> => 데이터형으로 인식
			for(Sawon sa:list)
			{
				System.out.println(sa.getSabun()+" "
						+sa.getName()+" "
						+sa.getDept()+" "
						+sa.getJob()+" "
						+sa.getPay());
			}
		}catch(Exception ex)
		{
			
		}
		finally
		{
			try
			{
				ois.close();
			}catch(Exception ex) {}
		}
	}

}
