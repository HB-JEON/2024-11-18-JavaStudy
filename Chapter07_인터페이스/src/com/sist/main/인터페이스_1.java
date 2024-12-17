package com.sist.main;
/*
 * 
 *  인터페이스
 *  ------
 *   1) 추상클래스의 일종(클래스와 동일하게 취급)
 *   2) 추상클래스 - 단일 상속
 *      인터페이스 - 다중 상속
 *   3) 인터페이스
 *        변수 (X) => 상수
 *        메소드 (구현 X) => 구현 안된 메소드만 존재
 *   4) 서로 다른 클래스를 모아서 한개의 이름으로 연결
 *   5) 결합성이 낮은 프로그램 구현
 *      --------------- 유지보수 사용
 *      *** 인터페이스를 수정하면 관련된 모든 클래스에 오류 발생
 *          인터페이스는 고정되어야함
 *          -----------------
 *           => 구현된 메소드가 가능 default / static
 *   6) 인터페이스는 변수나 메소드 모두 public
 *     
 *      예)
 *         public interface interface명
 *         {
 *            (public static final) int a=10; => 값을 지정하지 않은 경우 오류 발생
 *            --------------------------- 상수형
 *            (public abstract) void display();
 *            public (abstract) void display();
 *            --------------------------- 구현이 안된 메소드
 *            (public) default void aaa()
 *            {
 *            }
 *            (public) static void bbb()
 *            {
 *            }
 *         }
 *       
 *       상속을 받은 후 구현해서 사용
 *       ------------------------
 *       오버라이딩
 *          메소드명 동일
 *          매개변수 동일
 *          리턴형 동일
 *          접근지정어는 확대할 수 있다, 축소하면 오류
 *                                   ------------
 *          private < default < protected < public
 *          
 *           interface A
 *           {
 *              void display();
 *           }
 *           
 *           class B implements A
 *                   ---------- 상속
 *                   
 *            상속
 *                         extends
 *            interface ========> interface
 *                         implements
 *            interface ========> class
 *                    (X)
 *            class =======> interface
 *            ----------------------------------------
 *            interface A
 *            interface B extends A => A,B
 *            interface C extends B => A,B,C
 *            
 *            interface A
 *            interface B
 *            interface C extends B,A
 *                                       --- 다중 상속
 *           interface A
 *           interface B
 *           class C implements A,B
 *                     -------------     
 *           interface A
 *           interface B
 *           class C
 *           class D extends C implements A,B
 *           class Window extends JFrame implements
 *                                          KeyListener, MouseListener
 *           인터페이스
 *           ------------
 *             1) 윈도우 - 이벤트 관련
 *             2) 쓰레드 - 동작을 개발자
 *             3) 데이터베이스 연결
 *             4) 웹 연동
 *                 ------------------------- 메소드는 재공
 *                                                 프로그램에 맞게 구현
 *                                                 
 *                                                 
 *         설계(요구사항) - 아키텍처 => 사이버다임
 *                   | 아이템 => 기획
 *         데이터베이스 설계 - DBA
 *         화면 UI - HTML/CSS/JavaScript => 퍼블리셔
 *         *** 구현 - 웹 개발자
 *         테스트 - 테스터
 *         배포 - 웹 개발자
 *                                                  
 * 
 */
interface A
{
	/*(public static final)*/ int d=100;
	/*(public abstract)*/ void aaa();
	public void ooo();
	public abstract void jjj();
	/*(public)*/ default void bbb()
	{
	}
	public default void ddd()
	{
	}
	/*(public)*/ static void ccc() 
	{
	}
}
public class 인터페이스_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
