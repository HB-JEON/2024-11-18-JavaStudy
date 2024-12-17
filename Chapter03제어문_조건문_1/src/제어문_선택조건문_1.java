/*
 *   
 *   선택문 - 조건 true일 때 처리
 *          조건 false일 때 처리
 *   ex) 로그인(0) / 로그인(X)
 *   
 *  page 56
 *   무조건 수행(두줄에 한개의 문장만 수행)
 *    if(조건문)
 *    {
 *        조건문 true일 때 처리하는 문장 > 종료
 *    }
 *    else
 *    {
 *        조건문이 false일 때 처리하는 문장 > 종료
 *    }
 * 
 *  점수 입력 >
 *  60이상 합격, 이하 불합격
 * 
 */

public class 제어문_선택조건문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char c='A';
		int type=(int)(Math.random()*2);
		if(type==0)
		{
			c=(char)((Math.random()*26)+65); // 대문자
		}
		if(type==1)
		{
			c=(char)((Math.random()*26)+97); // 소문자
		}
		System.out.println("c="+c);
		
		System.out.println("===== 결과값 =====");
		
		if(c>='A' && c<='Z') // true(대문자)
			System.out.println(c+"는(은) 대문자입니다.");
		//if(c>='a' && c<='z')
		else // false(소문자)
			System.out.println(c+"는(은) 소문자입니다.");
			
	}

}
