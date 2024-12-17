/*  정수 2개 > 사용자 요청 > 계산
*           +, -, *, /
*   간단한 사칙 연산 사용         
*/
import java.util.Scanner;
public class 자바제어문_단일조건문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.print("첫번째 정수 입력:");
		int num1=scan.nextInt();
		
		System.out.print("두번째 정수 입력:");
		int num2=scan.nextInt();
		// String op=scan.next()
		// char opp.op.charAt(0)
		System.out.print("연산자 입력: +(43),-(45),*(42),/(47):");
		char op=(char)scan.nextInt();
		
		System.out.print(num1);
		System.out.print(op);
		System.out.print(num2);
				

	}

}
