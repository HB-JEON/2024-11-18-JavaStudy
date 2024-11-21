/*
 *  산술 연산식
 *   형변환
 *   - 연산 규칙 : 같은 데이터형만 연산처리 가능
 *   - 자동형변환 : 큰 데이트형으로 변경하여 연산 
 *     (묵시적)
 *         ex) int + int = int
 *             logn + int = long
 *             int 이하의 데이터형(byte. short, char)은 int로 계산
 *             byte + byte = int
 *             char + byte = int
 *   - 강제형변환 : 큰 데이터형에서 작은 데이터형으로 변경
 *     (명시적)
 *     
 *  + 더하기, 문자열 겷합
 *          10+"10" = 1010
 *         "10"+10" = 1010
 *                   
 *  / 0으로 나눌 수 없다. > 조건
 *    정수/정수 = 정수
 *  % 배수 > 부호는 항상 좌측 부호
 *    - % - = -
 *    - % + = -
 *    + % - = + 
 *    + % + = +
 *  
 *  && - 포함 : 로그인 (아이디 && 비밀번호)
 *  || - 비포함 : 오류 처리
 *  
 *  자바 변수에 저장 > 프로그램 종료 시 삭제
 *   파일 / 오라클  > 영구적인 저장 장치
 *   
 * 
 */


import java.util.Scanner;
public class 자바제어문_제어문문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력:"); // 음수/양수
		int num=scan.nextInt();
		
		if(num>=0)
		{
			System.out.println(num+"양수");
		}
		if(num<0)
		{
			System.out.println(num+"음수");
		}	
		
		
		if(num%3==0)
		{
			System.out.println(num+"3의 배수");
		}
		if(num%3!=0)
		{
			System.out.println(num+"3의 배수X");
		}
		
		
		if(num%7==0)
			System.out.println(num+"7의 배수");
		if(num%7!=0)
			System.out.println(num+"7의 배수X");
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("2자리 정수입력(10~99사이):"); 
		int num=scan.nextInt();	
		
		if(num%11==0)
		{
		 system.out.println("10의 자리와 1의 자리가 같습니다.")
		 }
		 if(num%11!=0)
		{
		 system.out.println("10의 자리와 1의 자리가 다릅니다.")
		 }
		
		int =anum/10;
		int b=num%10;
		if(a==b)
		
		Scanner scan=new Scanner(System.in);
		System.out.println("2달 입력(1~12):"); 
		int month=scan.nextInt();
		
		if(num%11==0)
		{
		 system.out.println("10의 자리와 1의 자리가 같습니다.")
		 }
		 if(num%11!=0)
		{
		 system.out.println("10의 자리와 1의 자리가 다릅니다.")
		 }
		 
		 if(month>=3 && month<=5)
		  system.out.println("봄입니다.")
		  if(month>=6 && month<=8)
		  system.out.println("여름입니다.")
		  if(month>=9 && month<=11)
		  system.out.println("가을입니다.")
		  if(month>==1 || month==2 || month==12)
		  system.out.println("겨울입니다.")
		
		*** 요구한 결과값을 출력 ***
		> 가독성
		> 최적화
		
			
		*/
		
		
	}

}
