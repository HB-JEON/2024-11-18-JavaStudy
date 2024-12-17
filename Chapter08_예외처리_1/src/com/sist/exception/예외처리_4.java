package com.sist.exception;
import java.util.Scanner;
public class 예외처리_4 {
/*
 *  UnCheck
 *  -------
 *    Throwable
 *      | 
 *    Exception - 하위의 에러를 모두 처리 가능
 *      |
 *    RuntimeException - 하위 에러를 모두 처리 가능
 *  ------------------
 *      |
 *    ArrayIndexOutOfBoundsException - 배열범위 초과
 *    ArithmeticException - 0으로 나누는 경우
 *    NumberFormatException - 정수변환
 *    ClassCastExeption - 형변환
 *    ...
 *    
 *    try
 *    {
 *       int a=10;
 *    }catch(Exception e)
 *    {
 *       int b=20;
 *    }
 *    
 *    a, b => 사라진다
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int[] arr=new int[2]; // 배열 범위 초과, 0
		try
		{
			System.out.print("첫 번째 정수 입력:");
			String s1=scan.next();
			System.out.print("두 번째 정수 입력:");
			String s2=scan.next(); // 오류 발생
			
			arr[0]=Integer.parseInt(s1);
			arr[1]=Integer.parseInt(s2);
			int result=arr[0]/arr[1];
			System.out.println("result="+result);
		}
		catch(ArrayIndexOutOfBoundsException ex) // 배열 범위 초과를 잡는 예외처리
		{
//			System.out.println(ex.getMessage());
			// 에러 위치를 확인 가능하다면 => 에러 메세지만 출력
			ex.printStackTrace();
			// 에러발생 시 => 에러 위치 확인
		}
		catch(ArithmeticException e)
		{
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch(NumberFormatException e)
		{
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}
//		 기타 에러를 처리
//		catch(RuntimeException e)
//		{
//			System.out.println("에러 발생");
//		}
		System.out.println("정상 수행");
		// 정상 수행 => catch 수행 X
		// try 안에서 오류 발생 시 catch 수행
	}

}
