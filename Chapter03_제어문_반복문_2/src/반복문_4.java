/*
 * 
 *  while문 - 반복횟수 지정 X
 *  
 *  	초기값           1
 *             | false > 종료      
 *      while(조건식)    2
 *      {      | true 문장 수행
 *          반복수행문장   3
 *          증감식       4
 *      }
 * 		
 * 		데이터베이스, 서버(자바서버 > 인트라넷), 파일 읽기
 * 						| 사내 메신저
 * 						| 게임
 * 			> 무한루프 while(true)
 * 				| Front
 *      while문은 실행이 안되는 경우 > 선조건
 *      
 *      초기값            1
 *      
 *      do
 *      {
 *      	반복수행문장    2
 *      	증감식        3
 *      }
 *      while(조건식);    4    > 후조건(1번 이상을 무조건 수행)
 */
public class 반복문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~10까지 출력 > 2중 while은 사용안함
		
		int i=1;
		while(i<=10)
		{
			System.out.print(i+" "); // 반복수행문장
			i++; // 증가식
		}
		// for(int i=;i<=10;i++)
		
	}

}
