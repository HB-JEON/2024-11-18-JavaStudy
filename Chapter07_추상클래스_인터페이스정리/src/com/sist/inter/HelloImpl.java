package com.sist.inter;
// => Service 구현
/*
 *  사용자 요청 => Controller => Service => ServiceImpl
 *  
 *  MainClass => Hello => HelloImpl
 *  
 */
public class HelloImpl implements Hello{
	
	public void seyHello(String name) {
		System.out.println(name+"님 환영합니다.");
	}
}
