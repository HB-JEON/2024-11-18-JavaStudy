import java.text.ChoiceFormat;

public class 메소드_오답 {
	
//	1. 1~10까지 출력하는 메소드를 구현하시오.
	
//	static void print()
//	{
//		for(int i=1;i<=10;i++)
//		{
//			System.out.println(i+" ");
//		}
//	}
	
//	2. 1~10까지 합을 구하는 메소드를 구현하시오.
	
//	static int print()
//	{
//		int sum=0;
//		for(int i=1;i<=10;i++)
//		{
//			sum+=i;
//		}
//		return sum;
//	}
	
//	3. 1~n까지 합을 구하는 메소드를 구현하시오.
	
//	static int print3(int n)
//	{
//		int sum=0;
//		for(int i=1;i<=n;i++)
//		{
//			sum+=i;
//		}
//		return sum;
//	}
	
//	4. 두 정수의 나눗셈 결과를 구하는 메소드를 구현하시오.(실수)
	
//	static String print4(int a,int b)
//	// String 사용 시 예외처리 가능 double은 불가능
//	{
//		if(b==0)
//			return "0으로 나눌 수 없다";  // B가 0이면 여기서 종료
//		return String.valueOf(a/(double)b);
//		// return 메소드를 종료 > return 메소드 안에서 여러개 사용 가능
//		/*
//		 *  메소드가 종료하는 시점은 return
//		 *  반복문은 break
//		 *  > 메소드는 원하는 위치에서 종료가 가능
//		 *  > 입력이 안된 경우
//		 */
//	}
	
//	5. 문자열의 소문자를 대문자로 바꾸는 메소드를 구현하시오.
	
//	static void change(String s)
//	{
//		s=s.toUpperCase();// 자체에서 처리
//		System.out.println(s);
//	}
//	static String change2(String s)
//	{
//		return s.toUpperCase();
//	}
	
	/*  
	 *  for(int i=0;i<s.lenght;i++)
	 *  {
	 *  	char c=s.charAt(i);
	 *  	if(c>='a' && c<='z')
	 *  	{
	 *  		c=(char)(c-32)
	 *  	}
	 *  }
	 */

//	*** 6. 문자열을 입력받아서 좌우 대칭인지 확인하는 메소드를 구현하시오. ***
	
//	static String change3(String s)
//	{
//		// **** 오류 처리 ****
//		if(s.length()%2!=0)
//			return "문자열 갯수는 짝수여야 합니다.";
//		
//		String res=""; // 둘 중 하나만 전송         좌우대칭
//		boolean bCheck=true;
//		for(int i=0;i<s.length()/2;i++)
//		{
//			char start=s.charAt(i);
//			char end=s.charAt(s.length()-1-i);
//			if(start!=end)
//			{
//				bCheck=false;
//				break;
//			}
//		}
//		if(bCheck==true)
//			res="좌우대칭 입니다.";
//		else
//			res="좌우대칭이 아닙니다.";
//		
//		return res; 
//	}
	
	/*
	 *  경우의 수 3개
	 *  
	 */
	
//	7. 문자열을 거꾸로 출력하는 메소드를 구현하시오.
	
//	static void reverse(String s)
//	{	
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			System.out.print(s.charAt(i));
//		}
//		System.out.println(new StringBuilder(s).reverse()); // 거꾸로 출력하는 라이브러리
//	}
	
//	8. 학점을 구하는 메소드를 구현하시오.
	
//	static void hakjum(int kor)
//	{
//		char c='A';
//		switch(kor/10)
//		{
//		case 10: case9:
//			c='A';
//			break;
//		case 8:
//			c='B';
//			break;
//		case 7:
//			c='C';
//			break;
//		case 6:
//			c='D';
//			break;
//		default:
//			c='F';
//		}
//		System.out.println("학점:"+c);
//	}
//	// java.text > DecimalFormat - 10000 > 10,000
//	//             SimpleDateFormat - 날짜 변환
//	//             ChoiceFormat - 값 선택
//	//             MessageFormat > 오라클 Insert
//	static void hakjum2(int kor)
//	{
//		double[] limit={50,60,70,80,90};
//		String[] grade={"F","D","C","B","A"};
//		ChoiceFormat cf=new ChoiceFormat(limit, grade); // F : 50~59, D : 60~69
//		System.out.println("학점:"+cf.format(kor));
//		
//	}
	
//	9. 년도를 입력받아서 윤년인지 여부를 확인하는 메소드를 구현하시오.  12.05~ 1~7번 문항 다시 확인하고 9~14 오늘 해보기
	
	
	
//	10. 두수를 입력받아 큰 수를 출력하는 메소드를 구현하시오.
	
	
	
//	11. 입력 받은 값이 짝수인지 홀숨인지 판별하는 메소드를 구현하시오.
	
	
	
//	12. 3의 배수를 판별하는 메소드를 구현하시오.
	
	
	
//	13. 년,월,일을 입력받아서 요일을 구하는 메소드를 구현하시오.
	
	
	
//	14. 메소드를 정의하여 입력받은 숫자를 거꾸로 뒤집은 쉬를 출력하는 프로그램을 작성하세요.
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		2. 1~10까지 합을 구하는 메소드를 구현하시오
		
//		int hap=print2();
//		System.out.println("\n 1~10의 합:"+hap);
		
//		3. 1~n까지 합을 구하는 메소드를 구현하시오.
		
//		hap=print3(100);
//		System.out.println("1~n까지의 합:"+hap);
		
//		4. 두 정수의 나눗셈 결과를 구하는 메소드를 구현하시오.(실수)
		
//		String d=print4(10, 0);
//		// Infinity > 0으로 나눈 경우에 에러 메세지
//		System.out.println(d);
		
//		5. 문자열의 소문자를 대문자로 바꾸는 메소드를 구현하시오.
		
//		change("abcDEFgh");
//		String s=change2("abcDEFgh");
//		System.out.println(s);
		
//		6. 문자열을 입력받아서 좌우 대칭인지 확인하는 메소드를 구현하시오.
		
//		String ss=change3("ABCDDCBA");
//		System.out.println(ss);
		
//		7. 문자열을 거꾸로 출력하는 메소드를 구현하시오.
		
//		reverse("\nABCDEFG");
		
//		8. 학점을 구하는 메소드를 구현하시오.
		
//		hakjum(80);
//		hakjum2(40);
		
//		9. 년도를 입력받아서 윤년인지 여부를 확인하는 메소드를 구현하시오.
		
		
		
//		10. 두수를 입력받아 큰 수를 출력하는 메소드를 구현하시오.
		
		
		
//		11. 입력 받은 값이 짝수인지 홀숨인지 판별하는 메소드를 구현하시오.
		
		
		
//		12. 3의 배수를 판별하는 메소드를 구현하시오.
		
		
		
//		13. 년,월,일을 입력받아서 요일을 구하는 메소드를 구현하시오.
		
		
		
//		14. 메소드를 정의하여 입력받은 숫자를 거꾸로 뒤집은 쉬를 출력하는 프로그램을 작성하세요.
		
		
		
		
	}

}
