/*
 * 
 *   1장  자바 설치/ 자바 특징 / 주의점
 *         자바의 특징
 *          - 호환성 우수
 *          - 메모리 자동 회수 (가비지 컬렉션)
 *          - 멀티 쓰레드
 *         자바 설치
 *          jdk.java.net/
 *          classpath - .;c;\jdk-17.0.2\lib
 *          path - c:\jdk-17.0.2\bin
 *          
 *         > 대소문자 구분
 *         > {}
 *         > 들여쓰기
 *         > 주석 - 프로그램 분석 편의성
 *         > ctrl+shift+/ 여러줄 주석
 *           ctrl+shift+\ 주석 해제
 *           ctrl+\ 한줄 주석
 *           ctrl+/ 주석 해제
 *         > ctrl+space > 자동완성
 *          
 *   2장  변수 / 연산자
 *         변수 - 한개의 데이터를 저장하는 메모리 공간(주소)의 명칭
 *          변수의 역할
 *           - 쓰기 (메모리 저장 = 대입) / int(역할) a=10(쓰기)
 *           - 읽기 / a
 *           - 수정 / a=100
 *         변수(변경이 가능한 값) / 상수(변경이 불가능한 값)
 *          변수
 *          	데이터형 변수명;
 *          상수
 *          	final 데이터형 변수명=10; > 오류 발생
 *          	배열의 개수 > 상수
 *          	데이터형의 최대값, 최소값
 *         								모든 데이터형에 대한 정보를 가지고 있는 클래스 > Wrapper
 *         메모리 크기 결정
 *          참조형
 *          	사용자 정의(class)
 *          기본형
 *          	자바에서 지원
 *          	정수형
 *          	 byte - 1byte, 네트워크 전송, 파일읽기
 *                    -128~127
 *               int - 4byte 컴퓨터의 모든 정수
 *                 -21억 4천~ 21억 40천
 *          	문자형
 *          	 char - 2byte 멀티바이트(unicode)
 *          		   0~65535
 *          			표기법 '' > 한글자 설정
 *          			한글만 저장 가능 > 불편 > 여러개 동시에 저장
 *                                            → String
 *          	실수형
 *          	 double - 8byte 
 *          			  소수점 15자리
 *          	논리형
 *          	 boolean - 1byte 
 *          			   true/false
 *         		byte < char < int < long < double
 *         
 *         식별자 (page 26)
 *          1. 알파벳 또는 한글로 시작
 *          	> 알파벳 > 대소문자 구분
 *          	> 한글(자바), 웹에서는 알파벳
 *          2. 변수의 길이 > 제한은 없으나 3~10 권장
 *          3. 숫자 사용 가능 (단 첫자로는 사용 불가능)
 *          4. 특수문자(_, $)만 사용 가능
 *          5. 공백 사용 불가능
 *          6. 키워드 사용 금지
 *          7. 약속(권장) 사항
 *          	변수, 메소드 > 소문자 시작
 *          	클래스, 인터페이스 > 대문자 시작
 *          	상수 - 대문자로 사용
 *          식별자 적용
 *          	변수 / 메소드 / 클래스 / 인터페이스 / 추상클래스
 *          
 *         변수선언
 *          데이터형 변수명;
 *          	정수, 문자, 실수, 논리 구분
 *         변수의 초기화
 *          정수형
 *          	byte b=10; > 127
 *          				일반 숫자
 *          	int i=10; > 21억 4천
 *          	char c='A' > 한글 가능
 *          		'null' > 값이 없는 상태
 *          	long 1=10L; > 대입하는 수 L
 *          실수형
 *          	double d=10.9D > D 생략 가능 
 *          논리형
 *          	boolean b=true/false
 *          
 *          *** main()
 *          	{
 *          		변수 > 지역변수
 *          				**  자동 초기화 X	**
 *          				 초기값을 설정 후 사용 
 *          	}
 *         변수 프로그램 제어
 *          	 지역 변수
 *          	 멤버변수
 *          	  인스턴스변수 > int a; > 0
 *          	  공유변수
 *           	자바 / 자바스크립트 > 데이터 관리 프로그램
 *          						변수 - 한개 저장
 *          						배열 - 같은 데이터형을 여러개 저장 
 *          						클래스 - 다른 데이터형을 여러개 저장
 *          							저장 공간(메모리)
 *          						파일
 *          						RDBMS - 오라클 / MySQL / MariaDB
 *          
 *        연산자
 *         단항연산자
 *         	증감연산자 ++(1증가), --(1감소)
 *         	 ex) 상세보기, 좋아요,  찜하기
 *         		후치연산자 - 다른 연산을 먼저 수행 > 증가
 *          	int a=10;
 *          	int b=a++;
 *          	1)다른 연산 수행
 *          		b=a > b=10
 *          		2)a값 1증가
 *          		a=a+1 > a=11
 *         	전치연산자 - 먼저 증가하고 나중에 다른 연산 수행
 *         		int a=10;
 *         		int b=++a;
 *         		1)a값을 증가
 *         			a=a+1 > a=11
 *         		2)b에 대입
 *         			b=a > b=11
 *          부정연산자(!) > boolean만 사용
 *          		boolean b=false;
 *          		!b > true
 *          		> 조건문에서 사용 if, for, while(제어문에 주로 사용)
 *          형변환 연산자(page 50)
 *          		DownCasting(강제형변환) <				> UpCasting(자동형변환)
 *          					→명시적형변환							→묵시적형변환
 *          					byte < char < int < long < double
 *           자동형변환
 *         		long 1=10
 *         			int > 자동으로 10L
 *         		int a='A'
 *         			char > 자동으로 int 65
 *         	 강제형변환
 *         		int a=10.5
 *         		 > (int)10.5 > 10
 *         
 *         이항연산자 - 가장 많이 사용되는 연산자
 *          산술연산자(+, -, *, /, %)
 *          	+ 문자열 결합, 더하기
 *          		ex) "6"+7 = "67"
 *          			7+"7" = "77"
 *          			7+7+"77" = "1477"
 *          	 ** 산술규칙 **
 *          		1) 같은 데이터형만 연산
 *          			10+10.5
 *          			10.0+10.5 = 20.5(큰데이터형으로 통일)
 *          			'A' + 10
 *          			char  int
 *          			 65 + 10 = 75
 *          		2) int 이하 데이터형(byte,char)의 결과값은 int
 *          			char+char = int
 *         				byte+char = int
 *         				char+byte = int
 *          	- 빼기
 *          	/ 
 *          		1) 0으로 나눌 수 없다 > 나누는 값이 0인지 여부 확인
 *          								> 오류 발생
 *          		2) 정수/정수 = 정수
 *          			10/3 = 3, 5/2 = 2
 *         				실수로 나뉜다 (소수점)
 *         		% 나머지 > 남는 값이 왼쪽 부호를 따라간다
 *         			5%2=1
 *         			5%-2=1
 *         			-5%2=-1
 *         			-5%-2=-1
 *          
 *          비교연산자 - 모든 결과값이 boolean > 조건문
 *          	== 같다 (오라클 = / 자바스크립트 ===)
 *          	!= 같지 않다 (오라클 <> / 자바스크립트 !==)
 *          	<  작다
 *          	>  크다
 *          	<= 작거나 같다 = < || ==
 *        		>= 크거나 같다 = > || ==
 *        								적용되는 데이터형 숫자, 문자만 가능
 *        
 *          논리연산자 - 결과값 boolean < 조건문, 반복문
 *          	%% - 직렬 연산자
 *          		 모든 데이터가 true일 때 처리
 *          	|| - 병렬 연산자
 *          		 한개의 데이터라도 true일 때 처리
 *         			
 *         			(조건) && (조건)     (조건) || (조건)
 *         	          |        |         |       |
 *         				 결과값               결과값
 *                조건    &&    조건
 *    	           ---------------- 
 *                true        true   =  true
 *                 ----------------
 *                true       false   =  false
 *                 ----------------
 *                false       true   =  false
 *                 ----------------
 *                false      false   =  false
 *                  
 *                조건    ||    조건
 *                ---------------- 
 *                true        true   =  true
 *                ----------------
 *                true       false   =  true
 *                ----------------
 *                false       true   =  true
 *                ----------------
 *                false      false   =  false
 *          ** && - 앞선 조건이 false 뒤에 조건을 처리하지 않는다.
 *          ** || = 앞선 조건이 true 뒤에 조건을 처리하지 않는다.
 *          
 *          	 int x=10;
 *          	 int y=9;
 *          
 *         		  x<y  &&  x==++y
 *         		  false  > 종료   > 실행하지 않는다.
 *          
 *        		   x>y  ||  x==++y
 *        		   true           > 연산하지 않는다.
 *          
 *           **&& - 범위 포함
 *          	 	 if(score>=0 && score<=100)	
 *           ** || - 범위에 없는 경우 > 잘못된 입력
 *         		 	 if(score<0 && score>100)
 *         대입연산자
 *           = 대입 
 *              int a=10; = 10을 a에 대입한다.
 *          	int b=20;
 *          	int c=a+b; a+b값을 더한 후 c에 대입한다.
 *          	
 *          	왼쪽 > 오른쪽
 *          	오른쪽 > 왼쪽 > 대입연산자
 *          	> 대입연산자는 연산자 마지막
 *           ** 산술연산자 - *, /, % > +, -
 *           	비교연산자
 *              논리연산자 - && > ||
 *              대입연산자
 *              > () 최우선 연산
 *              						>> 복합대입 연산자
 *            =+ 여러개 증가
 *            -= 여러개 감소 
 *             데이터 베이스 연결 시 주로 사용	
 *           	int a=10;			int a=10;
 *           	 > 5개 증가			 > 5개 감소
 *           	a++;				a--;
 *              a++;				a--;
 *              a++;				a--;
 *              a++;				a--;
 *              a++;      			a--;
 *              = a+=5; = a=a+5		= a-=5; = a=a-5
 *              
 *         								>> 자바 / 웹에서 사용
 *         삼항연산자
 *          	if~else > true/false를 나눠서 처리
 *          	? : 
 *             > (조건)?값1:값2
 *               true = 값1
 *               false = 값2
 *               > 복잡한 소스를 간결하게 만들 때 사용
 *               	웹(HTML+Java), 게임
 *         	
 *          사용자 요청에 맞게 출력, 데이터 전송 > 제어문	
 *        
 *        
 *         
 *   3장  제어문
 *         조건문
 *         	단일조건문
 *         	 형식 > 흐름(동작순서) > 문법적용
 *         	  조건문 사용 연산자 > 부정연산자, 논리연산자, 비교연산자
 *         		if(조건문 > 결과값 true/false > 수행/건너뛰기) 
 *         		{
 *         			조건문이 true일 때 수행하는 문장
 *         		}
 *         			>> 상세보기, 페이징
 *          선택조건문
 *           	if(조건문) 조건문 사용하는 방법
 *           	{
 *           		조건이 true일 때 처리문장
 *           	}
 *           	else
 *          	{
 *           		조건이 false일 때 처리문장
 *           	}
 *           		>> 로그인, 아이디 중복체크, 우편번호 검색, 예약...
 *          다중조건문 - 단순하게 제작 > swtch~case
 *           프로그램
 *             가독성
 *             최적화(실행속도)
 *             재사용성
 *           	if(조건문)
 *           	{
 *           		실행문장 > true > 종료
 *           				 false
 *           	}
 *         		else if(조건문)
 *           	{
 *           		실행문장 > true > 종료
 *           				 false
 *           	}
 *           	else if(조건문)
 *           	{
 *           		실행문장 > true > 종료
 *                      	 false
 *           	}
 *          	else if(조건문)
 *           	{
 *           		실행문장 > true > 종료
 *           	}
 *             		>> 메뉴, 버튼
 *         선택문
 *           switch~case - 다중조건문 : 가독성
 *         반복문
 *           do~while - 무조건 한번 이상 수행 > 조건을 나중에 처리
 *           	do
 *           	{
 *           		실행문장
 *           	}while(조건문) > 자바에서는 사용빈도가 낮음
 *           
 *           while - 반복 횟수가 지정되지 않은 반복문(무한루프)
 *           		>> 데이터 베이스, 파일읽기
 *           
 *           for - 반복 횟수가 지정된 반복문
 *           		가장 많이 사용되는 반복문
 *           	이중 for
 *           	 알고리즘 : 정렬 / 빈도 구하기 / 등수 구하기
 *           		>> 정보처리 실기, 코딩 테스트
 *         반복제어문 - 반복문 제어
 *         	 break - 반복문 종료
 *           continue - 반복문 일시정지
 *         
 *   4장  배열
 *   5장  객체지향 프로그램
 *   6장  상속
 *   7장  추상클래스 / 인터페이스
 *   8장  예외처리
 *   9장  라이브러리
 *        ** java.util ** / ** java.io **  / java.lang 
 *         ** java.sql ** / java.net 
 * 
 * 
 * 
 */
import java.util.*;
public class 정리_1주차 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(Byte.MAX_VALUE);
		// 모든 데이터형에 대한 정보를 가지고 있는 클래스 > Wrapper
		
		/*
		int[] arr= {30,40,20,50,10};
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
		}
			System.out.println(Arrays.toString(arr));
			*/
		
		 
		
	}
	
	

}
