/*
 * 
 *    1. 변수 - 한개만 저장하는 공간, 변경 가능
 *             메모리 저장 / 값 읽기 / 수정
 *        지역변수 - 메소드 안에서 선언되는 변수
 *        멤버변수
 *        공유변수
 *        
 *        변수 저장 시 반드시 필요한 내용
 *         메모리 크기 결정 / 클래스(JVM에서 크기 인식 X)
 *                             | new 새로운 메모리 생성    
 *        기본형
 *        정수 - byte(1byte), ***int(4byte), long(8byte)
 *               | -128~127	     |-21억 4천~21억 4천
 *        실수 - ***double(8byte)
 *                  | 소수점 15자리 이상
 *        논리 - ***boolean(1byte)
 *                  | true/false
 *        문자 - char(2byte)
 *               | 0~65535
 *        참조형 - 배열 / 클래스 (***String,Integer,ArrayList)
 *        오라클 - Connection / Statement / ResultSet
 *        
 *        ***변경이 되는 값
 *            누적 / 루프
 *            ***가독성
 *                i/j > a/b, m/n
 *            입력값
 *            난수값
 *        
 *        메모리 저장
 *         MethodArea - Method / static(공유변수)
 *         Stack - 메모리 자체에서 관리 > 지역변수 
 *                 {} 종료 시 삭제
 *         Heap - 실제 데이터 공간(클래스/배열)
 *                자동으로 유지 > 개발자가 처리
 *                new / delete > 가비지 컬렉션
 *                               자동 메모리 회수
 *                메모리 저장 > 확인 int malloc() > new
 *                           해제 free() > delete
 *                           
 *       사용자 요청에 따른 데이터 처리
 *        1) 연산자
 *            단항연산자 (++, --, !, (type))
 *                                 | 강제 형변환 > 클래스형변환
 *             ! true/false 사용                 클래스의 크기
 *               true > false                   is-a, has-a 
 *               false > true                          | 포함 클래스
 *             ++ , -- 반복문                            | JOIN
 *             a++ 후치연산자
 *             ++a 전치연산자
 *            
 *            이항연산자(+,-,*,/,% > == != < > <= >= => && ||)
 *             모든 연산자는 같은 데이터형만 연산이 가능
 *              10+10.5
 *               > 10.0+10.5 > 20.5
 *              + : 산술/문자열 결합
 *                       | +=concat("aaa")
 *              > String s="Hello";
 *                String s1="Java";
 *                String s2=s+s1;        > Hello Java
 *                String s3=s.concat(s1) > Hello Java 결과값이 같음
 *              *산술규칙
 *                같은 데이터형만 연산이 가능
 *                int이하(byte,short,char) > 결과값 int
 *              / : 0으로 나눌 수 없다.
 *                  정수/정수 = 정수
 *              % : 남는 부호 > 왼쪽 부호
 *                  -5%-2 = -1
 *                  -5%2 = -1
 *                  5%-2 = 1
 *                  5%2 = 1  
 *              == , != , < , > , <= , >=
 *               > boolean 조건문이나 반복문의 조건에서 주로 사용
 *               > 숫자 , boolean : == , !=   
 *              
 *              && 직렬연산자 - 양쪽의 조건이 true
 *              || 병렬연산자 - 한족의 조건이 true > true
 *              *** &&연산자 > 범위 포함, 기간 범위
 *                   조건 && 조건
 *                   false > 후위 조건은 수행 X
 *                           효율적인 연산
 *                  ||연산자 > 잘못된 입력 > 범위 초과, 범위 미만
 *                   조건 || 조건
 *                   true > 처리 X
 *              == , += , -=
 *              대입 연산자
 *              += : 여러개 증가
 *               int a=10;
 *               a++ > 11
 *               a+=5 > 15 > a=a+5
 *              -= : 여러개 감소     
 *               a-- a=9
 *               a-=5 > 5 > a=a-5
 *              하나씩 증가
 *              a++ , ++a , a+=1 , a=a+1
 *              하나씩 감소
 *              a-- , --a , a-=1 , a=a-1
 *                      
 *            삼항연산자(?:) JSP에서 주로 사용
 *             (조건)?값1:값2
 *             true > 값1
 *             false > 값2   >   if ~ else
 *             
 *             curpage>1 > curpage-1:curpage
 *             
 *             <html>
 *              <body>
 *               <%
 *                    if(curpage>1)
 *                    {
 *               >%   
 *                       <a href="<%=curpage-1%>">이전</a> 
 *               <%        
 *                    }    
 *                    else(curpage<totalpage)
 *                    {
 *               >%     
 *                       <a href="<%=curpage%>">이전</a>
 *               <%        
 *                    }
 *               %>
 *              </body>
 *             <html>
 *             
 *             <html>
 *              <body>
 *                  <a href="<%=curpage>1%curpage<-1%>">이전</a>
 *              </body>
 *             <html>
 *             
 *        2) 제어문
 *           if, if~else
 *           조건문
 *            if(조건문)
 *            {
 *                조건 true 수행
 *            }
 *            if(조건문)
 *            {
 *               조건 true 수행
 *            }
 *            else
 *            {
 *               조건 false 수행
 *            }
 *            
 *           for, while
 *           
 *                 1    2    4
 *            for(초기식;조건식;증가식)
 *            {
 *               실행문장 3
 *            }
 *            
 *            초기식        1
 *            while(조건식) 2
 *            {
 *               실행문자    3
 *               증가식     4
 *            }
 *            
 *            while(true)
 *            {
 *               실행문장
 *               if(조건)
 *               {
 *                  break
 *               }
 *            }
 *            
 *           break
 *        연산자와 제어문 묶어서 처리 > 메소드 > 중복 제거
 *        1. 입력
 *        2. 처리 > 세분화
 *        3. 출력
 *                           
 * 
 */

import java.util.Scanner;
public class 자바1_3_정리 {
	
	// 멤버변수 > 자동초기화 int a; > a=0
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 지역변수 > 초기화 X < int a; > 오류
		// toUpperCase toLowerCase
		

	}

}
