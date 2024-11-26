
import java.util.Scanner;
public class 연습장 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
//		System.out.print("정수입력:");
//		int score=scan.nextInt();
//		
//		switch(score/10)
//		{
//		case 9: case 10:
//			System.out.println("A학점");
//			break;
//		case 8:
//			System.out.println("B학점");
//			break;
//		case 7:
//			System.out.println("C학점");
//			break;
//		case 6:
//			System.out.println("D학점");
//			break;
//		default :
//			System.out.println("F학점");
//		}
//		System.out.print("첫번째 정수입력:");
//		int num1=scan.nextInt();
//		System.out.print("두번째 정수입력:");
//		int num2=scan.nextInt();
//		System.out.print("연산자(+,-,*,/)입력:");
//		
//		switch(scan.next())
//		{
//		case "+":
//			System.out.printf("%d + %d = %d ",num1,num2,num1+num2);
//		break;
//		case "-":
//			System.out.printf("%d - %d = %d ",num1,num2,num1-num2);
//		break;
//		case "*":
//			System.out.printf("%d * %d = %d ",num1,num2,num1*num2);
//		break;
//		case "/":
//			if(num2==0)
//				System.out.println("0으로 나눌 수 없음");
//			else
//				System.out.printf("%d / %d = %d ",num1,num2,num1/num2);
//		}
		
		int sum=0;
		for(int i=2;i<=100;i+=2)
		{
			sum+=i;
		}
		System.out.println(sum);

	}

}

