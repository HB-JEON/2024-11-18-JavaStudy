/*
 * 
 *  while / do~while
 *   |        | 반드시 한번 이상 수행하는 경우 주로 사용 > java의 사용빈도는 거의 없음
 *   | 반복 횟수가 없는 경우에 주로 사용 (데이터베이스/파일읽기)
 *  
 *  반복제어문
 *    | break - 반복종료
 *    | continue - 특정 부분을 제외
 *          for문 - 증가식으로 이동 / while - 조건식으로 이동
 *                               ------ continue는 처음부터 다시 시작
 *    
 *      while
 *      
 *      초기식                1
 *      while(조건식)         2 > true - 반복문장 수행
 *                            > false - 종료
 *      {          
 *         반복실행 문장        3
 *         증가식             4 > 2번 이동
 *      }
 *      
 *      do~while - while을 보완(무조건 한번 수행)
 *      
 *      초기식                1
 *      do
 *      {
 *         반복실행 문장        2
 *         증가식             3
 *      }while(조건식);       4 > 2번으로 이동 > true
 *                               false면 종료
 *    
 * 
 */
public class 반복문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~10
		
		System.out.println("======= for =======");
		for(int i=1;i<=10;i++) // 지역변수라 선언해도 상관X
		{
			/*
			 *   i=1 i<=10 > 1 i++ > i=2
			 *   i=2 i<=10 > 2 i++ > i=3
			 *   ...
			 *   ...
			 *   ...
			 *   i=1 i<=10 > 10 i++ > i=11
			 *   i=1 i<=10 > false
			 */  
			System.out.print(i+" ");
		}
		System.out.println("\n======= while =======");
		int i=1; // 선언됨
		while(i<=10)
		{
			
			System.out.print(i+" ");
			i++;
		}
		// i=11
		System.out.println("\n======= do~while =======");
		i=1;
		do
		{
			System.out.print(i+" ");
			i++; // i=2 .... i=10 > i=11
			// 증가된 값을 조건 검색
		}while(i<=10);

	}

}
