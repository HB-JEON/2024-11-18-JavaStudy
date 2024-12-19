package com.sist.exception;
// 사용자 정의 예외처리 => 호출 => throw - 예외 찾기
//  => 기존에 생성된 예외처리, 사용자 정의는 찾지 못한다.
/*
 * 
 *  1. 데이터형 => 클래스 => new
 *      int / double / long -> 메모리 크기 확인
 *       class A
 *       {
 *          int a,b;
 *          double d;
 *       }
 *       => new -> int malloc(sizeof())
 *       
 *  2. 사용자 정의 => 호출
 *  => 283 page
 *      => 사용자 정의 예외처리 - 기존의 예외처리 클래스를 상속
 *          Exception / Throwable
 *      => class MyException extends Exception
 *         {
 *         }
 *      => try ~ catch -> 에러처리 -> 정상수행
 *          => 일반 소스 코딩
 *      => throws - 선언 -> 어떤 에러가 발생하는지 알려주는 경우
 *          => 라이브러리에서 주로 사용
 *      => throw - 직접 예외발생
 *          => 사용자 정의 예외처리(실무)
 *             if ~ else
 *       
 *      에러처리 => if 우선 사용
 *                 if 불가능의 경우 => 자바에서 지원하는 예외 사용
 *                                   ----------(자바에서 대부분 처리 가능) 
 *  
 */
import java.util.Scanner;
class MyException extends Exception
{
	public MyException(String msg)
	{
		super(msg);
	}
}
public class 예외처리_사용자정의 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Scanner scan=new Scanner(System.in);
			System.out.print("점수 입력:");
			int score=scan.nextInt();
			if(score<0 || score>100)
			{
				throw new MyException("잘못된 입력입니다.");
				// catch 호출
				// 사용자 정의 예외처리가 있는 경우
			}
		}catch(MyException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
