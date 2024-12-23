package com.sist.main;
import java.util.*;
public class 컬렉션_5_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<String> names=new ArrayList<String>();
//		
//		names=new LinkedList<String>();
//		
//		names=new Vector<String>();
//		
		// 인터페이스 => MyBatis / JPA => 리턴형 => List
		// 데이터를 모은 후 순차적으로 접근 => 크롤링
		List<String> list=new ArrayList<String>();
		list.add("Java");
		list.add("Oracle");
		list.add("HTML/CSS");
		list.add("JavaScript");
		list.add("JSP"); // Jquery / Ajeax
		list.add("Spring"); // VueJS
		list.add("Python"); // Numpy / pandas / MatplotLib
		list.add("ElasticSearch");
		list.add("AWS");
		
		for(String subject:list)
		{
			System.out.println(subject);
		}
		for(String subject:list)
		{
			System.out.println(subject);
		}
		System.out.println("=================");
			// 데이터를 모아서 순차적으로 출력
//			Iterator<String> iter=list.iterator();  // - Set/Map
//			while(iter.hasNext())
//			{
//				System.out.println(iter.next());
//				// next() 데이터를 읽어 온다
//			}
			ListIterator<String> iter=list.listIterator();
			while(iter.hasNext()) // 위 => 아래
			{
				System.out.println(iter.next());
				// next() 데이터 읽어오기
			}
			System.out.println("=================");
			while(iter.hasPrevious()) // 아래 => 위
			{
				System.out.println(iter.previous());
			}
			// next() 종료 시 2번 읽지 못함
//			while(iter.hasNext())
//			{
//				System.out.println(iter.next());
//				// next() 데이터 읽어오기
//			}	
		}
	}
