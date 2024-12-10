/*
 *  
 	classPlayingCard { 
	int kind; 
	intnum; 
	인스턴스 변수 – Heap 프로그램 종료까지 유지
		New 사용 시 메모리가 따로 배정
	static int width; 
	static int height; 
	정적변수 – MethodArea 프로그램 종료까지 유지
	PlayingCard(int k, int n) { 
	kind = k; 
	num = n; 
	매개변수 – Stack 메모리 자체 관리 {} 종료되면 자동 삭제
	} 
	
	다음 중 생성자에 대한 설명으로 옳지 않은 것은? (모두 고르시오) c e
	특징 – 클래스명과 동일, 여러 개 생성 가능(오버로딩), 객체 생성 시에 호출, 변수에 초기화
	
	a. 모든 생성자의 이름은 클래스의 이름과 동일해야한다.
 	b. 생성자는 객체를 생성하기 위한 것이다.
 	c. 클래스에는 생성자가 반드시 하나 이상 있어야 한다.
 	d. 생성자가 없는 클래스는 컴파일러가 기본 생성자를 추가한다. > 기본 생성자(매개변수가 없는 생성자)
 	e. 생성자는 오버로딩 할 수 없다.
    
    다음 중 this에 대한 설명으로 맞지 않은 것은? (모두 고르시오) 
	This는 모든 클래스에 존재 > static > 자신의 객체 > new 객체생성 시에 주소 값을 받아서 저장
	this 사용 위치 – 생성자/인스턴스 메소드
	a. 객체 자신을 가리키는 참조변수이다.
	b. 클래스 내에서라면 어디서든 사용할 수 있다.
	c. 지역변수와 인스턴스변수를 구별할 때 사용한다.
	d. 클래스 메서드 내에서는 사용할 수 없다 (스태틱 메소드)



 */
public class 객체지향프로그램_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
