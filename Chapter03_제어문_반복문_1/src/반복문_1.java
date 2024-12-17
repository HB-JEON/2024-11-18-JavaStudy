/*
 *  자바에서 제공하는 반복문 / 반복제어문
 *   > 목록 출력
 *  반복문의 종류
 *   for(65 page) - 반복문 중에 가장 많이 사용되는 제어문 > for / if
 *   				반복 횟수가 지정된 경우 주로 사용(10회 반복)
 *   while(70 page) - 데이터베이스 / 파일 읽기
 *   				  반복 횟수가 없는 경우
 *   				  선조건(조건을 먼저 검색) > 한번도 수행을 안할 수 있음
 *   do while(75 page) - 자바에서의 사용빈도 매우 낮음
 *   					 반복 횟수가 없는 경우
 *   					 후조건 (조건을 나중에 검색) > 무조건 한번 이상 수행
 *   					 게임, 네트워크 서버 제작
 *   쉬프트/비트/반전연산자는 웹에서 사용하지 않음
 *   쉬프트 연산자
 *    이동 영산자 <<, >>
 *   비트연산자
 *    *(*), |(+), ^
 *   반전연산자
 *    ~ 음수 > 양수, 양수 > 음수
 *    
 *   반복분
 *    for(65 page) - 반복 횟수가 지정된 경우 주로 사용되는 반복문
 *     
 *     for(초기값;조건식;증감식)
 *     		반복수행문장
 *     
 *     		실행문장 > 독립문장(for와 관련X)
 *     
 *     for(초기값;조건식;증감식)
 *     {
 *     		문장1
 *     		문장2
 *     		문장3
 *          ...
 *          ...
 *     }
 *     
 *      ** 자바에서 모든 제어문 바로 밑에 잇는 문장 1개만 수행 **
 *         제어문을 이용하여 여러개 문장을 수행 시 {} 사용
 *         
 *  초기식 - 시작점 int i=1
 *  조건식 - 종료점 i<=10 > false
 *  증감식 - 증가 감소 > ++, --, +-, -+
 *  
 *   for문 동작 순서
 *    
 *    for(①초기식;②조건식;④증감식)
 *    {
 *    		③반복실행문장
 *    }
 *    
 *    ① > ② < ④
 *    	  | false면 종료
 * 		  | true ↗
 *    ①초기식 - 한번만 수행
 *    ②조건식 - false가 될 때까지 수행 > true/false
 *    								부정연산자, 비교연산자, 논리연산자만 사용 가능
 *    ④증감식 - ②조건식이 false가 나올 때까지 증가/감소
 *    ③반복실행문장 - 조건이 true일 때까지 수행
 *    ① > ② > ③ > ④
 *     | false 상태가 될 때까지 반복 후 false에 도달 시 종료
 *    ① 시작 ② 끝 ③ 실행문장 ④ 증가
 *     ex) 1~10
 *      int i=1 i<10 i++
 *         A~Z
 *      char c='A' c<='Z' c++
 *         10~1
 *      int i=10 i>=1 i--
 *         Z~A
 *      char c='Z' c>='A' c++
 */


public class 반복문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello Java!!!");
		System.out.println("Hello Java!!!");
		System.out.println("Hello Java!!!");
		System.out.println("Hello Java!!!");
		System.out.println("Hello Java!!!");
		System.out.println("=================");
		for(int i=1;i<=5;i++) // 줄수
		{
			System.out.println("Hello Java!!!");
		}
		System.out.println("=================");
		for(int i=5;i>=1;i--)
		{
			System.out.println("Hello Java!!!");
		}
		// Coockie에 저장 > 역순(최신순) > 게시물/예약현황 > 오라클(DESC)
			

	}

}
