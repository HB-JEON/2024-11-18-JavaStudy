/*
 * 
 *  배열 관련된 데이터를 여러개 모아서 메모리에 저장
 *   > 한개의 이름으로 관리
 *     1) 같은 데이터형 2) 연속적인 메모리 구조
 *    배열명 > 구분자(인덱스번호)
 *     3) 배열을 선언하면 고정 > 추가 삭제 불가능
 *       > 현재 배열보다 큰 배열을 다시 생성한다(추가)
 *         int[] arr=new int[5]; > 7
 *         int[] arr_ext = new int[7]
 *       > 현재 배열보다 작은 배열을 다시 생성한다 (삭제)
 *     4) 인덱스번호 > 0부터~
 *       > 배열에 저장된 갯수 > 배열명, length
 *     5) 배열 선언 / 배열 초기화
 *        데이터형[] 배열명={}
 *        데이터형[] 배열명=new 데이터형[저장갯수]
 *            --- 배열기호 > 숫자를 사용할 수 없다.
 *            
 *     1. 선언 - 저장하는 공간(메모리)
 *        한개 또는 두개 > 일반 변수
 *        3개 이상 > 배열
 *        웹 - 사용자가 보내준 데이터 읽기 getParameter("id")
 *     2. 초기화
 *     3. 사용자 요청처리 
 *        > 평균, 갯수, 인덱스 위치 > 데이터베이스(오라클) 검색, 저장
 *	   4. 결과값 출력 >
 *		  > 브라우저 전송 seatAttribute("id","admin")
 *		  [],List > 자바스크립트 데이터형(X) 
 *        JSON > React/Bue/Ajax
 *	      List > []
 *        클래스 > {}
 *        
 *        String / StringBuffer
 * 
 */
import java.util.*;
public class 배열_오답 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1. 다음 중 배열 선언이 잘못된 것은?   4
//		1) int[] n = {1, 2, 3, 4, 5};
//		2) int n[] = {0};
//		3) int[] n = new int[3];
//		4) int n[3] = new int[3];
		
//		2. 배열을 선언하고 생성하는 다음 물음에 답하라.
		
//		 1) 10개의 문자를 가지는 배열 c를 생성하는 코드를 한 줄로 쓰라.
//	​ 	  char[] c=new char[10];
		
//		 2) 0에서 5까지 정수 값으로 초기화된 정수 배열 n을 선언하라.
		
//		  ​int[] n={0,1,2,3,4,5};
		
//		 3) '일', '월', '화', '수', '목', '금', '토'로 초기화된 배열 day를 선언하라.
		
//		  char[] day={'일', '월', '화', '수', '목', '금', '토'}
		
//		 4) 4개의 논리 값을 가진 배열 bool을 선언하고 true, false, false, true로 선언하라.
		
//		  boolean[] bool={true,false,true,false}
		
//		3. 배열 alpha를 모두 출력하고자 한다. 빈칸에 적절한 코드를 삽입하시오.
		
//		  char[] alpha = {'a', 'b', 'c', 'd'};
//		
//		  for(int i=0;i<alpha.length;i++)   // > index 사용
//		       System.out.print(alpha[i]);
		
//		  for(char c:alpha)                 // > 배열에 저장된 실제 데이터
//			  System.out.print(c);
//		  // 배열제어 > 값을 변경, 값을 저장 / 값을 읽기
//		  //  > 일반 for
//		  //  > for~each > 값을 읽어서 출력
		
//		4. 양의 정수 10개 입력받아 배열에 저장하고, 배열에 있는 정수 중 
//		   3의 배수만 출력하는 프로그램을 작성하라
		
//		int[] arr=new int[10];
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i]=(int)(Math.random()*100)+1;
//		}
//		System.out.println(Arrays.toString(arr));
//		// 3의 배수만 출력
//		for(int i:arr)
//		{
//			if(i%3==0)
//			{
//				System.out.print(i+" ");
//			}
//		}
		
//		5. 정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 생성한 후
//		   배열에 저장하라. 그리고 배열에 든 숫자들과 평균을 출력하라. 
		
//		int[] arr=new int[10];
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i]=(int)(Math.random()*10)+1;
//		}
//		System.out.println(Arrays.toString(arr));
//		int sum=0;
//		for(int i:arr)
//		{
//			sum+=i;
//		}
//		System.out.printf("평균:%.2f",sum/10.0);		

//		6. 다음 배열에서 최대값,최소값을 출력하는 프로그램을 작성하시오
//		   int[] num={ 94, 85, 95, 88, 90 };
		
//		int[] num={94,85,95,88,90};
//		
//		int max=num[0];
//		int min=num[0];
//		
//		for(int i:num)
//		{
//			if(max<i)
//				max=i;
//			if(min>i)
//				min=i;
//		}
//		System.out.println("최대값:"+max);
//		System.out.println("최소값:"+min);
		
//		7. 정수를 10개 저장하는 배열을 만들고 1에서 10까지 
//		   범위의 정수를 랜덤하게 생성한 후 배열에 저장하라. 그리고 배열에 든 숫자들과 평균을 출력하라.
//		   예) 랜덤한 정수들 : 3 6 3 6 1 3 8 9 6 9 평균은 5.4
//		   [Hint] 1에서 10까지 범위의 정수를 랜덤하게 생성할 때는 다음 코드를 이용하라
//		   int i=(int)(Math.random()*10)+1;

		
		
//		8. arr 배열 중에서 인덱스가 1인 곳의 값을 출력해보자.
//		   int[] arr={10,20,30,50,3,60,-3}; 
		
//		int[] arr={10,20,30,50,3,60,-3};
//		int i=0;
//		for(int i=0;i<arr.length;i++)
//		{
//			i=arr[1];
//		}
		
		
//		9. arr 배열 중에서 값이 60인 곳의 인덱스를 출력해보자. 
//		   int[] arr={10,20,30,50,3,60,-3}; 
		
//		int[] arr={10,20,30,50,3,60,-3};
//		int index=0;
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]==60)
//			{
//				index=i;
//				break;
//			}				// scope > 변수의 사용 범위
//		}
//		System.out.println("인덱스:"+index);
		
		/*
		 *   지역변수 > 블럭변수 > 메모리에서 사라진다
		 *   {} > 메모리 자체에서 관리
		 */
		
	}

}
