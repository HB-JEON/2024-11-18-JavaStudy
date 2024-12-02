/*
 * 
 *  자바에서 지원하는 제어문 54 ~ 83page
 *  ** 변수 / 연산자 제어문 > 기본
 *  메소드 / 객체지향 프로그램
 *  라이브러리 > 조립
 *  
 *  제어문 > 연산자 응용
 *   |배열
 *     |메소드
 *       |클래스
 *       
 *  1. 제어문
 *     조건문 - 사용자 요청에 맞게 처리 > 필요 시 문장 수행 > 필요없을 시 건너뛴다
 *     			| 검색, 상세보기, 로그인, 아이디 중복 체크 등
 *      단일 조건문 - 독립 문장 수행
 *       if(조건문) > 조건문에 사용되는 연산자
 *       			  | 부정연산자(1), 비교연산자(==, !=, <, >, <=, >=)
 *       				논리 연산자(&&, ||) > 반드시 true/false
 *       {
 *       	조건문 true일 때 실행하는 문장
 *       }
 *      	조건이 true > 문장 실행 / false > 건너뛰기
 *      	54 page
 *     55 page
 *     중첩 if문 - 조건이 모두 true일 때 수행
 *      if(조건문)
 *      {
 *      	if{조건문)
 *      	{
 *      		조건 ture일 때 수행
 *      	}
 *      }
 *     중첩 조건문 대신 사용 > &&(소스를 단축)
 *      | 특별한 경우에만 사용
 *        메뉴 조절
 *        if(로그인이 되어 있다면)
 *        {
 *        	if(사용자라면)
 *        	{
 *        		마이 페이지
 *        	}
 *        	if(관리자라면)
 *        	{
 *        		관리자 페이지
 *        	}
 *        }
 *     
 *     	if(조건 && 조건)
 *      {
 *      }
 *       
 *     56 page
 *     선택조건문 - true/false를 나눠 따로 처리
 *       | 가장 많이 사용되는 조건문
 *         웹 - 모든 내용을 브라우저로 전송
 *         		| true/false 체크
 *                아이디 중복 체크, 검색, 에러발생, 에러 미발생 ...
 *     	if(조건문)
 *     	{
 *     		조건 true
 *      }
 *      else 
 *      {
 *      	조건 false
 *      }
 *     다중조건문 - 메뉴처리, 키보드 처리, 별점처리
 *     		** 여러개의 조건문을 사용하지만 한개의 조건만 수행 ***
 *      if(조건문)
 *      {
 *      	조건 true 수행 > 종료
 *      	조건 false > 다음 조건으로 이동
 *      }
 *      else if(조건문)
 *      {
 *      	조건 true 수행 > 종료
 *      	조건 false > 다음 조건으로 이동 
 *      }
 *      else if(조건문)
 *      {
 *     		조건 true 수행 > 종료
 *      	조건 false > 다음 조건으로 이동
 *      }
 *      else
 *      {
 *      	** 생략 가능 **
 *      	조건이 모두 false 시 무조건 수행
 *      }
 *      연산자 입력
 *      if(op=='+')
 *      {
 *      }
 *      else if(op=='-')
 *      {
 *      }
 *       else if(op=='*')
 *      {
 *      }
 *       else if(op=='/')
 *      {
 *      }
 *       else
 *      {
 *      	없는 연산자 입니다. > 잘못된 입력
 *      }
 *     선택문
 *     반복문
 *     반복제어문
 *  
 *  다중 조건문 예제
 *   사용자로부터 정수 2개, 연산자 (+, -, *, /)
 *  	 중첩 조건문 > 나누기 값의 0 여부 확인
 *   프로그램은 비정상 종료가 없는 프로그램, 사전에 오류를 방지
 *   웹 - 비정상 종료를 방지 > 에러 발생 시 > 건너뛰기(다음 문장으로 이동) > 8장 예외처리
 */
import java.util.*;
// 자바에서 지원하는 라이브러리 클래스를 가지고 올 때 import
public class 자바제어문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 키보드에 입력을 받아서 변수에 저장 > Scanner
		
		Scanner scan=new Scanner(System.in); // 참조 연산자 > 객체지향
		/*  자바에서 클래스 저장 시 반드시 new를 이용(동적 메모리 할당, 저장)
		 *   malloc(클래스의 크기) > 메모리 생성
		 *     | 승격(new)
		 *  free() > delete : 자바 > 자동 메모리 회수 : 가비지컬렉션(GC)
		*/ 
		
		System.out.print("첫번째 정수 입력:");
		int num1=scan.nextInt();
		System.out.print("두번째 정수 입력:");
		int num2=scan.nextInt();
		
		System.out.print("연산자 입력(+,-,*,/):");
		char op=scan.next().charAt(0);
		// 맨 처음 문자를 읽는 경우에 사용 = charAt()
		// 문자열은 0번부터 수행
		System.out.println("num1="+num1);
		System.out.println("num2="+num2);
		System.out.println("op="+op);
		
		// 연산처리 > 4개의 경우의 수 > 한 번만 실행 = 다중 조건문
		if(op=='+')
			System.out.println(num1+"+"+num2+"="+(num1+num2));
			// 종료
		else if(op=='-')
			System.out.println(num1+"-"+num2+"="+(num1-num2));
			// 종료
			// *, /, % 우선순위 +,- 나중순위
		else if(op=='*')
			System.out.println(num1+"*"+num2+"="+num1*num2);
		else if(op=='/')
		{
			if(num2==0)
				System.out.println("0으로 나눌 수 없습니다."); // 오류처리
			else
				System.out.println(num1+"/"+num2+"="+num1/num2);
		}
		else
			System.out.println("사용하지 않는 연산자를 입력 하셨습니다.");
		
	}

}
