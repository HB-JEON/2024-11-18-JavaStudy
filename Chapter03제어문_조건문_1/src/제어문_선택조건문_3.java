/*
 * 
 *  if(조건문)
 *  {
 *  	조건 > true > 문장 
 *  }
 *  else
 *  {
 *  	조건 > false > 문장
 *  }
 * 
 *  if(조건문)  
 *  {
 *  }          
 *  ㅡㅡㅡㅡㅡㅡㅡㅡㅡ > 단일 조건문
 *  if(조건문)
 *  {
 *  }
 *  else > 바로 직전의 if(조건문)만을 처리 > 단독 사용 불가능
 *  {
 *  }          
 * 
 *  다중 조건문       page58 > 해당 조건에 맞는 내용 한개 실행
 *  if(조건문)	
 *  {
 *  	실행문장
 *  	조건 true > 해당 문장만 실행 > 종료
 *  	조건 false
 *  }        ↓
 *  else if(조건문)	
 *  {
 *  	실행문장
 *  	조건 true > 해당 문장만 실행 > 종료
 *  	조건 false
 *  }        ↓
 *  else if(조건문)	
 *  {
 *  	실행문장
 *  	조건 true > 해당 문장만 실행 > 종료
 *  	조건 false
 *  }        ↓
 *  else if(조건문)	
 *  {
 *  	실행문장
 *      조건 true > 해당 문장만 실행 > 종료
 *  	조건 false
 *  }        ↓
 *  else(생략가능)
 *  {
 *  	실행문장
 *  }
 *  
 *  게임 - key 선택 > UP/DOWN/LEFT/RIHGT / ENTER,Space
 *  메뉴 - 다중 조건문
 * 
 */
public class 제어문_선택조건문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a=15; 
		/*
		if(a%3==0)
			System.out.println(a+"는(은) 3의 배수");
		else if(a%5==0)
			System.out.println(a+"는(은) 5의 배수");
		else if(a%7==0)
			System.out.println(a+"는(은) 7의 배수");
		else
			System.out.println(a+"는(은) 3,5,7의 배수 X");
			*/
		// 틀린 출력 - 조건에 여러개를 수행해야 하기 때문에
		
		if(a%3==0)
			System.out.println(a+"는(은) 3의 배수");
		if(a%5==0)
			System.out.println(a+"는(은) 5의 배수");
		if(a%7==0)
			System.out.println(a+"는(은) 7의 배수");
		// ex) 연관 검색어
	}

}
