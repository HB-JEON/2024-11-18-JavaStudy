import java.util.Scanner;
public class 제어문_조건문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.print("가위(0),바위(1),보(2):");
		int player=scan.nextInt();
		int com=(int)(Math.random()*3);
		String[] str= {"가위","바위","보"};
		System.out.println("컴퓨터:"+str[com]);
		System.out.println("Player:"+str[player]);
		System.out.println("===== 결과 =====");
		/* if (com==0 && player==0)
		 * if (com==0 && player==1)
		 * if (com==0 && player==2)
		 */
		int res=com-player;
		if(res==-1 || res==2)
		{
			System.out.println("Player Win");
		}
		if(res==1 || res==-2)
		{
			System.out.println("Computer Win");
		}
		if(res==0)
		{
			System.out.println("비겼다");
		}

	}

}
