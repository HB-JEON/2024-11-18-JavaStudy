package com.sist.main;
/*
 * 
 *  자바에서 지원하는 라이브러리
 *                 -------- 프로그램에 필요한 클래스를 모아서 개발 시 사용가능
 *   => 라이브러리 중심 => 조립
 *   => Scanner / System / String...
 *   
 *   => 라이브러리
 *       1. 자바에서 지원
 *          J2SE
 *           java.lnag => 9장
 *             ***Object
 *             System
 *             ***String
 *             StringBuffer
 *             Math
 *             Wrapper - 데이터형을 클래스화
 *             -------
 *              ***integer
 *              ***Double
 *              ***Boolean
 *              Byte
 *              Float
 *              ***Long
 *              ...
 *           java.util => 10장
 *             Scanner
 *             Date / Calendar
 *             Collection
 *             ---------- 배열 대체
 *              List / Set / Map
 *              ---------------- interface
 *               List - ***AraayList, Vector, LinkedList, Stack
 *                                              | Queue
 *               Set - TreeSet / ***HashSet 중복없는 데이터
 *               Map - Hashtable / ***HashMap
 *           java.io => 11장
 *             FileReader / FileWriter
 *             InputStream / OutputStream
 *             BufferedReader / BufferedWriter
 *             BufferedInputStream / BufferedOutputStream
 *             입출력 - 파일 / 메모리 / 네트워크
 *             ~ Stream, Reader/Writer
 *             --------  -------------
 *               1byte     2byte - 한글 포함
 *                 | 네트워크, 파일 업로드/다운로드
 *             File
 *           java.sql => 12장
 *             Connection
 *             Statement
 *             ResultSet
 *           -----------------------
 *           java.net
 *             URL / ServerSocket / Socket
 *           java.text
 *             SimpleDateFormat / MessageFormat / DecimalFormat
 *           java.lang.reflect
 *             리플렉션 - 메소드 / 클래스 / 변수 / 생성자
 *           *** Annotation, 열거형
 *               ----------
 *           웹 라이브러리 - JSP / Servlet / Spring => 2차 자바
 *          
 *          J2ME(X) => Kotlin => Dart(Flutter)
 *          J2EE
 *           -----------------------
 *           javax.swing(X) => 한 번만 사용
 *           ----------------------- 1.0
 *           -> javax.http
 *           -> javax.servlet.http
 *           ----------------------- 2.0
 *           -> org.springframework
 *           
 *           Back End - Java / Oracle / JSP / Spring / Spring-Boot
 *                      ------------------------------------------
 *                              | MyBatis / JPA
 *                                Oracle / MySQL(MariaDB)
 *           Front End - HTML / CSS / JavaScript => TypeScript
 *                       -----------------------
 *                                       | JQuery / VueJS / ReactJS / NodeJS / NextJS
 *                                         ------------------------------------------
 *          1) 데이터 분석 - 파이썬 (넘파이, 판다스, Matplotlib)
 *                          String <=> 파이썬(Django 이용)
 *          2) 검색엔진 - ElasticSearch (CRUD / 검색)
 *           
 *       2. 외부 업체에서 지원 - Jsoup / lombok / Spring...
 *           -> mvnrepository.com
 *              simple-json / bson...
 *       3. 사용자 정의 - 잘 제작된 클래스 / 사용빈도가 높은 클래스
 *           -> .jar
 *              1차 프로젝트 => JSP (MVC->Spring 형식)
 *     
 *  9장
 *   java.lang패키지
 *    1) import 생략 => 자동추가
 *        -> 가장 많이 사용된 라이브러리 (String, System)
 *    2) 대표 클래스
 *        Object - 모든 클래스의 상위 클래스
 *                 --------- Object 상속
 *         public class A extends Object
 *                         -------------- 생략 가능
 *        모든 클래스에서 사용하는 기능(메소드)
 *        ***toString() - 객체 주소
 *           => 명시적 / 묵시적
 *               A a=new A();
 *               -> System.out.println(a.toString())  
 *                  System.out.println(a)
 *           => 자주 사용 / 객체의 값이 정상처리 되었는지 확인
 *           => 객체를 문자열화
 *        ***clone() - 객체를 복제할 경우
 *          => 객체 복사
 *             얕은 복사 => 같은 주소를 이용
 *             ------- Call By Reference
 *             깊은 복사 => clone => 새로운 메모리에 저장
 *             ------- prototype => 게임(아바타)
 *        finalize() - 소멸자 => 메모리 해제 시 자동호출
 *        ---------- System.gc() - 즉시 회수
 *                   프로그램 종료 시 회수
 *        ***equals() => 객체 비교 => 재정의(오버라이딩)
 *        hashCode() => 비교
 *  
 */
class Student
{
	private String name;
	private String phone;
	private String address;
	
	// 접근 가능 => 메소드
	public Student(String name, String phone, String address)
	{
		// 지역변수 / 매개변수
		/*
		 *   1. 지역변수, 매개변수 찾기
		 *   2. 멤버변수 (지역변수, 매개변수 없는 경우)
		 *   
		 *   ***지역변수 우선 순위
		 */
		this.name=name;
		this.phone=phone;
		this.address=address;
	}
	public void print()
	{
		System.out.println("이름:"+name);
		System.out.println("주소:"+address);
		System.out.println("전화:"+phone);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		System.out.println("이름:"+name);
		System.out.println("주소:"+address);
		System.out.println("전화:"+phone);
		return super.toString();
	}
	
	
}
public class 라이브러리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("홍길동", "010-0000-1111", "서울");
		Student s2=new Student("심청이", "010-2222-3333", "경기");
		
		// 객체 출력 시 => toString()을 호출
//		s1.print();
		System.out.println(s1); // 메모리 주소 확인 => 묵시적
//		s2.print();
		System.out.println(s2.toString()); // .toString을 사용 명시적
	}

}
