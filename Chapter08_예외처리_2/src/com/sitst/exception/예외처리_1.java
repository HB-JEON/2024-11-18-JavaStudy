package com.sitst.exception;
/*
 * 
 *  263 page
 *   예외 - 수정이 가능한 에러 (가벼운 에러)
 *    사전적 의미 - 일반적이지 않은 상황
 *     => 프로그램에서 문제 발생
 *        사용자의 입력이나 제어 => 유효성 검사
 *                               --------
 *                               자바스크립트
 *                                => 자바 - if
 *                                => 스프링 - validation
 *     => 개발자의 실수
 *        -----------
 *         본인의 에러 => 찾기 어려움
 *         ----------------------
 *          => 소스 비교 (X)
 *             Output 창 => 디버깅
 *             실무에서 에러처리
 *        ------------------------ 비정상 종료 - 방지하는 프로그램
 *                                 -------------------------- 예외처리 => 정상 종료를 유도
 *                                 
 *   에러 - 수정이 불가능한 에러 (치명적인 에러)
 *   -------------------------------------
 *    자바
 *         java - 컴파일 / java - 인터프리터(런타임)
 *         컴파일에러 - 컴파일 시에 에러 => 문법 에러
 *         런타임에러 - 실행 시에 에러 => 사용자 입력 / 출력 => 배열범위 초과
 *         논리적에러 - 웹에서 발생
 *                    ---------
 *                    실행은 가능 => 프로그램과 다르게 동작
 *         프로그램에서 가장 중요
 *          => 다른 개발자가 분석 => 가독성 (개발/유지보수)
 *          => 속도 / 최적화
 *          => 견고성 - 에러 발생 시 종료하지 않고 정상 수행이 가능하게 생성
 *             -----
 *              1) 에러를 사전에 방지하는 방법
 *                 -----------------------
 *                  우선 시 => if 문 -> 처리가 어려운 문장
 *              2) 예외처리가 등장
 *                 *** 변수 초기값
 *                  명시적 초기화 우선
 *                   => 명시적 초기화가 안되는 경우 -> 외부에서 읽어서 데이터 대입
 *                   => 생성자 / 초기화 블록
 *               => 가벼운 에러(수정이 가능한 에러)
 *                   예)
 *                       FileReader fr=new FileReader("경로명/파일명")
 *                                                    ------------- 수정
 *                       Document doc=Jsoup.connect("URL주소").get();
 *                                                  -------- 수정
 *                       Socket socket=new Socket("서버주소",port)
 *                                                -------------- 수정
 *                       웹에서는 번호로 표시 (브라우저) 
 *                       -----------------
 *                         웹 => URL 주소 => 마지막 파일명을 지정
 *                                          ----------------
 *                                           없는 경우 => 명령어(MVC)
 *                       404 / 500 / 400 / 412 / 403
 *                       
 *                        404 - 요청한 파일이 없는 경우
 *                        500 - 자바 소스 오류
 *                        400 - Bad Request
 *                        415 - GET/POST/PUT/DELETE
 *                        403 - 스프링 보안
 *               => 0으로 나눈 경우 - NumberFormatException
 *                  정수변환 -ArrayIndexOutOfBoundsException
 *                  배열범위 초과
 *               => 메모리 할당 -> 주소가 없는 경우 - NullPonterException
 *               => 매개변수에 값 전송
 *               => 클래스 형변환 - ClassCastException
 *               
 *             예외처리의 종류
 *               예외복구 - try~catch~finally => 가급적이면 예외처리로 주로 사용
 *                         예외가 발생하면 복구해서 다시 수행 가능
 *                        *** 예외나 에러가 없게 프로그램을 제작
 *                         형식)
 *                              try
 *                              {
 *                                 정상 수행 문장
 *                                  => 예외가 발생 가능
 *                                  => main => 평상 시 코딩
 *                              }
 *                              catch(예외 클래스)
 *                              {
 *                                 예외 발생 시 복구 / 에러확인
 *                                  => 에러확인
 *                                     ------
 *                                     에러 메시지 출력 getMessage()
 *                                     에러 위치 확인 printStackTrace()
 *                                     ------------------------------
 *                              }
 *                              finally
 *                              {
 *                                 try / catch 상관 없이 무조건 수행하는 문장이 있는 경우
 *                                  => 서버 연결 해제
 *                                     오라클 닫기
 *                                     파일 닫기
 *                              }
 *                              
 *                              catch => 멀티(여러개 동시 사용)
 *                              
 *                              try
 *                              {
 *                              }catch(ArrayIndexOutOfBoundsException)
 *                              {
 *                              }catch(NumberFormatException)
 *                              {
 *                              }catch(NullPonterException)
 *                              
 *                              예외를 동시에 처리
 *                              try
 *                              {
 *                              }catch(ArrayIndexOutOfBoundsException e)
 *                              {
 *                              }
 *                              
 *                              일반적으로 사용
 *                              try
 *                              {
 *                              }catch(Exception e)
 *                              {        | 모든 예외를 처리
 *                              }
 *                              
 *                              서버 / 오라클 연동
 *                              try
 *                              {
 *                                 오라클 연결
 *                                 SQL 문장 전송 = SQL
 *                                 결과값 받기
 *                              }catch(Exception e)
 *                              {
 *                                 오류 발생 시 => 확인
 *                              }
 *                              finally
 *                              {
 *                                 오라클 닫기
 *                              }
 *  266 page
 *   자바에서 지원하는 클래스(라이브러리)
 *    CheckException - 컴파일 시 예외처리 여부 확인
 *                      => 반드시 예외처리를 해야 사용 가능
 *                         java.io / java.sql / java.net
 *                          - IOException
 *                            SQLException
 *                            MalformedURLException
 *                         java.lang => 리플렉션
 *                          - ClassNotFoundException
 *                            InterruptedException -> 쓰레드 -> 충돌방지
 *                         javax.http.* => JSP
 *                         jakarata.http
 *                         -------------
 *                          이클립스 => 톰캣 =>
 *                          ------    ----
 *                          이클립스 최신일 경우 톰캣 10 버전 이상 사용 => 스프링부트
 *                           => 스프링 편집기 => JDK / 톰캣 
 *    UnCheckException - 예외처리 여부 확인 X
 *                        => 필요 시에만 예외처리
 *                           NullPointerException - 클래스가 메모리 할당이 없는 경우(선언만 한 경우)
 *                           NumberFormatException - 문자열 -> 정수 변환
 *                           ArrayIndexOutOfBoundsException
 *                           ClassCastException
 *                           ArithmeticException
 *                        => RuntimeException - 한 번에 처리 가능
 *                           ------------------------------------ Exception 으로 처리 가능
 *   계층구조
 *         Object => 최상위 클래스 (모든 클래스는 Object 상속)        
 *           |
 *        Throwable           
 *          |---------------------|
 *       Error                 Exception
 *                      |-------------------|
 *                    Check              UnCheck
 *                      |                   |
 *                  IOException        RuntimeException
 *                  SQLException            |
 *                  ...                NullPointerException
 *                  ...                ...
 *                                     ...
 *                                                                      5~8장 사이 면접 문제
 *      => 267 page
 *         상위 클래스일 수록 예외처리 범위가 커진다
 *         
 *      정의 - 사전에 에러를 방지하는 프로그램
 *      목적 - 프로그램의 비정상 종료를 방지하고 정상 상태를 유지
 *      
 *      try~catch 동작
 *      
 *      try
 *      {
 *         문장 1
 *         문장 2
 *         문장 3
 *      }catch(예외처리클래스)
 *      {
 *         문장 4
 *      }
 *       오류 미발생 -> 문장 1~3 수행 -> 종료
 *        정상(오류가 없는)인 경우 try 문장만 수행
 *       문장 2 오류 발생 -> 문장 1, 4 수행 -> 종료
 *        오류 발생 지점부터 try 안에 가장 하위 문장까지 생략
 *        
 *      문장 1
 *      문장 2
 *      try
 *      {
 *         문장 3
 *         문장 4
 *         문장 5
 *      }catch(Exception e)
 *      {
 *         문장 6
 *      }
 *       오류 미발생 -> 문장 1~5 수행 -> 종료
 *       문장 2 오류 발생 -> 종료
 *       문장 4 오류 발생 -> 문장 1~3, 6 수행 -> 종료
 *       
 *      문장 1
 *      문장 2
 *      try
 *      {
 *         문장 3
 *         문장 4
 *         문장 5
 *      }catch(예외처리)
 *      {
 *         문장 6
 *      }
 *      finally
 *      {
 *         문장 7
 *      }
 *      문장 8
 *      문장 9
 *       오류 미발생 -> 문장 1~5, 7~9 수행 -> 종료
 *       문장 4 오류 발생 -> 문장 1~3, 6~9 수행 -> 종료
 *                  
 *               예외회피 - throws => 메소드 선언 뒤에 서술
 *                          => 예약, 떠맡기기 => 다음 시용 시 예외처리를 해서 사용
 *               임의로 발생 - 테스트, 배포 전 확인 => throw
 *                            정상 상태 유지
 *                            throw new Exception();
 *               사용자 정의 - 자바에서 지원하지 않는 예외처리가 있는 경우
 *                            class MyException extends Exception
 *                            {
 *                            }
 *                             => if 문으로 사용 가능
 *                                비밀번호 => 대소문자+특수문자+8자 이상
 *              예외처리 크기(계층) => catch => 순서지정
 * 
 */
public class 예외처리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
