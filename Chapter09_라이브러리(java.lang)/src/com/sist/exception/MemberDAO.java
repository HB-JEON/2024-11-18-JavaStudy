package com.sist.exception;
import java.util.*;
import java.sql.*;
/*
 *   클래스의 구성요소
 *     => 라이브러리
 *         어떤 라이브러리 사용 여부
 *          => 네트워크 - java.net
 *          => 오라클 - java.sql
 *          => 파일 - java.io
 *          => 전체적으로 사용 => String / Object - java.lang
 *                                                --------- 
 *                                                 가장 많이 사용되는 클래스
 *                                                 import 생략(자동추가)
 *          => 자동
 *              1) import java.lang.*;
 *              2) class ClassName extends Object
 *                                 --------------
 *                 Object - 객체 생성  /  객체 정보  /  객체 소멸  /  객체 비교 /  객체 복제...
 *                                       | ***toString   | finalize   | **equals | **clone   
 *                                          hashCode
 *                  => 프로그램에 맞춰 오버라이딩
 *              3) 생성자가 없는 경우
 *                  => 자동으로 default 생성자 생성(매개변수 X)
 *                  => 생성자 => 시작과 동시에 처리 / 초기화(파일/데이터베이스)
 *                     ----- 초기화 블록(인스턴스블록, 정적블록)
 *                  => 다른 클래스에서 연결하여 사용 => public
 *              4) 각 클래스마다 기능 => 메소드
 *                  메소드 => 한가지 기능 수행
 *                           반복이 많은 경우
 *                           재사용할 목적
 *                   *** 메소드 필요 시 에러를 방지하기 위해 예외처리
 *                       ----------------------
 *                        CheckException 반드시 처리
 *                        try ~ catch 주로 사용
 *                   *** static 메소드 / static 블록
 *                        1) 반드시 static 사용
 *                        2) 인스턴스 사용 시 반드시 객체 생성
 *                        3) static 컴파일 시 자동 저장
 *                           인스턴스는 객체를 생성한 후 저장                                         
 *     => 사용자 변수 - 클래스 전체 / 다른 클래스
 *         => 벤치마킹
 *     => 초기화 - 생성자, 초기화 블록
 *     => 기능 설정 - 무슨 기능을 가지고 있는지 여부
 *         => 어떤 기능 - 메뉴, 버튼
 *         => 결과 화면 => ***리턴형
 *         => ***매개변수 - 인풋으로 제공되는 여러 데이터 중 하나
 *     => 라이브러리 사용
 *        ------------
 *         예외처리가 필요한 경우
 *        
 *      1) 메소드 안에서 예외처리
 *         [접근지정어] 리턴형 메소드명(사용자 요청값)
 *         {
 *            String s=""
 *            try
 *            {
 *               int a=10;
 *            }catch() {}
 *            finally {}
 *            retrun s
 *         }
 *         => 전체적으로 사용 -> 멤버변수
 *         => 사용하고 버리는 변수 -> 지역변수
 *     
 *      JDBC - 원시소스
 *       |
 *      DBCP - 미리 연결 => 속도 향상
 *       |
 *   ***MyBatis - google 제공 라이브러리
 *       |
 *      JPA      
 *      
 */
public class MemberDAO {
	// 멤버변수 => 클래스 전체적으로 사용하는 변수
	private Connection conn;  // 오라클 연결 => null 초기화
	private PreparedStatement ps; // 오라클 명령문 전송/결과 값 읽기
	// 오라클은 공유된 데이터 => static 변수
	private final String URL="jdbc:oracle:thin:@211.238.142.124:1521:XE"; 
	// 초기화
	public MemberDAO() // throws => 호출하는 위치에서 예외처리
	{
		// 드라이버 등록
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException e) 
		{
			// 에러 발생 시 확인
			// getMessage() - 어떠한 에러 / printStackTrace() - 위치확인
			System.out.println(e.getMessage()); 
		}
	}
	// 오라클 => 오라클 연결 -> 문장 전송 -> 결과값 읽기 -> 오라클 닫기
	// 공통 모듈
	// 오라클 연결 
	public void getConnection()
	{
		
	}
	// 오라클 닫기
	public void disConnection()
	{
		
	}
}
