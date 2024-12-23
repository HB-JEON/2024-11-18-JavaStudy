package com.sist.main;
/*
 * 
 *  멜론 / 지니뮤직
 *  ------------- 따로 저장
 *   => JOIN = 교집합
 *   => UNION = 합집합
 *   => MINUS = 차집합
 *   ----------------
 *   
 *  컬렉션 - 배열의 단점을 보완
 *          고정 => 가변
 *          모든 개발자가 동일한 메소드를 이용 => 표준화
 *          가독성 / 처리 기능이 편리
 *  
 *   List - ArrayList / Vector / LinkedList
 *    => 순서가 존재 (인덱스)
 *       데이터의 중복을 허용
 *   Set - HashSet / TreeSet
 *    => 순서 X
 *       데이터 중복 허용 X
 *   Map - HashMap / HashTable
 *    => 두 개를 동시에 저장 (키, 값)
 *        => 키는 중복 X / 값은 중복 O
 *           웹 => 클래스 관리자
 *           HttpServletRequest
 *           HttpServletResponse
 *           HttSession
 *           Cookie
 *           -------------------- Map
 *            => Spring / MyBatis
 *           login.jsp?id=aaa&pwd=1234
 *                     ---    ----
 *                     getParameter("id") => aaa
 *   ArrayList
 *    => 복사
 *       addAll()
 *    => 순차적으로 출력
 *       iterator()
 *       listIterator
 *       => 출력이 어려운 경우
 *    => Set <=> 복사가 가능
 *    
 *    => ArrayList
 *       단순한 목록형 데이터를 관리하기 용이
 *       ---------------- 데이터베이스(오라클)   
 *        | 추가/삭제/수정
 *          ------------
 *           => LinkedList               
 * 
 */
import java.util.*;

import org.xml.sax.HandlerBase;
public class ArrayList_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("홍길동");
		list.add("박문수");
		list.add("강감찬");
		list.add("심청이");
		list.add("홍길동");
		list.add("박문수");
		// 중복된 데이터 첨부 가능
		for(String name:list)
		{
			System.out.println(name);
		}
		System.out.println("===== 복사 =====");
//		ArrayList<String> list2=new ArrayList<String>();
//		list2.addAll(list);
//		
//		for(String name:list2)
//		{
//			System.out.println(name);
//		}
		// => 코딩 테스트
		Set set=new HashSet();
		set.addAll(list);
		// 중복 허용 X => 순차적(X) 관리가 어려움
		// Set(중복 제거) => ArrayList 이동
		
		ArrayList<String> list2=new ArrayList<String>();
		list2.addAll(set);
		for(String name:list2)
		{
			System.out.println(name);
		}
	}

}
