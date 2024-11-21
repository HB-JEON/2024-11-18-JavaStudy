/*
 * 
 *  알파벳을 입력
 *   > 대문자 / 소문자 / 알파벳이 아닌 경우
 *  
 *   대문자라면 > if(대문자 조건)
 *   소문자라면 > if(소문자 조건)
 *   알파벳이 아니라면 >(대문자, 소문자가 아니라면)
 *  
 *   > 문법 > 영어
 * 
 */
import java.util.Scanner; // 라이브 러리
public class 자바제어문_단일조건문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("문자 입력:");
		char ch=scan.next().charAt(0); // char를 받는 경우에 사용
		// HELLO
		//System.out.println("ch="+ch);
		/*
		 *  	기본 - 비교연산자
		 *            논리 연산자 > 부정연산자
		 *            
		 *           && > ~에서부터 ~까지 > 사이에 있다면
		 *           || > ~에서부터 ~까지 > 사이에 없다면
		 *            ex) 0~100
		 *                a>=0 && a<=100   > 처리
		 *                 a<0 || a>100    > 다시 입력을 요청하는 경우
		 *                 
		 *           연산자
		 *             오라클 / javascript / 파이썬      
		 *            
		 * 
		 */
		if(ch>='A' && ch<='Z')
			System.out.println(ch+"는(은) 대문자 입니다.");
		if(ch>='a' && ch<='z')
			System.out.println(ch+"는(은) 소문자 입니다.");
		if(!((ch>='A' && ch<='Z') ||(ch>='a' && ch<='z')))
		{
			System.out.println(ch+"는(은) 알파벳이 아닙니다.");
			
		}
		
		
		
	}

}
