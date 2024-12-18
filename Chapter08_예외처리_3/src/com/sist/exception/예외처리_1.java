package com.sist.exception;
/*
 * 
 *  예외처리 방법
 *  -----------
 *   1. 직접처리(예외복구)
 *       try
 *       {
 *          정상적으로 수행하는 문장
 *           => 오류 발생 가능성
 *       }catch(예상되는 예외 클래스)
 *       {
 *          오류발생 => 처리복구
 *          오류 내용만 확인
 *       }
 *       finally
 *       {
 *          닫기(서버, 오라클, 파일) => 자원(resource) 반환
 *           => 무조건 수행
 *       }
 *   2. 간접처리 - throws
 *       => 예외 회피
 *       => 예상되는 예외를 선언 => 예상 예외
 *                               -------
 *                                컴파일러
 *       => 메소드를 사용 시 반드시 예외 처리 후 사용 가능
 *           -> throws / try~catch 이용가능
 *       => 사용자 정의는 사용 빈도 낮음 / 라이브러리 사용 빈도 높음
 *          ------------------------
 *           코딩 소스가 많은 경우 중간에 예외 처리할 문장이 있는 경우
 *           
 *          형식)
 *               public void display() throws 예외처리 클래스...
 *                 => 여러개일 경우 , 사용
 *                    순서 X
 *                    예상되는 예외를 지정
 *                    
 *               CheckException                
 *               -------------- 반드시 예외처리                                 
 *                Throwable
 *                Exception
 *                IOExeption
 *                InterruptedExcetion
 *                SQLException
 *                ClassNotFoundException
 *                ...
 *                ...
 *                
 *                UnCheckException
 *                ---------------- 필요시에 예외처리
 *                RuntimeException
 *                ArithmeticException
 *                ArrayIndexOutOfBoundsException
 *                NumberformatException
 *                NullPonterException
 *                ClassCastException
 *                ...
 *                ...
 *                => throws 뒤에 사용 X
 *                   특별한 경우 throws -> 예외를 회피한 상태 / 시스템에 의해 처리
 *                   그 외의 경우 try~catch  -> 예외를 직접 처리 -> 복구하여 사용
 * 
 */
public class 예외처리_1 {
//	public int div(int a,int b) throws ArithmeticException
//	{
//		return a/b;
//	}
//	public void print()
//	{
//		int c=div(10,0);
//	}
	public void display() throws Exception, ClassNotFoundException
	{
		System.out.println("dislpay call...");
	}
	// Check => 호출 시에 반드시 예외 처리 후 사용
	// UnCheck => throws 문장 사용 X
	// 1. try ~ catch
	public void print()
	{
		try
		{
			display();
		}
		catch(ClassNotFoundException e) {}
		catch(Exception e) {}
	}
	// 2. try ~ catch
	public void print2() // 사용 권장
	{
		try
		{
		display();
		}
		catch(Exception e) {}
		catch(Throwable e) {} // Exception 보다 큰 예외처리
	}
	// 3. throws
	public void print3() throws Exception, ClassNotFoundException
	{
		display();
	}
	// 4. throws
	public void print4() throws Exception
	{
		display();
	}
	
	/*
	 *   소스가 없는 경우 => 새로운 메소드를 만드는 경우
	 *    try ~ catch => 개발 용이
	 *   이미 소스 코딩이 있는 경우 => 새로운 기능 추가
	 *    throws => 유지보수 용이
	 *    ------
	 *     1. 예상되는 예외를 메소드 뒤에 선언
	 *     2. 메소드 호출 시 반드시 예외 처리 후 호출
	 *        ---------------------------------
	 *         => *** 직접 처리 ***
	 *            선언 후 사용
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
