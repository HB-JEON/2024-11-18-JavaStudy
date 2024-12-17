import java.util.Arrays;

public class 문자열배열_오답 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
//		1. (1차배열)1번 학생 100점 2번 학생 90점 3번학생 85점이다.
//		 점수를 score 배열 변수에 저장하고 1) 아래와 같이 출력하시오.
//		1번 학생 : 100점  
//		2번 학생 : 90점  
//		3번 학생 : 85점 
//		2) 학생들의 총점을 출력하시오.

		
//		int[] score={100,90,85};
//		int total=0;
//		for(int i=0;i<score.length;i++)
//		{
//			System.out.println((i+1)+"번 학생:"+score[i]+"점");
//			total+=score[i];
//		}
//		System.out.println("학생들의 총점:"+total+"점");
		
//		2. 1월달 사원(1번부터 5번사원)의 실적이 50 45 35 12 70 이다. (실적 0~100)
//		1) 사번별 실적을 출력하시오. 사원(1) 50
//		2) 1월 실적의 총점과 평균을 출력하시오.
//		3) 실적이 제일 큰 사원의 사번과 실적, 작은 사원의 사번과 실적을 출력하시오.
		
//		int[] arr={50,45,35,12,70};
//		int sum=0;
//		System.out.println("======= 사원 실적 ========");
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.println("사원("+(i+1)+")"+arr[i]);
//			sum+=arr[i]; //arr의 정수를 sum에 누적
//		}
//		System.out.println("총 점:"+sum);
//		System.out.printf("평균:%.2f\n",sum/(double)arr.length);
//		
//		int max=arr[0];
//		int min=arr[0];
//		int maxi=0; // 실적이 가장 큰 사번
//		int mini=0; // 실적이 가장 작은 사번
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			if(max<arr[i])
//			{
//				max=arr[i];
//				maxi=i;
//			}
//			if(min>arr[i])
//			{
//				min=arr[i];
//				mini=i;
//			}
//		}
//		System.out.println("실적이 가장 높은 사번과 실적");
//		System.out.println("사원("+(maxi+1)+")");
//		System.out.println("실적:"+max);
//		System.out.println("실적이 가장 낮은 사번과 실적");
//		System.out.println("사원("+(mini+1)+")");
//		System.out.println("실적:"+min);
		
//		3. 크기가 10인 정수형 배열을 생성하고 여기에 0부터 9까지의 값으로 배열을 채우는 프로그램 만들기
		
//		int[] arr=new int[10];
//		int sum=0;
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i]=i; // 0~9
//			sum+=arr[i];
//		}
//		System.out.println("0~9까지의 합:"+sum);

//		4. 배열 arr에 담긴 모든 값을 더하는 프로그램을 완성하시오.
		
//		int[] arr = {10, 20, 30, 40, 50};
//		int sum = 0;
//		for(int i:arr)
//		{
//			sum+=i;
//		}
//		System.out.println("sum="+sum); // 결과 : sum=150
		
//		5. 1~100사이의 정수를 10개 저장한 후  
//		정수형 변수 evenTotal 에 배열 내의 데이터 짝수 합 계산하여 저장
//		정수형 변수 oddTotal 에 배열 내의 데이터 홀수 합 계산하여 저장
		
//		int[] arr=new int[10]; // 정수 10개 저장
//		// 초기값
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i]=(int)(Math.random()*100)+1;
//		}
//		System.out.println(Arrays.toString(arr));
//		int evenTotal=0; // 짝수의 합
//		int oddTotal=0; // 홀수의 합
//		
//		for(int i:arr)
//		{
//			if(i%2==0)
//				evenTotal+=i;
//			else
//				oddTotal+=i;
//		}
//		System.out.println("짝수의 합:"+evenTotal);
//		System.out.println("홀수의 합:"+oddTotal);
		
//		6. 0~9사이의 난수를 100개 발생해서 빈도를 구해서 출력하시오 
//		   예)
//		   0의 개수: 1
//		   1의 개수: 1
//		   ..
//		   9의 개수: 0
		
//		int[] arr=new int[100];
//		// 초기값 0~9
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i]=(int)(Math.random()*10);
//		}
//		System.out.println(Arrays.toString(arr));
//		
//		int[] result=new int[10];
//		for(int i=0;i<arr.length;i++)
//		{
//			result[arr[i]]++; // 카운트
//		}
//		for(int i=0;i<result.length;i++)
//		{
//			System.out.println(i+"의 갯수:"+result[i]);
//		}
		
//		7. 임의의 문자 5개를 저장하고 정렬해서 출력하시오 
//	       A C D H J
//	     A C D H J
//	     J H D C A
		/* 배열 - 같은 데이터를 묶어서 관리(변수 여러개를 제어하기 쉽개 한개의 이름으로 이용)
		         -------
		          용도가 동일
		          = 연속적으로 메모리가 배치(같은 크기로 제작)
		          = 구분자 > 인덱스 (0부터 순차적으로) > 반복문을 사용
		          = 몇개 저장 > 데이터형
		          = 초기화
		          = 데이터 구하기
		          = 결과값
		*/
		
		char[] arr=new char[5];
		// 초기값
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(char)((Math.random()*26)+65);
		}
		System.out.println(Arrays.toString(arr));
		// ASC 정렬 > 선택 정렬
		/*
		 *   D A C E B
		 *   - -
		 *   A D
		 *   -   -
		 *   A   C
		 *   -     -
		 *   A     E
		 *   -       -
		 *   A       B  
		 *   
		 *   A D C E B  > 1R
		 *   = - -
		 *     C D
		 *     -   -
		 *     C   E
		 *     -     -
		 *     B     C  
		 *     
		 *   A B D E C  > 2R
		 *   = = - -
		 *       D E
		 *       -   -
		 *       C   D  
		 *   
		 *   A B C E D  > 3R
		 *   = = = - -
		 *         D E
		 *         
		 *   A B C D E  > 4R        
		 * 
		 */
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					char temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		// Arrays.sort(arr) > 정렬 > ORDER BY > index
		System.out.println("정렬 후:");
		System.out.println(Arrays.toString(arr));
//		for(int i=arr.length-1;i>=0;i--)
//		{
//			System.out.print(arr[i]+" ");
//		}
		// DESC 정렬 > 버블 정렬
		/*
		 *   D A C E B
		 *   - -
		 *   D A
		 *     - -       
		 *     C A
		 *       - -
		 *       E A
		 *         - -
		 *         B A
		 *  
		 *   D C E B A  >  1R
		 *   - -     =
		 *   D C
		 *     - -
		 *     E C
		 *       - -
		 *       C B
		 *       
		 *   D E C B A  >  2R
		 *   - -   = =
		 *   E D
		 *     - -
		 *     D C
		 *     
		 *   E D C B A  >  3R
		 *   - - = = =
		 *   E D
		 *   
		 *   E D C B A
		 *   
		 */
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]<arr[j+1])
				{
					char temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("역순 정렬 후:");
		System.out.println(Arrays.toString(arr));
		// > 스택 / 큐
		// Arrays.sort(arr) > EDSC가 없다.
		
	}

}
