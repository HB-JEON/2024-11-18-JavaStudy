package com.sitst.exception;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.xml.crypto.NoSuchMechanismException;

// Class.forName() => ClassNotFoundException
// CheckException => 반드시 예외처리 후 사용
// 메모리 할당
class Movie
{
	public void display()
	{
		System.out.println("Movie:display() Call...");
	}
}
public class 예외처리_메모리할당_리플렉션 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Movie m=new Movie();
//		md.display();
		try
		{
			Class clsName=Class.forName("com.sist.exception.Movie");
			// 클래스 정보 읽기
			Object obj=clsName.getDeclaredConstructor().newInstance();
			
			Method[] methods=clsName.getDeclaredMethods();
			
			methods[0].invoke(obj, null);
		}catch(Exception e) {}
//		catch(ClassNotFoundException ex) {}
//		catch(NoSuchMechanismException e) {}
//		catch(InvocationTargetException e) {}
		
	}

}
