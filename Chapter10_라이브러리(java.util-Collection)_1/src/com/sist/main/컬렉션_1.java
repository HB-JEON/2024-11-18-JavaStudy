package com.sist.main;
/*
 * 
 *  335 page
 *   자바 컬렉션
 *   ---------
 *    1. 프로그램 => 데이터관리(효율적)
 *                  --------------
 *                   1) 스프링/JSP(MVC) => 데이터관리
 *                       => 데이터베이스(오라클,MySql) 
 *                   2) VueJS/React/Next/Node
 *                       => 상태관리(데이터 변경마다)
 *    2. 데이터베이스 - 데이터를 저장하는 공간
 *       ----------
 *        변수/상수 => 데이터 한개 저장 후 관리 => 데이터가 많아지면 관리가 어려움
 *       ----------
 *        배열 => 고정적 - 데이터가 증가되면 다른 배열 생성
 *       ----------
 *        *** => 가변적 - 데이터가 증가되면 자동으로 메모리 공간 확장
 *               컬렉션
 *       -----------------> 메모리 공간(데이터가 사라진다)
 *       ----------
 *        파일 => 종속적 - 다른 파일을 연결해서 사용이 어려움
 *       ----------
 *        RDBMS => 오라클(관계형 데이터베이스 => 연결성) 
 *       ----------
 *        => 웹에서 가장 많이 사용되는 클래스 - ArrayList / String / Integer
 *        => ArrayList는 데이터를 메모리에 저장 후 브라우저 전송
 *        => 웹은 대부분 Map 형식으로 생성
 *            request / response / session / cookie
 *             | 요청     | 응답     | 서버 저장  | 브라우저 저장
 *             
 *    1. Collection 개요
 *        => 배열의 담점을 보완한 클래스 (고정 => 가변)
 *           ----------------------
 *        데이터를 효율적으로 저장하고 관리하기 위한 라이브러리
 *        표준화가 되어있다(모든 개발자가 같은 메소드를 사용)
 *        ----
 *         개발이 쉽다
 *         프레임 워크 => 개별 형식 통일(분석 => 가독성)
 *         --------- Spring / React / JQuery / VueJS...
 *                   MyBatis / JPA
 *                   장바구니 / 예약
 *                   ------------ 오라클 / Session / Cookie
 *        컬렉션 저장 => Object 저장(객체만 저장)
 *                     ----------
 *                      최상위 데이터형 => 항상 형변환
 *                                      ----------
 *                       예)
 *                           class Sawon
 *                            => ArrayList list=new ArrayList()
 *                               list.add(new Sawon())
 *                                    add(Object o)
 *                               => s=list.get(0); => 오류 발생
 *                                  Sawin s=(Sawon)list.get(0) => 정상 작동
 *                                    Object get()
 *                               => int a=(int)10.0
 *                               
 *    2. Collection 종류
 *                         Iterable
 *                            |
 *                        Collection
 *            |--------------|--------------|  
 *          List            Set            Map => interface 
 *           |               |              |
 *        ArrayList        HashSet        HashMap
 *        Vector           TreeSet        Hashtable
 *        LinkedList                        |
 *           |                            Properties
 *          Queue                         ----------
 *                                          | XML
 *       *** List => 337 page
 *             1) 순서가 존재(자동으로 인덱스를 설정)
 *                                  ----- 0
 *                list.add(1) = 0
 *                ###list.add(2) = 1
 *                list.add(3) = 2
 *             
 *                list.add(1) = 0
 *                list.add(3) = 1   => 인덱스 번호는 자동으로 조절
 *                                     0부터 순처즉올 유지    
 *             2) 데이터 중복 허용
 *             3) 가장 많이 사용되는 컬렉션
 *             4) 비동기적인 방식
 *                 => 데이터베이스(오라클)
 *             5) 단점 - 데이터가 많은 경우 추가/삭제 시 속도가 느림    
 *                       추가 시 마지막에 추가하는 것을 권장
 *           Vector => 보완(ArrayList)
 *            => 동기적 -> 네트워크 사용자 정보를 저장
 *           LinkedList
 *            => 데이터에 접근하는 속도가 늦다
 *               추가/삭제가 빠름
 *               게시판
 *           ==============> List 인터페이스 구현(메소드가 동일)
 *            List list=new ArrayList() - 데이터베이스 연동
 *            list=new LinkedList() - 파일연동
 *            list=new Vector() - 네트워크에 주로 사용
 *                                          
 *    3. 제네릭스
 *    4. 활용 => 크롤링 / 중복 제거 / ArrayList와 ArrayList
 *                                 --------------------
 *                                  1) 교집합 2) 차집합 3) 합집합 => 멜론/지니뮤직
 *                                     |                  | 중복제거
 *                                     | Intersect, Minus, Union
 *                                         
 *                          ArrayList        LinkedList  
 *        ---------------------------------------------
 *         데이터 속도           빠름              느림
 *         데이터(추가/삭제)      느림              빠름
 *         메모리 사용           효율적           비효율적
 *         구조                배열기반       연결리스트 기반
 *                                          C언어 개발자 => 자바ㄱ
 *         
 *                     --------
 *                      객체주소
 *                     --------             ------------
 *                                           이전 객체주소
 *                                          ------------
 *                                           데이터
 *                                          ------------
 *                                           다음 객체주소
 *                                          ------------
 *   341 page                                       
 *    ArrayList 주요 메소드
 *     1) 데이터 추가
 *         *** add(Object obj) => 마지막 추가
 *         add(int index, Object obj) => 원하는 인데스에 추가
 *     2) 저장된 갯수 - in size()
 *     3) 데이터 추출 => Object get(int index)
 *     4) 데이터 삭제 => remove(int index)
 *     5) 데이터 수정 => set(int index, Object obj)
 *     ==> CRUD - 자료 구조(효율적 사용) 프로그램
 *         import 사용
 *          java.utill.ArrayList
 *         List => 구현한 클래스 변경이 쉽게 인터페이스 이용
 *         ---- MyBatis/JPA
 *         단점 - 형변환
 *               Object - 최상위 클래스 / 데이터형 중 가장 큰 데이터형
 *          예)
 *              Object obj=1;
 *              obj=0.1;
 *              obj="aaa";
 *              obj='A';
 *              obj=new A();
 *              ---------------> 원하는 데이터형으로 변경
 *                               --------------------
 *                                데이터형을 Object 가 아닌 데이터형으로 이용
 *                                제네릭스 => 338 page                                 
 * 
 */
// ArrayList 사용법
import java.util.*;
public class 컬렉션_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 경고 => 제네릭스 사용 => 모든 return / 매개변수가 Object
		ArrayList list=new ArrayList();
		// 추가
		list.add("홍길동"); // 0
		list.add("심청이"); // 1
		list.add("강감찬"); // 2
		list.add("박문수"); // 3
		list.add("춘향이"); // 4
		
		System.out.println("현재 등록된 인원의 수 : "+list.size());
		// 출력
		for(int i=0;i<list.size();i++)
		{
			String name=(String)list.get(i);
			System.out.println(i+"."+name);
		}
		System.out.println("====== 원하는 위치에 데이터 추가 ======");
//		list.add("홍길동"); // 0
//		list.add("심청이"); // 1
//		 ==> 추가
//		list.add("강감찬"); // 2
//		list.add("박문수"); // 3
//		list.add("춘향이"); // 4
		list.add(2,"이순신");
		System.out.println("현재 등록된 인원 : "+list.size());
		for(int i=0;i<list.size();i++)
		{
			String name=(String)list.get(i);
			System.out.println(i+"."+name);
		}
		
		System.out.println("====== 원하는 위치에 데이터 삭제 ======");
		list.remove(1);
		System.out.println("현재 등록된 인원 : "+list.size());
		for(int i=0;i<list.size();i++)
		{
			String name=(String)list.get(i);
			System.out.println(i+"."+name);
		}
		// 인덱스 번호는 자동 처리
		//  => 오라클은 자동처리 X(출력)
		
		System.out.println("====== 원하는 위치에 데이터 수정 ======");
		list.set(2, "심청이 수정");
		System.out.println("현재 등록된 인원 : "+list.size());
		for(int i=0;i<list.size();i++)
		{
			String name=(String)list.get(i);
			System.out.println(i+"."+name);
		}
		
		System.out.println("====== 전체 삭제 ======");
		list.clear();
		System.out.println();
		System.out.println("현재 등록된 인원 : "+list.size());
		
		System.out.println("====== 데이터 존재 여부 ======");
		// isEmpty() => 장바구니
		if(list.isEmpty())
		{
			System.out.println("저장 공간에 데이터가 없다.");
		}
		else
		{
			System.out.println("저장 공간에 데이터가 있다.");
		}
		
		/*
		 *    메소드
		 *     1) 데이터 추가 => add()
		 *     2) 데이터 개수 => size()
		 *     3) 데이터 읽기 => get(int index)
		 *     4) 데이터 수정 => set(int index, 데이터)
		 *     5) 데이터 삭제 => remove(int index)
		 *     6) 데이터 존재 여부 => isEmpty()
		 *     7) 데이터 전체 삭제 => clear()
		 */
	}

}
