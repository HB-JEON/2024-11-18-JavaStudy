/*
 * 
 *  웹 개발
 *    자바 - 변수/연산자/제어문/메소드/예외처리 > 라이브러리
 *    오라클 - JDBC > DBCP > MyBatis > JPA
 *    HTML / CSS - 태그 / CSS 속성
 *    JavaScript > Jquery(Ajax) > VueJs > ReactJS > NextJS
 *                 ----------- NodeJS
 *    SpringFramework > Spring-Boot > Spring Security
 *    Python > Numpy, Pandas, MatplotLib, 머신러닝, 딥러닝
 *    ElasticSearch - CRUD > NoSQL
 *    AWS
 *   
 *  메소드
 *    객체지향
 *      구성요소
 *      메소드 > 동작, 행위 > 동적
 *      ** 변수 > 메소드 : 메뉴, 버튼, 마우스, 키보드 입력
 *      ** 다른 클래스와 연결
 *         ------------- 메세지 > 통신
 *      ** 유지보수(메소드 변경), 재사용
 *         --------------- 오버라이딩, 오버로딩(기능 추가)
 *      ** String - 웹/모바일
 *      Class 계산기
 *      {
 *        -------------
 *         변수
 *        -------------
 *         메소드 > 연산자+제어문
 *                plus,minus,div,gop
 *        -------------
 *         생성자
 *        -------------
 *      }
 *      
 *      Class 게시판
 *      {
 *       	글쓰기, 목록, 수정, 삭제, 찾기
 *      }
 *      
 *      Class 자판기 extends 온음료
 *      {
 *      	동전, 커피, 음료수
 *      	동전 투입, 음료수 선택
 *      }
 *       > 설계
 *         기능 ... 인터페이스, 추상클래스...
 *      불안전 > 종료(X) > 사전의 오류 방지 > if, 예외처리
 *    메소드 - 특정 작업을 수행하는 일련의 명령문 집합
 *           ------ 한가지 기능 수행을 권장 
 *      글쓰기()
 *      {
 *      	사용자 입력 내용 읽기
 *      	오라클 연결
 *      	데이터 추가
 *      	오라클 닫기
 *      	> 목록으로 이동
 *      }
 *    메소드 - 가독성(소스가 간결 > 수정)
 *     주 사용처 - 클래스와 클래스의 연결 설정
 *     주 사용의 이유
 *      1) 재사용
 *      2) 유지보수(수정, 추가)
 *      3) 중복코드 제거
 *      4) 구조적인 프로그램
 *    
 *     메소드의 구조
 *      1) 선언부
 *          리턴형(결과값)
 *          매개변수 (사용자의 요청값)
 *          메소드명
 *      2) 구현부
 *          {
 *          	(구현부 공간)
 *          	처리
 *          	return > 메소드의 끝 > 없는 경우 > 컴파일러가 자동으로 추가하는 경우
 *          }
 *          
 *     메소드 형식
 *      [접근지정어][옵션] 리턴형 메소드명(매개변수...)
 *                    --------------------
 *                                 매개변수 - 갯수와 상관 X, 3개이상이면 배열/클래스 사용
 *                                   사용자 요청 값
 *                                   아이디 중복 체크 > id
 *                                   로그인 > id, pwd, boolean
 *                                    remember-me (사용자 기억)
 *                                   회원가입 > id, pwd, name, sex...
 *                        메소드명               
 *                          변수 식별자
 *                          소문자로 시작
 *                          
 *              리턴형 - 반드시 한개만 설정 > 없는 경우 void 작성
 *                1. 기본형
 *                2. 클래스 (String)
 *                3. 배열
 *                
 *          static(공유) - 자동 메모리 할당 
 *          final(종단) - 확장 불가능(변경 불가능)
 *          abstract(추상) - 공통적인.. > 구현은 없고 선언
 *      
 *      1. 리턴형 / 매개변수 > 기본형
 *          int plus(int a,int b)
 *           > 사용자로부터 2개의 정수를 받아서 더한 값을 보내준다.
 *           
 *      2. 리턴형이 배열
 *          int[] getData()
 *          {
 *          	int[] arr=new int[3];
 *          	return arr; // 배열은 배열명만 전송
 *          } 
 *      
 *      3. 리턴형/매개변수 > 모두 배열
 *          int[] getData(int[] arr)
 *          {
 *          	return arr;
 *          {
 *          
 *      4. 클래스
 *          String getData(String s)
 *          {
 *          	return s;
 *          }
 *          
 *      5. 경우의 수가 많은 경우
 *          로그인
 *           아이디가 없는 경우
 *           비밀번호가  틀린 경우
 *           로그인    
 *           String / int > 상수 처리 > NOID/NOPWD/LOGIN
 *          
 *     메소드 호출
 *      리턴형이 없는 경우
 *      void print(int a)
 *      {
 *      
 *      }
 *      > print() > 매개변수가 있는 경우 값는 채워서 처리
 *        print(100) > a=100 처리     
 *          
 */
public class 메소드_1 {
	static long display()
	{
		return 10;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a=display();
		
	}

}
