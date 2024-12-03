// x<10 && x>20
// ch==' ' || ch=='\t'
// ch=='x' || ch=='X'
// ch<=0 && ch=>9

import java.util.Scanner;
public class 연습장 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		while(true)
		{
			System.out.print("1이상의 숫자를 입력하세요:");
			int num1=scan.nextInt();
		if(num1<=0)
		{
			System.out.println("잘못된 입력입니다.");
		}
		else
		{
			for(int i=1;i<=num1;i++)
			{
				System.out.println(i+" ");
			}
			break;
			}
		}
		
		
		
	}

}

