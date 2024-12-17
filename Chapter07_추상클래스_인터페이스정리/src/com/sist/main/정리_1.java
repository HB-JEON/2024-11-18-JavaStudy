package com.sist.main;
/*
 * 
 *  7장 => 클래스 종류 (추상클래스/인터페이스)
 *           => 형식, 사용처
 *      추상 클래스
 *        => 구현이 안된 메소드를 가지고 있다.
 *           객체 직접 생성 불가능
 *           사용 시에는 상속을 받은 하위 클래스 이용
 *           역할 / 필요성
 *            상속을 통한 코드 재사용 => 강제로 메소드 구현을 하는 역할
 *                                     ---------------------------
 *                                      확장성 / 유지보수가 유용
 *            확장성 => 상속을 받아 오버라이딩 기법을 사용
 *                                 --------
 *                                  기능 변경 => 메소드 변경
 *           형식)
 *                public abstract class ClassName
 *                {
 *                  ---------------------------------
 *                   변수
 *                    멤버변수(인스턴스 변수)
 *                    정적변수(static 변수)
 *                  ---------------------------------
 *                   생성자 - 변수 초기화
 *                  ---------------------------------
 *                   구현된 메소드 - 필요 시에만 오버라이딩
 *                                   => 있는 그대로 사용 가능
 *                  ---------------------------------
 *                   미구현 메소드 - 상속 시에 강제로 구현
 *                  ---------------------------------
 *                }
 *                => 관련이 있는 클래스 여러개를 모아서 관리
 *                   ----------------------
 *                    비슷한 기능의 클래스
 *                    ------------------ 웹(Model)
 *                     ** Model => 사용자 요청처리 => 결과값을 브라우저로 전송
 *                   => 소스가 간결(조건문 없이 사용 가능)
 *                   => Map 클래스를 이용하여 클래스를 싱글턴으로 처리
 *                      --------- 메모리 절약   
 *                      
 *      인터페이스 - 추상클래스의 단점을 보완한 클래스의 일종
 *      --------- 자바에서 객체가 어떠한 행동(동작)을 정의한 타입
 *                 => 주로 메소드만 사용
 *                    기능 설계
 *                    사전적 의미 - 결합성, 접속기
 *                                 -----  ------ 리모콘
 *                                  | 서로 다른 클래스 연결 후 사용
 *                    => 컴퓨터와 사용자간의 통신(API)
 *                 => 장점
 *                     1) 코드의 표준화 - 같은 메소드를 사용
 *                                        => 내용 구현은 상이할 수 있음
 *                     2) 설계 => 프로그래머가 구현하여 사용
 *                                프로그램에 맞춰서 구현
 *                     3) 다른 클래스와 연결 시에 편리
 *                     4) 결합성이 낮게 제작
 *                     5) 다중 상속 가능
 *                     6) *** 소스의 통일화 *** => 분석이 쉬움
 *                            -----------
 *                            FrameWork (형식이 통일)
 *                             | 스프링 / jQuery / VueJS / React
 *                     7) 독립적으로 사용 가능 (원격) - ServerSocket / Socket
 *                     8) 유지보수 쉬움
 *                     9) 여러개 클래스를 모아서 관리 (한개의 객체명으로 제어)
 *            형식) => 모든 구성요소가 only public
 *                     수정 없이 고정해야 한다
 *                     (보완)
 *                     기능 추가 / 기능 수정이 가능
 *                 public interface interface 명
 *                 {
 *                  ----------------------------
 *                   변수 => 상수형 변수만 사용 가능
 *                   (public static final) 데이터형 변수명=값;
 *                   직접 입력도 되지만 생략 가능
 *                  ----------------------------
 *                   구현이 안된 메소드
 *                   (public abstract) 리턴형 메소드명(매개변수);
 *                    ---------------
 *                  ----------------------------
 *                   JDK 1.5에서 추가 
 *                   구현이 된 메소드 추가
 *                   default 리턴형 메소드(매개변수)
 *                   {
 *                   }
 *                  ----------------------------
 *                   static 리턴형 메소드(매개변수)
 *                   {
 *                   }
 *                  ----------------------------
 *                 }
 *      ***
 *       컴파일러가 자동 추가하는 소스
 *        1) import java.lang.*; => 생략 가능
 *                  --------- String, System... 
 *        2) 모든 클래스는 Object 상속
 *           ----------
 *            => 사용자 정의
 *            => 라이브러리
 *            public class ClassName extends Object
 *                                   --------------
 *        3) 메소드 => void => return 생략 시
 *           public void display()
 *           {
 *              return; => 생략
 *              ------- 메소드의 종료
 *           }   
 *        4) 인터페이스
 *            변수 -> (public static final)
 *            메소드 -> (public abstract)
 *            default -> (public)
 *            static -> (public)
 *            
 *      추상클래스
 *         상속 -> 단일 상속만 가능 -> 확장 (extends)
 *      인터페이스
 *         상속 -> 다중 상속 가능 -> 메소드 구현 (implements)
 *       => 인터페이스 -----> 인터페이스             
 *          인터페이스 -----> 클래스
 *          (클래스 -----> 인터페이스) => 사용 불가능
 *       => 다중상속 - 윈도우 / 네트워크
 *           => 웹에서는 주로 단일 상속
 *              interface A
 *              interface B
 *              
 *              class C implements A, B
 *                                 ---- 다중상속
 *      *** 관련된 클래스 여러개를 묶어서 인터페이스 한 개를 제어
 *          소스를 간결하게 제작
 *      
 *      자바 / 오라클 / JSP => 책 참조
 *      ------------------ 스프링
 *      스프링부트
 *          
 */
interface I
{
	public void aaa(); // 강제성을 가짐
	// 기능 추가
	public void bbb();
	// public 생략
	default void ccc()
	{
		
	}
	// public 생략
	static void ddd()
	{
		
	}
}
class A implements I
{

	@Override
	public void aaa() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bbb() {
		// TODO Auto-generated method stub
		
	}
	
}
class B implements I
{

	@Override
	public void aaa() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bbb() {
		// TODO Auto-generated method stub
		
	}
	
}
class C implements I
{

	@Override
	public void aaa() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bbb() {
		// TODO Auto-generated method stub
		
	}
	
}
public class 정리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		return;
	}

}
