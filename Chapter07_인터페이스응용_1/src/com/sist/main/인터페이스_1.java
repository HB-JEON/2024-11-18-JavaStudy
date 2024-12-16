package com.sist.main;
/*
 * 
 *   1. 인터페이스 사용 목적
 *        서로 다른 클래스를 묶어서 한개의 인터페이스명으로 연결
 *          리모콘의 역할
 *        결합성이 낮은 프로그램
 *        -------------------------- 수정 시에 다른 클래스가 오류..(영향이 없는 프로그램)
 *        개발자들이 같은 메소드를 사용 - 표준화
 *        독립적으로 사용 가능
 *        확장 가능
 *        ---------- JDK1.8
 *        default / static => 구현된 메소드 처리가 가능
 *         => 추상 클래스 대체 인터페이스를 많이 사용
 *   2. 여러개의 기능을 도시에 상속이 가능
 *       --------------------------------------- 다중 상속
 *   3. 인터페이스는 자신이 메모리 할당이 불가능
 *      상속 후에 상속받은 클래스가 미구현된 메소드 구현 후 사용
 *      인터페이스 객체=new 상속받ㅇ은 클래스 생성자
 * 		 => 오버라이딩 기법 사용
 *   4. 인터페이스에서는 반드시 상속 받는 클래스가 동일한 기능을 가지고 있어야 한다.
 *   
 *   문법
 *     1. 구성요소
 *          변수 ====> 상수형변수만 사용
 *                               ----------- 초기값을 반드시 지정
 *                                int a=100;
 *           메소드 - 구현이 안된 메소드 (추상메소드)
 *           ---------- 변수/ 메소드는 only public
 *           = default / static 메소드는 구현 가능
 *     2. 구현 후 객체 생성
 *         interface A
 *         class B implements A
 *            하위 클래스       상위 클래스
 *          => A a=new B();
 *          => 확인 : instanceof   
 *   
 */
interface A
{
	public void aaa();
	public void bbb();
	public void ccc();
	public void ddd();
	public void eee();
}
public class 인터페이스_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 쉽게 구현 => 람다식
	}

}
