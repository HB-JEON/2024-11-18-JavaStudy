/*
 * 
 *  1. 자바에서 변수에 대한 설명 중 틀린 것은 무엇입니까?  4
 *  
 *   1) 변수는 하나의 값만 저장할 수 있다.
 *   2) 변수는 선언 시에 사용한 타입의 값만 저장할 수 있다.
 *   3) 변수는 변수가 선언된 중괄호 {} 안에서만 사용 가능하다.
 *   4) 변수는 초기값이 저장되지 않은 상태에서 읽을 수 있다.
 *     
 *     변수 - 한개의 데이터만 저장할 수 있는 메모리 공간의 이름
 *           선언된 데이터형에 맞게 저장
 *  
 *  2. 변수의 이름으로 사용 가능한 것을 모두 선택하세요.  1,4,5
 *  
 *   1)modelName > 정상 >헝거리언식
 *   2)class > 키워드
 *   3)6hour > 숫자가 앞에 오면 안됨
 *   4)%value > %, _ 사용 가능
 *   5)_age > %, _ 사용 가능
 *   6)int > 키워드
 *  >>> 변수 문법 참조
 *  
 *  
 *  3. 다음 표의 빈칸에 자바의 기본타입(Primitive Type) 8개를 적어보세요.
 *  
 *     ==============================================================
*                      정수       실수       문자       논리
*                      
*      ==============================================================
*      1byte         **byte**                    **boolean**
*                    -128~127                    ture/false
*      ==============================================================
*      2byte          short             **char**
*                  -32768~32767          0~65535
*      ==============================================================
*      4byte         **int**    float
*                -21억4천~21억4천  6자리
*      ==============================================================
*      8byte        **long**  **double** 
*                     2^63       15자리
*      ==============================================================
 *  
 * 4. 다음 코드에서 타입, 변수 이름, 리터럴에 해당하는 것을 적어보세요.
 * 
 * int age;
 * 
 * age=10;
 * 
 * double price=3.14;
 * 
 * 타입(데이터형) ( int ),( double )
 * 변수명 ( age ) ( price )
 * 리터럴 ( 10; ) ( 3.14; )
 * 
 * 
 * 5. 변수를 잘못 초기화한 것은 무엇입니까?
 *  1)int var1 = 10;
 *  2)long var2 = 10000000000L;
 *  3)char var3 = ‘’; > '' = null(X) ' ' 한개의 문자를 첨부
 *  4)double var4 = 10;
 *  5)float var5 = 10;
 *  
 *  6. 다음 코드를 실행했을 때 출력 결과는 무엇입니까? 32
 * 
 *   public class Exercise02{
 *      public static void main(String[] args) {
 *         int x = 10;
 *         int y = 20;
 *         int z = (++x) + (y--);
 *         System.out.println(z);
 *      }
 * }
 *
 *
 * 7. 다음 코드를 실행했을 때 출력 결과는 무엇입니까? 가
 * 
 *  public class Exercise03 {
 *       public static void main(String[] args) {
 *               int score = 85;
 *                        String result = (!(score>90))? "가":"나";                                         
 *                                           | !false
 *                                            > true
 *                                           | 삼항 연산자
 *                                            (조건) ?  값1 : 값2
 *                                              |       |    |
 *                                              |  true |    |
 *                                              ㅡㅡㅡㅡㅡㅡ false       
 *                                                 
 *                                                 
 *                                 System.out.println(result);
 *                                      }
 *         }
 *
 * 8. 534자루의 연필을 30명의 학생들에게 똑같은 개수로 나누어 줄 때 학생당 몇 개를 가질 수 있고,
 *    최종적으로 몇 개가 남는지를 구하는 코드입니다. ( #1 ) ( #2 )에 들어갈 알맞은 코드를 작성하세요.
 *
 * 9. 다음은 십의 자리 이하를 버리는 코드입니다. 변수 value의 값이 356이라면 300이 나올 수 있도록 
 *   ( #1 ) 에 알맞은 코드를 작성하세요. (산술 연산자만 사용하세요)
 *    value-(value%100)
 *    
 *    public class Exercise05{
 *         public  static void main(String[] args) {
 *                 int value = 356;
 *                           System.out.println( #1 );
 *                              }
 *                }
 *
 * 10. 사용자로부터 세 개의 정수를 입력받은 다음에 곱과 합을 순서대로 진행해서 그 결과를 출력하는 프로그램을 작성해보자.
 *     예를 들어 사용자로부터 순서대로 입력받은 세 개의 정수가 1, 2, 3 이라면 1 * 2 + 3의 계산 결과를 출력해야 한다. 
 *      단 출력 양식은 다음과 같아야 한다.
 * 
 * 		Scanner scan=new Scanner(System.in);
		System.out.print("세개의 정수 입력(1 2 3)");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		
		System.out.printf("%d * %d + %d = %d", a,b,c,(a*b+c));
 * 
 *  11. 두 개의 정수를 입력 받아서 첫째 수를 둘째 수로 나눈 
        나머지를 출력하는 프로그램을 작성해 보자.
 * 
 * 
 * 
 * 
 */

import java.util.Scanner;

public class 연산자_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.print("두개 정수 입력(10 20)");
		int a=scan.nextInt();
		int b=scan.nextInt();
		
		System.out.printf("%d %% %d = %d",a,b,a%b);
		
		
		 
		
				
		
		
	}

}
