class Member2
{
	int no=100; // Heap > 멤버변수
	int id=300;
	Member2() {
		System.out.println("this="+this);
		int no=200; // Stack > 지역변수
		System.out.println("no="+(no+this.no)); // ***** 매우 중요 *****
		// 1. 지역변수 우선 순위
		//    지역변수, 매개변수 > 멤버변수
		// this > 클래스 자신이 가지고 멤버(변수,메소드)
		System.out.println(id); // this.id > 생략
	}
	/*
	 *  this > 자신의 객체
	 *  ---- 지역변수와 매개변수 > 멤버변수가 동일한 이름을 가지고 있는 구분자
	 *       모든 클래스는 this를 가지고 있다.
	 *  class A
	 *  {
	 *      this
	 *  }
	 *  class B
	 *  {
	 *      this
	 *  }
	 *  ----------- static 변수
	 *  
	 *  A a=new A(); a > A this
	 *  B b=new B(); b > B this
	 *  
	 *  JVM
	 *  A a=new A();
	 *   this=a;
	 *  
	 */
}
/*
 * 
 *    int a=10;
 *    static int b=20;
 *    static void display() > 공통으로 사용하는 기능
 *    {
 *        b만 사용 가능
 *        A a=new A();
 *        a.b
 *    }
 *    void display2()
 *    {
 *        a,b 사용 가능
 *    }
 *    
 */
public class 클래스_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Member2 m=new Member2();
		System.out.println("m="+m);
		// static 에서는 this 사용 불가
		// this 인스턴스에서만 사용 가능
		//  > 공유
		
	}

}
