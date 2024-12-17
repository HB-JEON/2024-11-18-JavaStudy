package com.sist.exception;
/*
 * 
 *  예외처리
 *    => 전체
 *    => 예상되는 부분만 처리
 *   
 *   1. 예외처리 시 흐름
 *      -------------
 * 
 */
public class 예외처리_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try
//		{
//			for(int i=1;i<=10;i++)
//			{
//				int r=(int)(Math.random()*3);
//				// 0~2
//				int a=i/r; // 오류 발생 => catch
//				System.out.println("i="+i+",a="+a);
//			}
//		}catch(Exception e)
//		{
//			
//		}
		// 크롤링
		for(int i=1;i<=10;i++)
		{
			try
			{
				int r=(int)(Math.random()*3);
				int a=i/r;
				System.out.println("i="+i+",a="+a);
			}catch(Exception e) {}
		}
	}

}
