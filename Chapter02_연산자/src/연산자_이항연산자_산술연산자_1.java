/*
 * 
 *  산술 연산자
 *   | 프로그램에서 가장 많이 사용하는 연산자
 *      +, -, *, /, %
 *      
 *    *** 형변환 > 데이터 형이 다른 경우의 연산처리 ***
 *                큰 데이터 형으로 변경  
 *     ex) 10 + 20.5 = 30.5
 *          |10.0
 *           >자동 변경
 *           
 *         'A'+10 = 75
 *          |65
 *        ** char는 연산처리 되면 무조건 int로 변경 **  
 *        ** int 이하 데이터형 연산 시 int 결과값 도출 **
 *           산술 규칙
 *           byte b1=10      초과가 되는지 알 수 없기 때문에
 *           byte b2=20       결과 값을 int로 도출한다.
 *           b1+b2          
 *           
 *    +  덧셈, 문자열 결합
 *     ex) 2 + 10 = 12
 *         2 + "10" = 210
 *         "10" + 2 = 102
 *    
 *    - 뺄셈
 *     long - int = long
 *     int - int = int
 *     char - char = int
 *     byte - byte - char = int
 *    
 *    * 곱하기
 *     long * int = double
 *     char * char = int
 *     
 *    / 나누기
 *     1) 0으로 나눌 시 오류 발생
 *         ex) 10/0 = 오류
 *      
 *     2) 정수/정수 = 정수
 *        오라클 - 정수/정수 = 실수  
 *        자바 스크립트 - 정수/정수 = 실수
 *        파이썬 - 정수/정수 = 실수
 *               정수//정수 = 정수
 *                
 *    % 나머지 (화폐 매수 구하기, 자리수 자르기, 윤년)
 *     5%2 = 1
 *     > 부호 (-, +) > 좌측 부호를 따라간다
 *     
 *     -5*-2 = 10
 *     -5/-2 = 2
 *     
 *     -5%-2 = -1    
 *     -5%2 = -1
 *      5%-2 = 1
 *      5%2 = 1
 *      
 * 
 */
public class 연산자_이항연산자_산술연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(-5*-2);
       System.out.println(-5/-2);
       System.out.println(-5%-2);
       System.out.println(-5%2);
       System.out.println();
       
	}

}
