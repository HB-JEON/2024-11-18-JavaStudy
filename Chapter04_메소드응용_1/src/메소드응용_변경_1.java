// 메소드형 숫자 야구게임
//    1. 3개의 정수를 추출 1~9 > 중복 없이
//    2. 사용자 입력
//    3. 난수 입력 값 비교
//    4. 힌트 > 
//    5. 종료 여부 확인

import java.util.Arrays;
import java.util.Scanner;
public class 메소드응용_변경_1 {
	// 중복 없는 3개의 난수(1~9) 발생
	static int[] rand()
	{
		int[] com=new int[3];
		for(int i=0;i<com.length;i++)
		{
			com[i]=(int)(Math.random()*9)+1; // (double)(Math.radom()) > (int)(Math.random())
			for(int j=0;j<i;j++)
			{
				// 중복 숫자 확인
				if(com[i]==com[j])
				{
					i--; // 같은 정수가 있는 경우 다시 난수 발생
					break;
				}
			}
		}
		return com;
	}
	// 사용자 입력 > 유효성 검사
	static int[] userInput()
	{
		int[] user=new int[3];
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			System.out.print("세 자리 정수를 입력 하세요.");
			int input=scan.nextInt();
			
			// 오류 처리 - 세 자리 정수
			if(input<100 || input>999) // 오류 / 잘못된 입력 > 유효성 검사
			{
				System.out.println("세 자리 정수가 아닙니다! 다시 입력 해주세요.");
				// 처음부터 다시 입력
				continue;
				/*
				 *   continue 사용 시
				 *     for  = 증가식으로 이동
				 *    while = 조건식으로 이동
				 *     > 특정 부분을 제외 / 웹에서의 사용빈도 낮음
				 */
			}
			
			// 세 자리 정수 잘라서 배열에 저장
			user[0]=input/100; // 369 > 3
			user[1]=(input%100)/10; // 369%100 > 69/10
			user[2]=input%10;
			// 코딩 테스트 > 화폐 매수 구하기 14850
			
			// 오류 처리 - 중복된 정수 / 0 입력
			if(user[0]==user[1] || user[1]==user[2] || user[0]==user[2])
			{
				System.out.println("중복된 정수는 입력 할 수 없습니다! 다시 입력 해주세요.");
				continue;
			}
			if(user[0]==0 || user[1]==0 || user[2]==0)
			{
				System.out.println("0은 사용 할 수 없습니다! 다시 입력 해주세요.");
				continue;
			}
			break;
		}
		return user;
		
	}
	// 비교
	static int compare(int[] com,int[] user)
	{
	int s=0,b=0;
	/*
	 *  이차 for 문
	 *   i=0 > j=0,j=1,j=2
	 *   i=1 > j=0,j=1,j=2
	 *   i=2 > j=0,j=1,j=2
	 */
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			if(com[i]==user[j]) // 같은 숫자가 있다면
			{
				if(i==j)
					s++; // 같은 자리에 존재
				else
					b++; // 다른 자리에 존재
			}
		}
	}
		hint(s,b,user);
		return s;
	}
	// 힌트 제공
	static void hint(int s,int b, int[] user)
	{
		System.out.println("Input Number:"+user[0]+""+user[1]+""+user[2]+"");
		System.out.println("=========== 전광판 ===========");
		System.out.print("S:");
		for(int i=0;i<s;i++)
		{
			System.out.print("●");
		}
		System.out.println();
		System.out.print("B:");
		for(int i=0;i<b;i++)
		{
			System.out.print("○");
		}
		System.out.println("\n============================");
	}
	// 종료 여부
	static boolean isEnd(int s)
	{
		boolean bCheck=false;
		if(s==3)
		{
			bCheck=true;
		}
		return bCheck;
	}
	// 전체 조립 > 새로운 게임 여부 확인
	static void process()
	{
		Scanner scan=new Scanner(System.in);
		int[] com=rand();
		// System.out.println(Arrays.toString(com));
		int[] user=new int[3];
		while(true)
		{
			user=userInput();
			int s=compare(com, user);
			if(isEnd(s))
			{
				System.out.print("게임이 완료 되었습니다. 새 게임을 시작하시겠습니까?(Y/N)");
				char c=scan.next().charAt(0);
				if(c=='y' || c=='Y')
				{
					System.out.println("★★★★★★★★★★ 새 게임을 시작합니다 ★★★★★★★★★★");
					process(); // 제귀호출
				}
				else
				{
					System.out.println("게임이 종료 되었습니다.");
					System.exit(0);
				}
			}
		}
		// System.out.println(Arrays.toString(user));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		process();
		
	}

}
