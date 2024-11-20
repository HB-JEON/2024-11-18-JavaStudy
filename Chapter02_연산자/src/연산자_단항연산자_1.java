/*
 *   자바에서 지원하는 연산자
 *   >  10  +   20
 *       | 연산자  | 피연산자
 *  
 *  1. 피연산자 1개인 경우
 *      단항 연산자
 *  2. 피연산자 2개인 경우
 *      이항 연산자
 *  3. 피연산자 3개인 경우
 *      삼항 연산자
 *   > 데이터 저장 > 연산처리 / 제어처리 > 처리 결과 출력
 *                 | 소스 코딩이 많음 (알고리즘)
 *                 | 재사용 > 관련된 소스를 묶어서 관리
 *                            | 메소드
 * 
 *   변수 / 연산 / 제어문
 *   
 *    변수 - 한개를 저장하여 가공 후 출력
 *         데이터 형을 어떻게 선택할 것인지
 *           ex) 점수 > int
 *               평균 > double 
 *               학점 > String
 *    변수에서 가장 많이 사용되는 데이터형
 *     정수 - int / long
 *       ex)   byte b1=10;
 *             byte b2=127;
 *             byte b3=(b1+b2); (X)
 *            > int b3=(b1+b2); (O)
 *         
 *     실수 - double
 *     문자 - char
 *     논리 - boolean
 *     문자 - String
 *    웹 / 윈도우 > 문자열로 구성
 *          | Jtextfield
 *           <input type="text"> >> int
 *   
 *   /// page38 연산처리
 *    
 *   1. 단항연산자
 *      증감연산자 (++, --) : 1증가, 1감소
 *        | 반복문에 주로 사용
 *           ex) 아바타의 이동, 총알의 이동 (게임)
 *        | 전치 연산자 / 후치 연산자
 *    
 *       int =10;
 *       a++;
 *       > a=11
 *       
 *       int =10;
 *       ++a;
 *       > a=11
 *       
 *       int a=10;
 *       int b= a++;
 *         
 *        b=a
 *        a=a+1
 *         
 *        > b=10, a=11
 *       
 *       int a=10;
 *       int b= ++a;
 *       
 *       a=a+1  
 *       b=a
 *       
 *        > a=11 b=11
 *        
 *       int a=10;
 *       a--; > a=a-1
 *        > a=9
 *        
 *       int a=10;
 *       --a; > a=a-1
 *       > a=9
 *       
 *      기능 : 출력 / 증가
 *       int a=10;
 *       System.out.println(a++);
 *      1.System.out.println(a); > 10
 *      2.a=a+1;
 *      
 *       System.out.println(++a);
 *      1.a=a+1;
 *      2.System.out.println(a); > 11
 *       
 *       
 *       
 *      
 *      
 *      
 *              
 * 
 */
public class 연산자_단항연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*int a=10;
        System.out.println(a++);
        System.out.println(a);*/
        
		/*int a=10;
		System.out.println(++a);
		System.out.println(a);
		
		* 형식 예시)
		*       8 
		*   ---------
		*    값 = 10
		*   변수명 = a
		*   ---------
		*       8
		*   ---------
        *    값 = 11   >> 데이터 가공
		*   변수명 = a
		*   ---------
		*/
		int a=10;
		a++;
		a++;
		--a;
		--a;
		a++;
		System.out.println(a);
		// 변수는 필요 시에 변경이 가능 > 데이터형 변수명
		// 상수는 변경이 불가능한 상태 (데이터 고정이 필요할 때) > final 데이터형 변수형
		
		
		
	}

}
