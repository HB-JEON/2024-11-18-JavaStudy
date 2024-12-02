import java.util.Arrays;

public class 배열_오답 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1. 5명의 학생의 국어점수를 받아서 등수를 출력하는 프로그램 작성
		
//		int[] kor=new int[5];
//		int[] rank=new int[5];
//		
//		for(int i=0;i<kor.length;i++)
//		{
//			kor[i]=(int)(Math.random()*100)+1;
//		}
//		System.out.println(Arrays.toString(kor));
//		for(int i=0;i<kor.length;i++)
//		{
//			rank[i]=1;
//			for(int j=0;j<kor.length;j++)
//			{
//				if(kor[i]<kor[j])
//				{
//					rank[i]++;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(rank));

//		int[] arr=new int[10];
//		int max=0;
//		int min=100;
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i]=(int)(Math.random()*100)+1;
//		}
//		System.out.println(Arrays.toString(arr));
//		for(int i:arr)
//		{
//			if(max<i)
//				max=i;
//			if(min>i);
//				min=i;
//		}
//		System.out.println("최대값:"+max);
//		System.out.println("최소값:"+min);
//		
		
//		3. 100 개의 난수(0~9)를 발생하여 빈도수를 구하는 프로그램을 작성하시오
		
		
		
//		4. 10개의 난수를 발생하여 배열에 저장한 후에 인덱스가 1인 곳의 값을 출력하시오.
		
//		// 배열선언
//		int[] arr=new int[10]; 
//		// 초기화
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i]=(int)(Math.random()*100)+1;
//		}
//		System.out.println(Arrays.toString(arr));
//		System.out.println(arr[1]);
		
//		5. 위 문제 배열 중에서 최대값의 인덱스를 출력하시오. 
		
//		int[] arr=new int[10]; 
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i]=(int)(Math.random()*100)+1;
//		}
//		System.out.println(Arrays.toString(arr));
//		 arr.length-1 > 마지막 인덱스
//		System.out.println(arr[arr.length-1]);
		
//		6. 10개의 난수를 배열 안의 모든 값을 더하고, 총합과 평균을 출력하시오.
		
		// 출력이나 데이터 저장과 관련된 메모리 공간 생성 > 변수 / 배열
		int sum=0;
		double avg=0.0;
		int[] arr=new int[10];
		// 초기화 > 난수
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		// 확인
		System.out.println(Arrays.toString(arr));
		// 처리 > 합 / 평균
		for(int i:arr)
		{
			sum+=i;
		}
		avg=sum/10.0;
		System.out.println("총합:"+sum);
		System.out.println("평균:"+avg);
		
//		7. 10개의 난수를 배열에 저장 후에 배열의 인덱스가 3인 곳은 출력하지 말고, 나머지만 출력하시오
		
		
		
//		8. 5개의 난수를 배열에 저장한 후에 인덱스번호 두개를 받아서 값을 교환하는 프로그램을 작성하시오
		
		
		
//		9. char 배열을 생성하여, 알파벳 A~Z까지 대입 후, 출력하시오
		
		
		
//		10. 위문제를 역순으로 출력하시오
		
		
		
//		11. 정수 10개를 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력하시오
		
		
		
//		12. 10개의 정수를 입력받아서 짝수의 최대값,홀수의 최대값을 출력하는 프로그램을 작성하시오
		
		
		
//		13. 3명의 학생에 대한 국어,영어,수학 점수를 입력받아서 저장후에 총점,평균,등수를 구하고
//		     국어점수 총점,영어점수 총점,수학점수의 총점을 구해서 출력하는 프로그램을 작성하시오
		
		
		
	}

}
