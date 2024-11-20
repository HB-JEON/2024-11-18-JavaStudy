/*
 *  형변환 연산자
 *   - long > int / char > int / byte > int
 *     int > double / double > int
 *   
 *  숫자 / 문자(정수인식)
 *         | boolean은 제외
 *   데이터형의 크기
 *         <<<                 >>>
 *      DownCasting         UpCasting
 *      데이터형을 작게        데이터형을 크게
 *          강제                자동
 *    byte < short < int < long < float < double
 *           shar
 *   
 *   
 *   ex) 자동 형변환 
 *   *** 가장 큰 데이터 형으로 변경 ***
 *   
 *    byte b=10;
 *    int i=b;    >  int 변경
 *    
 *    int a=10;
 *    double d=a; >  double 변경
 *      
 *     10 + 10.5 > 20.5 > 연산은 같은 데이터형만 처리 가능
 *     int  double
 *      |
 *    10.0 + 10.5              
 *  >>> 하위 sysout 예제 참고
 *  
 *   *** int 이하 데이터형 (byte, chort, char)
 *      byte  +  byte
 *      100       50  >  150  >  int
 *      char + char = int
 *      short + byte + char = int
 *      double + float = double
 *      
 *   *** 필요시에 강제 변환
 *          | 형변환 연산자
 *       
 *     (int)10.5 + (int)20.3 = 30
 *         10          20    
 *        
 *     (int)(10.5+20.5) = 31   
 *              =31
 *        연산자 > () 최우선   
 *           ex) 
 *              3+5*2 = 13 
 *             (3+5)*2 = 16
 *           
 *    (데이터형)변수
 *    
 *    10/3 = 3 (정수/정수=정수)
 *    10/(double)3 = (정수/실수=실수)
 *     
 *       
 *      
 *  
 */
public class 연산자_단항연산자_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       /* int a=10;
        double d=a;
        System.out.println(d);
        
        char c='A';
        int e=c;
        System.out.println(e);
		
		byte b1=100;
		byte b2=27;
		int b3=b1+b2;
		
		
		int a=10;
		int b=3;
		System.out.println(a/b);
		System.out.println(a/(double)b);
        */
		
		int a=123456;
		float d=123456.78f;
		int res= (int)((d-a)*100);
				System.out.println(res);
		
        		
	}

}
