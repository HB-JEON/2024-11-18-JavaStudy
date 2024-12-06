/*
 * 
 *  ** 프로그램은 데이터 관리 
 *             -------
 *              상태 관리 : Vue, React (Front)
 * 
 *  데이터 저장하는 방법
 *   변수 - 데이터 한개 저장 > 데이터 변경 가능
 *          읽기 - 메모리에서 데이터를 가지고오기
 *          쓰기 - 메모리 저장
 *          수정 - 값 수정
 *           > 데이터형 변수명=값;
 *   상수 - 데이터 한개 저장 > 데이터 변경 불가능
 *          읽기 - 메모리에서 데이터를 가지고오기
 *          쓰기 - 메모리 저장
 *           > final 데이터형 변수명=값;
 *             변수 - 소문자로 시작
 *             상수 - 전체 대문자
 *           변수와 상수가 많은 경우 제어가 힘듬
 *   배열 - 변수 여러개를 한개의 이름으로 제어 (관리가 쉬움)
 *          고정적
 *          같은 데이터만 모아서 관리
 *   클래스 - 여러개의 데이터를 저장
 *           원하는 수만큼 저장 가능(유동적)
 *           1) 데이터 모으기 > 한개에 대한 정보
 *               ex) 사람 1명에 대한 변수
 *                   학생 1명에 대한 정보
 *                   영화 정보 1개에 대한 설계 > 저장 공간에 따른 생성
 *              데이터형 클래스
 *              액션 > 변수/메소드
 *               ex)
 *                   학생
 *                   ---
 *                   class 학생 > 20명이라면 20개를 저장하는 공간을 생성
 *                   {
 *                   	이름
 *                   	학번
 *                   	학점
 *                   	주소
 *                   	..
 *                   }
 *                >> new
 *                   다른 데이터형을 모을 수 있다.
 *  -------------- 메모리에 저장
 *   파일
 *   데이터베이스
 *  -------------- 영구적인 저장 장치
 *  
 *  java > 한개의 파일 안에 여러개 클래스를 생성
 *  ** public class > 한 번만 사용 가능
 *  
 *    A.java         
 *    public class A == 저장명
 *    {
 *    }
 *    class B   >  public class 는 1번만 사용 가능
 *    {
 *    }
 *  
 *    A.java / B.java
 *    class A
 *    {
 *    }
 *    class B
 *    {
 *    }
 *  
 *  권장
 *   클래스는 가급적 파일을 따로 생성
 */

class Student
{
	int hakbun;
	String name;
	int age;
}
public class 클래스_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student hong=new Student();
		hong.hakbun=1;
		hong.name="홍길동";
		hong.age=20;
		/*
		   hong > Student@4aa8f0b4
		   -----
		     1 > hakbun
		   -----
		   홍길동 > name
		   -----
		    20 > age
		   -----
		 */
		System.out.println("학번:"+hong.hakbun);
		System.out.println("이름:"+hong.name);
		System.out.println("나이:"+hong.age);
		Student shim=new Student();
		shim.hakbun=2;
		shim.name="심청";
		shim.age=20;
		System.out.println("학번:"+shim.hakbun);
		System.out.println("이름:"+shim.name);
		System.out.println("나이:"+shim.age);
		
		
	}

}
