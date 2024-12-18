package com.sist.exception;
/*
 * 
 *   예외처리가 필요한 클래스
 *   --------------------
 *    => 라이브러리에서 제공
 *       -------- 입출력 / 네트워크 / 오라클 / URL
 *                ----------------------------
 *                 CheckException
 *                  => 컴파일 시 확인(예외처리 설정)
 *    => 예외처리 방법
 *        1. 직접처리(예외복구)
 *              try ~ catch ~ finally
 *                try
 *                {
 *                   정상 수행 문장 -> 일부러 에러가 있는 문장을 사용 X
 *                    => 에러발생(개발자 실수, 사용자 입력의 문제)  
 *                                          ---------------
 *                                        개발자 실수가 거의 없는 이유
 *                                         => 자동 완성기의 발전
 *                                            이클립스 -> 에러 바로 출력
 *                }catch(예외클래스)
 *                {
 *                   1. 에러 내용 출력 (어디서 어떤 에러가 발생하였는지 확인)
 *                       getMessage() - 에러 내용만 출력
 *                       printStackTrace() - 에러 내용과 위치 확인
 *                   2. 예외 복구 => 다시 입력을 유호
 *                                  웹 / 윈도우에서만 가능
 *                                  데이터 수집(JSoup(정적)/셀레니움(동적))
 *                   3. 에러 확인 => ***소스 코딩 수정***
 *                }
 *                *** catch 절은 필요 시 여러개 사용 가능
 *                finally
 *                {
 *                   생략 가능
 *                    => 닫기(파일/서버/오라클)
 *                       try / catch 상관 없이 무조건 수행
 *                }
 *                *** catch => 통합해서 한 번에 처리
 *                     Exception / Throwable
 *                    => try -> finally 수행
 *                        에러가 없는 경우
 *                    => try -> catch -> finally 수행
 *                        try 수행 중 에러가 발생 -> catch 수행 -> finally 수행
 *                    => 사전에 에러 처리
 *                    => 에러 발생 시 문제점
 *                       ----------------
 *                        에러 위치부터 try 마지막까지 수행하지 않고 정상 종료 처리
 *                    => try ~ catch 사용
 *                        => 메소드 전체 연결
 *                        => 예외 발생 예상 위치만 사용(부분적 사용)
 *                            -> for
 *                                try  
 *                                {
 *                                   for(int i=1;i<=10;i++)
 *                                   {
 *                                      int a=(int)(Math.random()*3);
 *                                          - 0~2 발생
 *                                      i=1 a=1
 *                                      i=2 a=0
 *                                      System.out.println(i/a); => for 종료
 *                                                -> catch 이동
 *                                   }            
 *                                }catch(Exception e) {}
 *                                
 *                                
 *                                for(int i=1;i<=10;i++)  
 *                                {
 *                                   try
 *                                   {
 *                                      int a=(int)(Math.random()*3);
 *                                          - 0~2 발생
 *                                      i=1 a=1
 *                                      i=2 a=0
 *                                      System.out.println(i/a); => for 종료
 *                                                -> catch 이동
 *                                   }catch(Exception e) {}       
 *                                }
 *                                크롤링 
 *                                HTML - 모든 HTML 형식이 동일하지 않을 경우
 *                                
 *                              *** 중요 ***
 *                               오라클은 Commit 시에만 저장
 *                               트랜젝션 프로그램 -> ***일괄처리***
 *                                try
 *                                {
 *                                   1. 오라클 연결
 *                                   2. AutoCommit - 해제
 *                                   ...
 *                                   ...
 *                                   7. Commit;
 *                                }catch(Exception e)
 *                                {
 *                                   try
 *                                   {
 *                                      rollback()
 *                                   }catch(Exception) {}
 *                                }
 *                                finally
 *                                {
 *                                   try
 *                                   {
 *                                      close()
 *                                   }catch(Exception) {}
 *                                }
 *                                => 공통 모듈
 *                        
 *        2. 간접처리(예외회피) - 선언만한 상태
 *            메소드 뒤에 throws
 *             => 직접 처리하는 부분 X -> 에러를 예상하여 컴파일러에게 전송
 *                 -> 컴파일러가 예외처리 가부 확인 X
 *             => 복구 X / 정상 수행 후 종료 불가능 / 시스템 자체 처리
 *             => 라이브러리 메소드 => 반드시 예외처리 후 사용
 *                ------------------------------ try ~ catch
 *             => 선언방식
 *                 method() throws 예외클래스, 예외클래스, 예외클래스...
 *                                 -------------------------------
 *                                  구분, 순서 상관 X
 *                 처리 시 통합
 *                        ---- Exception / Throwable
 *                             catch, throw => 통합
 *             => 임의로 발생 - throw => 사용자 정의 예외처리
 *             => class, method, 예외처리, 데이터형
 *               -------------------------------
 *                완벽하게 지원 불가능
 *                ----------------- 사용자 정의
 * 
 */
public class 예외처리_1차정리 {
	public void display() throws Exception
	{
		System.out.println(10/0);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		예외처리_1차정리 a=new 예외처리_1차정리();
		try {
			a.display();
		} catch (Exception e) {}
		System.out.println("종료");
	}

}
