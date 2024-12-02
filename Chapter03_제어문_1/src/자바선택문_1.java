/*
 * 
 *  선택문 - 다중 조건문을 단순화 시킨 제어문 > 한개만 수행이 가능
 *  		 | 게임, 네트워크
 *  		 | 값을 한개만 선택(선택문), 범위(다중조건문)
 *  		 | 웹에서의 사용 빈도가 거의 없다
 *  		 	> if / if~else / for / while / break
 *   형식
 *    switch(정수|문자|문자열)
 *    
 *     1) 정수(메뉴)
 *     		no=0
 *     		  | 0 > 처리문장 0,1,2,3,4까지 처리
 *      switch(no) > 0,1,2...
 *      {
 *      	case 0:
 *      		처리문장1
 *      		break; > 종료 berak는 반드시 주는 것이 아닌 같은 내용을 실행 할 때 사용 
 *      	case 1:
 *      		처리문장2
 *      		break;
 *      	case 2:
 *      		처리문장3
 *      		break;
 *      	default: > else > 해당 번호가 없는 경우에 처리
 *      		처리문장4
 *      }
 *      
 *       90~100 > A > 90~100 > 1 > case 문장을 최대한 간소화
 *       case 10:
 *       case 9:
 *       	A
 *       	break
 *       case 10: case 9: > if(score==10 || score==9)
 *       	처리문장
 *       	break;
 *       
 *  다중조건문과 동일 > 한개의 case에 있는 문장만 수행
 * 
 */
public class 자바선택문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score=(int)(Math.random()*101);
		int avg=score/10; //0~10
		/*
		 *  주의점
		 *   1) case는 동일하면 안된다
		 *   2) 반드시 정렬하지 않아도 된다
		 */
		
		switch(avg) // 정수, 문자, 문자열만 사용 가능
		{
			case 10: case 9: // 같은 출력이 있는 경우
				/* avg==10 || avg==9
				 * 다중조건문보다 가독성이 좋음
				 *  > 다중조건문은 범위를 지정하기 때문에 사용 빈도가 높음
				 * 선택문은 범위 지정이 불가능
				 *  > 데이터베이스는 10000단위 저장
				*/
				System.out.println(score+"점은 A등급 입니다.");
				break;
			case 8:
				System.out.println(score+"점은 B등급 입니다.");
				break;
			case 7:
				System.out.println(score+"점은 C등급 입니다.");
				break;
			case 6:
				System.out.println(score+"점은 D등급 입니다.");
				break;
			default: //생략이 가능
				System.out.println(score+"점은 F등급 입니다.");
				
		}

	}

}
