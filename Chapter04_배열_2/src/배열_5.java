// 6개의 난수 발생 후 (1~45) 중복이 없는 데이터를 출력 
public class 배열_5 {
	// 프로그램은 정답이 없다
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 선언
		int[] lotto=new int[6];
		// 초기값
		for(int i=0;i<lotto.length;i++)
		{
			lotto[i]=(int)(Math.random()*45)+1;
			for(int j=0;j<i;j++)
			{
				if(lotto[i]==lotto[j])
				{
					i--;
					break;
				}
			}
		}
		// 처리
		// 출력
		for(int i:lotto)
		{
			System.out.print(i+" ");
		}
		
	}

}
