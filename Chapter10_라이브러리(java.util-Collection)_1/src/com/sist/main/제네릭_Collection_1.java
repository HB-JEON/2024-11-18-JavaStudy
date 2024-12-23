package com.sist.main;
/*
 * 
 *  제네릭
 *  -----
 *   1) 데이터형을 변경해서 사용이 쉽게 생성
 *       => 리턴형 / 매개변수 => Object => 원하는 데이터형으로 변경
 *   2) 한 번에 데이터형을 통일 가능
 *   3) 형변환 없이 사용 가능 => 소스 간결 / 가독성
 *   4) Object 단점
 *       => 데이터 읽기가 어려움
 *           ArrayList list=new ArrayList();
 *           list.add(1);
 *           list.add(10.5);
 *           list.add('A');
 *           list.add("AAA");
 *           list.add(2);
 *           list.add(10.5);
 *           list.add('B');
 *           list.add(new B());
 *            => 데이터의 통일성이 없는 경우에는 반복문 사용 불가능
 *               ------------ 반복문 사용 가능 => 데이터형 한개로 통일
 *            => 배열과 동일 시 사용 => 같은 데이터형만 사용
 *                                   ----------- 제어가 쉬움
 *            => 사용자 정의(X) => 표준화
 *            => 사용법<클래스>
 *                     <int> (X) => <Integer>, <Double>
 *                                  -------------------
 *                                    | Wrapper
 *            => 임시 데이터형
 *                T / E / K / V
 *                 => T / E (Type / Element) => 클래스
 *                 => K V (Key / Value) => Map
 * 
 */
/*
 *   Box<String> b=new Box<String>();
 *   T => String
 *   Box b=new Box()
 *   T => Object
 *   
 *   JDK 1.5 => JDK 1.8
 *              -------
 *               호환성 높음
 *               SUN
 *   => 객체의 데이터형 안정성 => 제어문 사용 편리
 *      형변환을 하지 않기 때문에 소스가 간결
 *      명시적으로 코딩 => 유지보수 시 어떤 데이터가 첨부하는지 확인 가능
 *      사용법
 *       ArrayList<String>
 *       ArrayList<Integer>
 *       ArrayList<Double>
 *       ArrayList<Sawon> <Movie>...
 */
class Box<T>
{
	T t; // String t
	public void setT(T t) // String t
	{
		this.t=t;
	}
	public T get() // String
	{
		return t;
	}
}
public class 제네릭_Collection_1 {
	public static void main(String[] args) {
		Box<String> b=new Box<String>(); // 명시적
		b.setT("Hello");
		String s=b.get();
		System.out.println(s);
	}
}
