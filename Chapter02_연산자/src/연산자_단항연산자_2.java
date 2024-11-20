/*
 *  부정 연산자 (!)
 *   | 조건문 (로그인이 안된 경우, 예약 날짜가 아닌 경우, 턴제 게임...)
 *   | 단점 - boolean만 사용 가능
 *           true > !true
 *      ex) 
 *          boolean bCheck=false;
 *          !bCheck > true
 *
 *  
 */
public class 연산자_단항연산자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        boolean bCheck=false; // boolean - 논리형 true/false만 저장 가능
        System.out.println(bCheck); // false
        bCheck=!bCheck; // true 변경
        System.out.println(bCheck); // true
        
        /*int kor=55;
        if(!(kor>=60)) // 조건문 - 조건을 제시한 후 맞으면 ture 틀리면 false
        {
        	
        }
        
        * 연산자 > 응용(제어문)
        * !는 부정문의 효과
        */ 
        
        		
        
	}

}
