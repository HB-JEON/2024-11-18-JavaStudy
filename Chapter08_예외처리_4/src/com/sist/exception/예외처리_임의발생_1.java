package com.sist.exception;
import java.util.Scanner;
/*
 *   웹 => 무조건 전송받은 데이터형 String
 *    a.jsp?no=1
 *    
 *    IllegalArgumentException 발생
 *    
 *    public void display(int no) => String no
 *    {
 *       => 정수형 변환 Integer.parseInt(no)
 *                    ------- 데이터형 클래스 => Wrapper
 *    }
 */
public class 예외처리_임의발생_1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Scanner scan=new Scanner(System.in);
			System.out.print("국어 점수 입력:");
			int kor=scan.nextInt();
			if(kor<0 || kor>100)
			{
				// 잘못된 입력 => 직접 처리
				// catch 불러오기
				// throw => 예외 발생을 알려준다
				// 테스트(배포)
				throw new IllegalArgumentException("점수는 0점 이상 100점 이하로 입력 하여야합니다.");
				// catch 이동
				// throw => 필요 시에 의해 catch 호출 가능
				// 아래는 코딩 불가능
			}
		}catch(IllegalArgumentException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
