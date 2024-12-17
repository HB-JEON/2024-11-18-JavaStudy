/*
 * 
 *  가위 바위 보 게임을 10번 수행 > 5승 1무 4패
 * 
 */
import java.util.Scanner;
public class 반복문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int win=0,same=0,lose=0;
		
		int i=1;
		Scanner scan=new Scanner(System.in);
		// new 사용시 마다 메모리에 저장(할당) > 반복문에서 사용 X
		// 클래스는 반복문 밖에서 사용
		while(i<=10)
		{
			System.out.println("====="+i+"번째 게임=====");
			// com 가위 바위 보 설정
			int com=(int)(Math.random()*3);
			// 사용자 가위 바위 보 설정
			System.out.print("가위(0),바위(1),보(2):");
			int user=scan.nextInt();
			
			if(user<0 || user>2)
			{
				System.out.println("잘못된 입력 입니다.");
				// 게임을 처음부터 다시 시작
				continue; // 조건식으로 이동
				// break면 종료 > 단 for문이면 증가식으로 이동
			}
			
			System.out.print("컴퓨터:");
			if(com==0)
				System.out.println("가위");
			else if(com==1)
				System.out.println("바위");
			else if(com==2)
				System.out.println("보");
			// 결과값 확인
			
			// 사용자 확인
			System.out.print("사용자:");
			switch(user)
			{
			case 0:
				System.err.println("가위");
			case 1:
				System.err.println("바위");
			case 2:
				System.err.println("보");
				break;
			}
			// for == while, 다중조건문 == switch~case
			// 누가 이겼는지 확인
			int result=com-user;
			/*
			 *  com : 가위(0)
			 *      사용자 : 가위(0) > 0
			 *             바위(1) > -1
			 *              보(2) > -2
			 *  com : 바위(1)
			 *      사용자 : 가위(0) > 1
			 *             바위(1) > 0
			 *              보(2) > -1
			 *  com : 보(2)
			 *      사용자 : 가위(0) > 2
			 *             바위(1) > 1
			 *              보(2) > 0
			 */
			// 사용자가 이기는 경우 > -1, 2
			if(result==-1 || result==2)
			{
				System.out.println("사용자 WIN");
			}
			// 컴퓨터가 이기는 경우 > 1, -2
			else if(result==1 || result==-2)
			{
				System.out.println("컴퓨터 WIN");
			}
			else if(result==0)
			{
				same++;
				System.out.println("무승부");
			}
			// 비기는 경우 > 0
			
			System.out.print("게임을 종료할까요?(y/n):");
			char c=scan.next().charAt(0);
			if(c=='y')
			{
				System.out.println("게임을 종료합니다.");
				break; // 게임 종료
			}
			
			i++;
		}
		System.out.println("=========== 최종 결과 ===========");
		System.out.printf("%d승 %d무 %d패\n",win,same,lose);
	}
	
}
