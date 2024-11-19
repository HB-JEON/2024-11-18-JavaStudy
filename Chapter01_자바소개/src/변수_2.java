/*
 * 
 *  초기값 => 데이터를 저장하는 방법
 * 
 *  자바에서 사용하는 표현법
 *  1. 정수
 *     byte / short / int => 숫자 사용 (범위를 초과하지 않는다)
 *     숫자 표현
 *       10 - 10진법
 *     **012 - 8진법**
 *        ex) 날짜 2024-09-20 (시간)
 *             => 8진법 => error
 *     0x12 - 16진법
 *     long 표현
 *      10L, 10l
 *     
 *     실수형
 *      10.5 => double
 *      10.5F 10.5f
 *     
 *     문자형
 *      한글자만 저장
 *      'A' / "" - 문자열 여러개의 문자 사용 가능 
 *                     ex) "ABCD..."
 *                     
 *     논리형
 *      true / false
 *      
 *    데이터 저장 방법
 *     1) 명시적 초기화
 *         int a=10;
 *     2) 입력을 받아서 초기화
 *     3) 난수 발생    
 *                  
 *    변수 선언
 *     선언과 동시에 값을 저장
 *     데이터형 변수명 = 값
 *    
 *    선언
 *     데이터형 변수명;
 *     값을 저장
 *     변수명 = 값
 *    
 *    *** 변수 선언만 하고 사용하면 error 발생 ***
 *   
 *    
 *    
 *        
 */
public class 변수_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 정수
		byte byeval=127; // -128~127
		/*
		 * =======
		 *   127 -> byteVal
		 * ======= 1byte
		 */
		short shortVal=32767; //-32768~32767
		/*
		 * =======
		 * 
		 *  32767 -> 별칭 => shortVal
		 * ======= 2byte
		 */
		int intVal=21400000;
		/*
		 * int
		 * 4byte 메모리 공간 생성
		 * => 21400000을 저장
		 * => 이 메모리를 사용하려면 intVal를 이용한다.
		 * => 수정이 가능하다.
		 * 
		 */
		long longVal=3000000000L; //long표현인 L표기 필수
		/*
		 *  8byte 메모리 공간 생성
		 *  3000000000L 저장
		 * => 사용 시 longVal
		 * => 변수
		 *     1) 저장
		 *     2) 값읽기
		 *     3) 수정
		 */
		longVal=100L;
		// 값읽기
		System.out.println(longVal);
		// 큰데이터형에는 작은 값 저장 가능
		long a=100; // 100L
		System.out.println(a);
		
		int b='A';
		System.out.println(b);
		// 문자 1개만 가능
		
		char c=65;
		System.out.println(c);
		// 'A'= 65, 'a'=97, '0'=48
		
		//System.out.println((int)'홍');
		
		boolean boo=false;
		System.out.println(boo); // 조건문 = 제어문
		
		float f=10.5F;
		System.out.println(f);
		
		double d=10.5f;
		// 좌측 데이터형이 크거나 같아야 저장이 가능하다.
		/*
		 *   데이터는 선언된 데이터형을 따라간다.
		 *   
		 *   byte = byte
		 *   short = short, byte
		 *   int = int, char, short, byte
		 *   long = long, int, char, short, byte
		 *   float = float, long, int, char, short, byte
		 *   double = double, float, long, int, char, short, byte
		 *   
		 *   자동 형변환
		 *   
		 *   (int)10.5 => 10
		 *   (double)10 => 10.0
		 *   (int)'A' => 65
		 *   (char)65 => 'A'
		 *   (double)'A' => 65.0
		 *   (float)'A' => 65.5F
		 *   
		 *   10/(double)3 = 3.33333...
		 *           10/3 = 3
		 *   
		 */
		
		System.out.println(10/3);
		System.out.println(10/(double)3);
		
		// ***int / long / double / char / boolean***
		
		
		
		
		
	}

}
