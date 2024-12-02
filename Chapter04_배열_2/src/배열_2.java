// char / double / String 배열 사용
//  > 응용(정렬, 달력...) / 중복없는 난수
// 지니 뮤직, 서울 여행, 맛집...
public class 배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 선언
		char[] alpha=new char[26];
		// 초기화
		char c='A';
		for(int i=0;i<alpha.length;i++) // 인덱스 번호
		{
			alpha[i]=c++; // A~Z까지
		}
		// 처리(X)
		// 출력
		for(char cc:alpha)
		{
			System.out.print(cc+" ");
		}
		// 'K' K가 있는 인덱스 번호를 출력
		int index=0; 
		for(int i=0;i<alpha.length;i++)
		{
			if(alpha[i]=='K')
			{
				index=i;
				break;
			}
		}
		System.out.println("K의 위치는"+index);
		
	}

}
