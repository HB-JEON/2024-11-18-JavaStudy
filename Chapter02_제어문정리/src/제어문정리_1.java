/*
 *  
 *  자바에서 제공하는 제어문
 *   조건문
 *    형식)
 *       단일조건문 - 독립적으로 처리
 *        if(조건문) > true/false
 *        {            | 부정연산자 / 논리연산자 / 비교연산자
 *        	 조건 true일 때 처리 / 조건 false 수행하지 않음 
 *        }
 *       
 *       선택조건문 - true / false 나눠서 처리
 *        *** 웹에서 가장 많이 사용되는 조건문 ***
 *        *** 조건문 만들기 연습 ***
 *        *** 기본 사이트 제작 > JSP(MVC) / Spring / Spring-Boot ***
 *        		> Django
 *        if(조건문) > 로그인이 된 경우
 *        {
 *       	 조건 true일 때 처리
 *        }
 *        else > 로그인 실패
 *        {
 *       	 조건이 false일 때 처리
 *        }
 *       
 *       다중조건문 - 조건문을 여러개 사용 > 해당 조건만 출력
 *       			| 메뉴 / 화면을 찾기
 *        if(조건문) page1
 *        {
 *        	 조건이 true일 때 처리문장 > 수행 종료
 *        	main.jsp로 이동...
 *        		  | false면 다음 조건을 찾는다.
 *        }
 *        else if(조건문) page2
 *        {
 *        	 예약화면
 *             | false
 *        } 
 *        else if(조건문)
 *        {
 *        	 상세보기
 *        }
 *        else
 *        {
 *        	 해당 조건이 없는 경우
 *        	 main.jsp
 *        }
 *        
 *  선택문
 *      switch(정수/문자/문자열)
 *              | 문자 '' > char / 문자열 "" > String
 *      *** 웹 / 윈도우의 모든 데이터는 String 사용 ***
 *               | 다른 데이터형이 필요할 때는 변경
 *               | Interger.parseInt("10") > 10
 *               | Double.parseDouble("5.0") > 5.0
 *               | Byte / Boolean > Wrapper
 *               | char[] > 제어 > String
 *               
 *      switch(정수/문자/문자열)
 *      {
 *      	case 값1:
 *      		수행문장
 *      		break;
 *          case 값2:
 *          	수행문장
 *          	break;
 *          default:
 *          	수행문장
 *      }
 *         > 무조건 break를 사용하는 것은 아니다
 *             | 같은 수행문장을 수행할 때는 break 사용
 *           case 10: casee9: > jumsu==10 || jumsu==9
 *                 score='A';
 *         > case에 중복 데이터는 사용 불가
 *           다중 조건문으로 변경이 가능
 *           프로그램은 정답이 없다 > 잘 짠 프로그램
 *           			         | 가독성 / 최적화 / 유지보수 / **공통모듈**(반복을 최대한 제거)
 *           												| AOP / 인터셉트
 *  반복문 - 중복제거
 *      for - 횟수가 지정된 경우
 *               | 웹 화면 UI
 *    형식)          
 *             1    2    4 
 *       for(초기값;조건식;증가식)
 *       {          | true / false면 종료
 *                3
 *       	반복수행문장
 *       }                  1 > 2 > 3 > 4 > 2 > 3 > 4(2번에서 false가 될 때까지 반복)
 *           가장 많이 사용되는 반복문
 *           웹에서는 특별한 경우 외엔 이중 for문을 거의 사용 X
 *           웹 - 송수신
 *                어떤 값을 보내고 받을 것인지
 *       
 *      while - 횟수가 지정되지 않은 경우
 *               | 데이터베이스 / 파일읽기
 *                 선조건 검색 > 한번도 실행이 안되는 경우도 존재
 *                 
 *    형식)
 *       
 *       초기값               1
 *       while(조건문)        2
 *       {
 *       	반복수행문장        3
 *       	증가식            4 > 조건검색 요청 > 2
 *       }                    
 *       
 *       while(true)
 *       {
 *       	반복수행문장
 *       	 | 종료하는 조건 무조건 작성
 *       }
 *                 
 *      do~while - while문과 동일
 *                   | 후조건 검색 > 무조건 한번 이상 수행
 *                   
 *    형식                     
 *    
 *      초기값                1     
 *      do
 *      {
 *      	반복수행문장        2 > 무조건 문장 한번을 수행
 *      	증가식            3
 *      }while(조건식);       4
 *              | false일 때 종료
 *      
 *      반복제어문장
 *       break - 반복을 종료할 시 사용
 *       			| for,while,do~while > 무조건 종료
 *       			  switch,반복문에서 사용
 *       continue - 특정 부분을 제외할 시 사용
 *       			| for > 증가식으로 이동
 *       			  while > 조건식으로 이동 > 무한루프가 걸릴 수 있다
 *      ** 소속 반복문만 제어 **
 *      
 *     이름있는 브레이크
 *      
 *      outer:for()
 *       {
 *       	for()
 *       	{
 *       		break;outer;
 *       	}
 *       }    
 *      
 *      ** 사용 빈도는 거의 없다 **
 *      
 *      ★☆☆☆★
 *      ☆★☆★☆
 *      ☆☆★☆☆
 *      ☆★☆★☆
 *      ★☆☆☆★
 * 
 */
public class 제어문정리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if((i==j)||(6-i==j))
					System.out.print("★");
				else
				{
					System.out.print("☆");
				}

			}
			System.out.println();
		}
		
	}

}
