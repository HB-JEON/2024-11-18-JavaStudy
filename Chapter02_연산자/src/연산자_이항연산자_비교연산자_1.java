/*
 * 
 *  비교연산자
 *   숫자 혹은 논리만 비교 가능
 *   문자는 비교 불가능 
 *    ex) "" = "" > equals()
 *    
 *      ==  :  같다
 *      !=  :  같지 않다
 *      오라클 : = , <>  
 *      Javascript : ===, !==
 *      <   :  작다
 *      >   :  크다
 *      <=  :  작거나 같다
 *      >=  :  크거나 같다
 *  
 *    결과 값은 true/false > 조건문
 *    
 * 
 * 
 */
public class 연산자_이항연산자_비교연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(6==7);
		System.out.println(6!=7);
		System.out.println(6<7);
		System.out.println(6>7);
		System.out.println(6<=6); // 6<6 or 6==6
		System.out.println(6>=6); // 6>6 or 6==6
		
		System.out.println("======");
		char c='A'; // char는 연산 처리되면 정수로 변경
		int a=65;
		/*
		 *  'A' = 65 'B' = 66
		 *  'a' = 97 'b' = 98
		 *  '0' = 48 '1' = 49
		 */
		System.out.println(c==a);
		c='0'; // 48
		a=0;
		// 문자형 '0' , '1' > '1'-'0'
		System.out.println((int)'A');
		System.out.println((int)'a');
		System.out.println((c-c)==a);
		System.out.println((int)'+'); //43
		System.out.println((int)'*'); //42
		System.out.println((int)'/'); //47
		System.out.println((int)'-'); //45   
		// Unicode > 0~65535
		System.out.println((int)'김');
		
		boolean bCheck1=false;
		boolean bCheck2=true;
		// > == , != 만 사용 가능 
		System.out.println(bCheck1==bCheck2);
		System.out.println(bCheck1!=bCheck2);
		
		String s1=new String("Hello");
		String s2=new String("Hello");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2); // 주소가 다르기 때문에 false
		System.out.println(s1.equals(s2)); // 글자만 검색한 것이기 때문에 true
		
		int x=10;
		int y=9;
		
		//System.out.println(x==y++); // 비교 후에 증가 
		System.out.println(x==++y); // 증가 후에 비교
		
		// 비교 연산자 > 조건문, 반복문
		// > 로그인, 아이디 중복, 우편번호 검색, 검색어...
		
		

	}

}
