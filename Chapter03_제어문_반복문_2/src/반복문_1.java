/*
 * 
 *  웹개발 > 데이터베이스(SQL)
 *  	- server단 : back > 자바 / 스프링 / 데이터베이스 연동
 *  	- db단 : DBA
 *  	- view단 : back > 자바스크립트
 *  						| jquery > VueJS > React > Next
 *  			MSA, DevOps(option) / AWS
 *  				> Spring Cloud
 *  			자바 / 파이썬 > 데이터분석 (Numpy, Pandas, Matplotlib)
 *  						  > DJango <> Spring
 *    						  > ElasticSearch : NoSQL
 *    							  | Google
 *    						  > 코딩테스트(option)
 *  
 *  조건문 - ** 단일조건문 / 선택조건문 ** / 다중조건문
 *  			     단일조건문 > 독립시행
 *  				 if(조건문) > 조건 (부정연산자, 비교연산자, 논리연산자)
 *                   {
 *                   	조건 true 수행 > false 수행 X
 *                   }
 *                   > 오류처리 > 8장 예외처리
 *                   > 비정상 종료를 방지 및 프로그램 유지
 *                   > 유효성 검사
 *                   
 *                   선택조건문 > true와 false를 나눠서 처리 // 아이디 중복체크 / 우편번호 검색 / 로그인 / 회원가입
 *                   if(조건문)
 *                   {
 *                   	조건 true > 처리
 *                   }
 *                   else
 *                   {
 *                   	조건 false > 처리
 *                   }
 *                   웹 > 무조건 결과값 전송
 *                   
 *                   다중조건문 > 1개의 조건만 수행 // 메뉴 / 카테고리 선택
 *                   if(조건문)
 *                   {
 *                   }
 *                   else if(조건문)
 *                   {
 *                   	조건 true > 수행 > 종료
 *                   		false > 다음 조건문
 *                   }
 *                    else if(조건문)
 *                   {
 *                   	조건 true > 수행 > 종료
 *                   		false > 다음 조건문
 *                   }
 *                    else
 *                   {
 *                   	해당 조건이 없을 경우 무조건 실행(생략 가능)
 *                   }
 *
 *  선택문 - switch~case
 *  		다중 조건문과 유사, 범위를 지정, 값을 한개만 선택
 *  			     switch(문자/정수/문자열)
 *                   {
 *                   	case 값1:
 *                   		실행문장
 *                   	break;
 *                   	case 값2:
 *                   		실행문자
 *                   	break;
 *                   	default:
 *                   		실행문장
 *                   }
 *  반복문 - ** for / while ** / do~while
 *  		for - 반복 횟수가 지정된 경우 > 웹(반복횟수)
 *  				> 화면 UI > 목록 / 슬라이드
 *  				> Front
 *  			for
 *  				 1	   2	4
 *  			for(초기식;조건식;증감식;)
 *  			{
 *  				반복 수행문 3
 *  			}
 *  	        초기식은 한번 수행
 *              조건식은 false까지
 *              증가식은 조건식에 있는 변수를 변경 > false가 되게 만든다
 *              
 *              무한루프 > for(;;)
 *              
 *              > for(여기서부터 시작;여기까지 도달;증가/감소)
 *              							 ++, -- 한개씩 / +=, -= 여러개씩
 *        68 page
 *        	중첩 for문(이중 for문)
 *        			 1	   2
 *              for(초기식;조건식;증감식) > 세로 > 줄수 // false 종료 / true
 *              {		 1     2
 *                  for(초기식;조건식;증감식) > 가로
 *                  {
 *                      반복 수행문 3
 *                  }
 *              }
 *              
 *          while - 반복 횟수가 지정되지 않은 경우
 *          		> 데이터베이스 / 파일 읽기
 *          		> Back
 *              
 *          do~while - 후조건 > 반복문장 1번을 먼저 수행
 *          		> 반드시 한번 이상 수행
 *  반복제어문 - ** break ** / continue
 * 
 */
public class 반복문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=4;i++) // 줄수
		{
			// 이차 for문 종료되면 일차 증가식으로 이동
			for(int j=1;j<=4;j++) // 화면출력
			{
				System.out.print("★");
			}
			System.out.println();
		}
		/*
		 *  i=1  > j=1~j=5
		 *  i=2  > j=1~j=5
		 *  i=3  > j=1~j=5
		 *  i=4  > j=1~j=5
		 * 
		 */

	}

}
