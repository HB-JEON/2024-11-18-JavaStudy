/*
 * 
 *  *** 윤년 ***
 *       윤년 조건  
 *        1. 4년마다
 *        2. 100년마다 제외
 *        3. 400년마다 
 *        로마 시대 > ABC / DEF
 *           
 *     윤년 처리방식
 *       if((year%4==0 && year%100!=0) || (year%400==0))
 *   
 *     년도 입력을 받아 윤년 여부를 확인
 */
import java.util.Scanner;
public class 자바제어문_단일조건문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.print("년도 입력:");
		int year=scan.nextInt();
		// 결과 출력
		
		if((year%4==0 && year%100!=0) || (year%400==0))
		{
			System.out.println(year+"는(은) 윤년입니다.");
		}
		if(!((year%4==0 && year%100!=0) || (year%400==0)))
		//else
		{
			System.out.println(year+"는(은) 윤년이 아닙니다.");
		}
		
		
		
	}

}
