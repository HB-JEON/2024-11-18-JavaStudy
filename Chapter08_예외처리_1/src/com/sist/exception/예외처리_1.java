package com.sist.exception;

public class 예외처리_1 {
/*
 * 
 *  변수 => 데이터형
 *  연산자 / 제어문
 *  배열 => 1차원
 *  클래스 / 객체 생성 / 메소드
 *  상속 => 오버라이딩
 *  인터페이스
 *  라이브러리 => 조립
 *    => Collection / IO
 *  ------------------------- 웹
 *  => 12장 필수 *** 오라클 ***
 *  
 *  263 page 
 *   8장 예외처리
 *    목적 - 사전에 에러를 방지하는 목적
 *           if 우선 처리 후
 *            처리가 어려운 경우 예외처리 사용
 *           => 정상 종료를 방지하고 정상 상태를 유지
 *           => 예외처리 - 에러 발생 시 에러를 건너 뛴다
 *              ------- if
 *    에러 발생
 *     사용자 - 잘못된 입력 => 유효성 검사 => if (JavaScript)
 *     개발자 - 실수 => 배열인덱스, 정수 변환, 형변환
 *     ------------------------------------------
 *             컴파일          인터프리터
 *     A.java =======> A.class =======> 화면 출력
 *             javac             java
 *              | 에러            | 에러
 *           확인)                 ------ 에러처리
 *            컴파일 시 반드시      실시간 에러
 *            예외처리             RuntimeException
 *           => CheckException    => 경우에 따라 예외처리
 *              필수적으로 예외처리    
 *              => IO(파일 입출력)
 *                  IOException
 *              => 네트워크(서버 - URL/IP)
 *                  MalformedURLException
 *              => SQL(데이터베이스)
 *                  SQLException
 *              => 쓰레드
 *                  InterruptedException
 *                  
 *           => UnCheckException
 *              필요 시에만 예외처리      
 *               배열 범위 초과 / 정수 변환 / 0으로 나누는 경우            
 *               객체가 null / 클래스 형변환...
 *            
 *           1) 사전 차단을 목적
 *               if 우선 처리 후 예외처리
 *           2) 에러
 *               에러 - 소스 상에서 수정이 불가능한 에러
 *                      메모리 부족, 이클립스...
 *                      치명적 에러 => 처리 불가능
 *               예외처리 - 소스 상에서 수정이 가능한 에러
 *                         파일 읽기 => 경로명 / 파일명 다른 경우
 *                         데이터 베이스 => SQL 문장이 틀린 경우
 *                         크롤링 => URL 주소가 틀린 경우
 *                         배열 인덱스가 틀린경우
 *           3) 예외처리 방법
 *               예외복구 - try ~ catch
 *                         ----  ----- 예외 발생 시 처리 복구
 *                          | 정상 수행
 *                         직접처리 => 개발자가 직접처리
 *               예외회피(떠맡기기) - throws
 *                         간접처리 => 시스템에 맡기는 경우
 *                                    라이브러리에 많이 존재
 *                                    사용 시에 예외처리 후 사용
 *               임의발생 - 견고한 프로그램 여부 => throw
 *               지원하지 않는 예외 - 사용자 정의 예외처리         
 *               ----------------
 *                public class MyException extends Exception
 *                {
 *                }
 *                 예외처리를 하는 경우
 *                 ------------------ 예외가 많이 예상되는 경우
 *                 catch 여러개 사용 가능
 *                 -------------------- 순서가 존재
 *                 
 *               문자열 => 정수로 변경 후에 배열에 저장 나눈 값
 *                         -----------    ---------  ------
 *               =>  사전에 에러방지 => 에러 예상하면서 소스 코딩 
 *   
 *  266 page
 *                       Object
 *                         |
 *                     Throwable
 *                         |
 *         |--------------------------------|
 *       Error                           Exception
 *       -----                              |---------------------------------------|
 *        처리가 불가능                    Check                                    UnCheck
 *        메모리 부족                       => 반드시 예외처리                         => 필요 시에만 예외처리
 *        => ElasticSearch                    컴파일러가 감시                           컴파일러 제한 X
 *           루씬 => 구글(검색엔진)          IOExeption - 입출력                         예외처리가 없을 수도 있다
 *           데이터베이스(NoSQL)              => 파일                                   에러가 많이 발생하는 부분에서 예외 처리      
 *                                              메모리                                 웹 / 윈도우 => 정수 입력...          
 *                                              네트워크                               " 10" => 정수 변경 불가능 => trim()   
 *                                         SQLxeption - 오라클                         웹 => board_list.jsp?page = 10 => 공백 오류
 *                                          오라클(데이터베이스)                                                  ------
 *                                           => SQL 문장                           => RuntimeException
 *                                              INSERT/UPDATE/DELETE                     |
 *                                              SELECT                                ArrayIndexOutOfBoundsException - 배열범위 초과
 *                                              ------ JOIN / SUBQUERY                 int arr=new int[2]; //0,1 
 *                                                     FUNCTION                        int arr[2]=100; => 오류 발생
 *                                                     PROCEDURE                      NullPointerExcetion
 *                                                     TRIGGER                         A a;
 *                                              입고 => 재고                            a.display()
 *                                              출고 => 재고
 *                                           SQL                                   ArithmeticException / ClassCastException
 *                                            DQL - SELECT(검색)                       NumberFormatException - 문자열을 정수형으로 변경
 *                                            DML - INSERT / UPDATE / DELETE
 *                                            DCL - GRANT / REVOKE
 *                                            TCL - COMMIT / ROLLBACK                        => catch 여러개인 경우
 *                                            DDL - CREATE / ALTER / DROP                       계층 순서로 적용
 *                                         ClassNotFoundxeption
 *                                          Class.forName("패키지.클래스명")                      catch(NumberFormatException)
 *                                           => 리플렉션 => 클래스 정보                            catch(IOException e)
 *                                         InterrutedExeption - 충돌방지                         catch(Exception e) => 기타
 *                                           => 쓰레드                                         => 위로 올라갈수록 예외처리범위가 커진다
 *                                         MalformedURLxeption                                   -------------------------------
 *                                           => URL                                              catch 는 반드시 작은 순위 => 큰 순위로 설정
 *                                                                                            => 예외처리의 가장 큰 클래스는 Exception
 *                                        => java.io / java.sql / java.net
 *                                          CheckException => 반드시 예외처리를 하고 사용
 *                                          
 *                                      IllegalArgumentException - 매개변수에 잘못된 데이터를 전송
 *                                      ------------------------
 *                                       웹 => 400(Bad request)
 *                                             200 - 정상 수행
 *                                             403 - 접근 거부
 *                                             404 - 파일 Not Found
 *                                             *** 500 - 자바 소스 오류
 *                                             415 - 한글 변환 코드
 *                                            --------------------
 *   예외처리의 기본
 *     try ~ catch - 가장 많이 사용 되는 예외처리
 *      => 정상 수행 => 에러발생 시 => catch 처리 => 스킵
 *                                  ---------
 *                                   에러처리 후 복구                                       
 *                                   에러 위치 확인
 *                                   어떠한 에러인지 확인         
 *      try
 *      {
 *         정상 수행 문장
 *      }catch(예상되는 예외클래스)       
 *      {
 *         예외 발생 시 처리
 *      }
 *      
 *      예)
 *         ------
 *         문장 1
 *         문장 2 => 에러 발생 => 종료 (비정상 종료)
 *         문장 3
 *         ------
 *         
 *         문장 1
 *         문장 2 
 *         try
 *         {
 *            문장 3
 *            문장 4 
 *            문장 5
 *         }catch(예상되는 에러 클래스){
 *            문장 6 => 문장 5 이동 명령(복구)
 *         }
 *            문장 7
 *            문장 8
 *            
 *         => 문장 1~5,7,8
 *         => 문장 2 에러 발생 시 문장 1만 출력
 *         => 문장 4 에러 시 문장 1~3 수행 => catch 이동 => 6~8 수행 (문장 5는 스킵)
 *                                       
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=a/0;
		System.out.println(b);
	}

}
