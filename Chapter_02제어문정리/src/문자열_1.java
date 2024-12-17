/*
 * 
 *  문자열 > 기능(메소드) > 반드시 결과값(리턴형/반환형)
 *    | int scan.nextInt()
 *    
 *   String - 문자열을 저장하는 데이터형
 *               | 제한이 없음
 *            일반 데이터형으로도 사용 / 클래스형으로도 사용
 *    문자열 변수 선언
 *     String name="홍길동";   **주로 사용**
 *     String name=new String("홍길동") > 새로운 공간을 확보
 *    기능(메소드) - 문자열은 비교연산자 사용불가
 *     문자열 기능
 *      1) 비교 기능
 *         *** equals() > ==
 *           : 로그인 처리 > ID/PWD
 *         equalsIgnoreCase()
 *           : 대소문자 구분없이 처리
 *         *** contains() > 포함문제
 *           : 검색
 *         *** startsWith() |
 *         *** endsWith()   | > 자동완성기/서제스트
 *         						대소문자 구분
 *      2) 변경
 *      3) 문자열 분해
 *      4) 제어
 */
// 사용자의 입력밧을 받은 후 > ID/PWD > 로그인
import java.util.Scanner;
public class 문자열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final String ID="admin";
		final String PWD="1234"; // 고정 > 상수
		
		Scanner scan=new Scanner(System.in); // equals > 같으면 true / 틀리면 false
		while(true) // ID/PWD 무한루프
		{
			System.out.print("ID를 입력하세요:");
			String  id=scan.next();
			System.out.print("Passward를 입력하세요:");
			String pwd=scan.next();
			// Scanner 
			// 정수 : nextInt()
			// 문자열 : next()
			// 실수 : nextDouble()
			// 논리 : nextBoolean()
			// String - 변경, 확장 불가능 > 제공된 상태로만 사용(표준화)
			// 대소문자 구분
			/*
			 *  eqlse - 대소문자 구분 (ID/PWD)
			 *  equalsIgnoreCase - 대소문자 구분 X (검색어)
			 *   > 문자열 비교 (==)
			 *  부정효과 - ! 사용
			 */
			if(!ID.equalsIgnoreCase(id) && PWD.equals(pwd))
			{
				System.out.println("로그인 되었습니다.");
				System.out.println("메인 페이지로 이동합니다.");
				break; // while 종료
			}
			else
			{
				System.out.println("ID 혹은 Passward를 확인해주세요.");
				System.out.println("다시 입력하세요.");
			}
		}
		
	}

}
