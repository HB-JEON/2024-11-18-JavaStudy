package com.sist.exception;
/*
 * 
 *   1) 예외처리 방식과 형식
 *      -----------------
 *       CheckException => 컴파일 시
 *         => java.io / java.net / java.sql
 *         => 밙드시 예외처리 사용
 *         => 컴파일 시 예외처리 확인
 *       UnCheckException => 런타임(실행 시)
 *         => java. lang / java.utill
 *             => Object => clone() => 예외처리가 필요
 *                          ------- 메모리 복제(prototype)
 *         => 예외처리를 필요 시 작성
 *                     ------ 사용자가 자주 발생하는 에러가 있는 경우
 *       => 예외 종류 / 형식
 *             => 웹 개발 => network(c/s) => 반드시 얘외처리
 *           1) 직접처리(예외 복구)
 *               try
 *               {
 *                  실행이 가능한 소스 코딩(정상 수행)
 *                   => 에러가 발생 => 사전에 방지하는 목적
 *                   => 에러가 발생한 경우 => 스킵 => catch 이동
 *                      if else 유사
 *               }catch(예외 클래스)
 *               {
 *                  1. 에러 확인 가능
 *                     getMessage() => 에러 메세지만 확인
 *                     printStackTrace() => 실행과정 => 에러위치 확인
 *                  2. 복구 확인
 *               }
 *               finally => 생략 가능
 *               {
 *                  try ~ catch 상관 없이 무조건 수행
 *                  ----------- 에러(X), 에러(O)
 *                   => 서버 닫기 / 오라클 닫기 / 파일 닫기
 *               }
 *               
 *               *** catch => 에러 발생 시 처리하는 영역
 *                   ----- 다중 catch 가능
 *                         에러 종류에 따라 따로 잡는 경우도 존재
 *                         한개 통합(최상의 예외 클래스를 이용)
 *                         -------- Exception / throwable
 *                                  ---------   ---------
 *                                  예외만 가능   예외 + 에러
 *                         순서가 존재 => 작은 예외 클래스 ~ 큰 예외 클래스
 *                         --------- 계층도 (클래스의 크기가 정해짐)
 *                         Throwable
 *                             |
 *                  |--------------------|
 *                Error               Exception
 *                                       |
 *                            |-------------------------------|
 *                         IOException                   RuntimeException
 *                         SQLException                       |
 *                         ClassNotFoundException        NullPointerException
 *                                                       NumberFormatException
 *                                                       ...
 *               *** try 정상수행 => catch 수행 X
 *                   ----------- finally 문장이 있는 경우 finally 수행
 *               *** try 문장이 에러난 경우 => 에러 문장부터 try 끝문장까지 스킵 => catch 수행
 *                 
 *                 예)
 *                     문장 1
 *                     문장 2
 *                     ----- 예외처리와 관련 X(에러가 없는 소스만 처리)
 *                           변수선언 / 클래스 객체선언
 *                     try
 *                     {
 *                        문장 3
 *                        문장 4 --> 문장 4에서 에러 발생 시 문장 4, 5 스킵
 *                        문장 5
 *                     }catch()
 *                     {
 *                        문장 6 --> 에러 발생 시 수행
 *                     }
 *                     종료 문장 => 수행 => 정상 종료
 *                     
 *           2) 간접처리(예외 회피) - 컴파일 시 통과
 *               => 특별한 경우가 아니면 사용자 정의에서 많이 사용 X
 *                  --------- 소스가 많은 경우(try 위치 설정이 어려움)
 *                   | 유지보수 - 추가하는 기능에 예외처리가 필요
 *                     ------- 기능 추가 / 기능 수행
 *               => 시스템 자체에서 처리 - 복구 불가능 / 정상수행 불가능
 *                 
 *                 예) public void display() throws Exception
 *                    {
 *                         
 *                    }
 *                    public void main() throws Exception
 *                    {
 *                       문장 1
 *                       display(); => 에러발생 시 종료
 *                       문장 2
 *                       문장 종료
 *                    }
 *                    
 *               *** try ~ catch 권장 사용
 *               static => 변수, 메소드 => 컴파일 시 메모리 저장
 *               instance => 변수, 메소드 => 객체 생성 => 메모리 저장 
 *               
 *               => 메소드() throws 예외클래스, 예외클래스, 예외클래스...
 *                          --------------------------------------
 *                           => 순서 상관 X
 *                           컴파일러에 알려주는 과정(예외선언)
 *                           --------------------ㄴ
 *                            다음 호출 시 처리한 다음 사용
 *               => 예외처리가 많이 선언 => 한개로 통합
 *                                       ---------
 *                                        가장 큰 예외처리 클래스로 통합
 *                                            --------- Exception, Throwable
 *               => 라이브러리에서 주로 제공 -> 개발자에게 맡김
 *                                          예외처리 후 사용
 *                 형식)
 *                     [접근지정어][제어어] 리턴형 메소드명(매개변수...)
 *                     throws 예외 클래스 1, 예외 클래스 2...
 *                            ---------------------------
 *                             예상되는 예외 등록
 *                     => 처리 메소드() throw 예외 클래스 1, 예외 클래스 2
 *                     => 처리 메소드()
 *                        {
 *                           try
 *                           {
 *                           }catch()
 *                           {
 *                           }
 *                        }
 *               *** 자바의 예외처리는 전체 제공 X
 *               *** 필요에 따라 사용자 정의로 예외처리 제작
 *                             ------------------
 *                              자바 시스템에서 인식 X
 *                              예외처리 불러서 사용
 *                              throw - 임의 호출
 *               -------------- 자주 사용 X
 *                              ---------- if
 *               => 업체에서 라이브러리 제작 (사용자 예외처리가 존재할 가능성 O)
 *               => throws - 예상되는 에러를 선언
 *               => throw - 고의로 예외를 발생(테스트) => 견고성
 *                             
 */
public class 예외처리_예외복구 {
	public void display() throws Exception
	{
		System.out.println(10/0);
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// 인스턴스 사용 X => 사용 시에는 반드시 반드시 객체
		// static 바로 사용가능
		예외처리_예외복구 a=new 예외처리_예외복구();
		// a = 메모리 주소(객체)
		// a = display 저장
		a.display();
//		try
//		{
//		a.display(); // 메소드 호출 시 예외처리 후 사용
//		}catch(Exception ex) {
//			ex.printStackTrace();
//		}
		System.out.println("정상 수행");
	}
	/*
	 *   웹
	 *    메뉴 => 에러
	 *    메인 화면
	 *    푸터
	 */

}
