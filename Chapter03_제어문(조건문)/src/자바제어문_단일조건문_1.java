/*
 * 
 *  단일 조건문
 *   1) 형식
 *      if(조건문)
 *      {
 *         실행문장 - 조건문이 true일 때 실행
 *                        false 실행 X
 *       }
 *   2)
 * 
 */
// 정수 입력 > 짝수 / 홀수
import java.util.Scanner;
public class 자바제어문_단일조건문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수입력:");
		int num=scan.nextInt();
		// 명령문
		// 주의점 제어문 뒤 ; 찍으면 안됨
		/*
		 
		if(num%2==0) // 짝수
		{
			System.out.println(num+"는(은) 짝수 입니다.");
		}
		if(num%2==1) // 홀수  (num%2!=0)도 사용가능
		{
			System.out.println(num+"는(은) 홀수 입니다.");
		}
		*/
		
		if(num%3==0)
		{
			System.out.println(num+"는(은) 3의 배수 입니다.");
		}
		
		if(num%3!=0)
		{
			System.out.println(num+"는(은) 3의 배수가 아닙니다.");
		}
			
		

	}

}
