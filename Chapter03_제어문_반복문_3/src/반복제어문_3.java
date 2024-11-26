/*
 * 
 * ***  일차 for / while ***
 * ***  > break         *** >>>>>>>> 매우 중요
 * *** 조건문 - 단일 / 선택 ***
 * 
 */
public class 반복제어문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(j==2) // j가 2일 때만 제외
					continue; // while문에서 가끔 잘못된 입력이 되었을 때
				System.out.println("i="+i+",j="+j);
			}
		}
		
	}

}
