/*
 *  자바에서 지원하는 제어문
 *  *** 조건문 - 요청에 맞는 문장만 실행 > 건너뛰는 경우
 *             > 오류 방지
 *                if - 사전에 방지 (~이런 경우에)
 *                예외처리(8장) - if문으로 처리가 어려운 과정 
 *                
 *       단일 조건문
 *             |연산자 > 부정연산자, 비교연산자, 논리연산자만 사용 가능
 *          if(조건문) > (trule/false)
 *      {
 *        수행문장 > 조건문이 true일 경우에만 수행
 *                  false는 건너 뛴다.
 *       }
 *       독립적으로 수행 가능 > if문을 여러개 사용하면 속도 저하
 *       if 문장마다 다른 문장으로 되어있다. 모든 if의 조건을 검색
 *       주의점
 *      > 사용처 - 아이디 중복체크, 검색, 상세보기
 *      
 *      중첩 if문
 *      if() > 아이디가 같고
 *      {  
 *         if() > 비밀번호가 같다면
          }
          {
        }  =====> if(아이디가 맞고 && 비밀번호가 맞다면)
 *         
 *       선택 조건문 - 나눠서 처리
 *                  true일 때 처리
 *                falsed일 때 처리
 *      if(조건문)
 *      {
 *        조건이 true일 때
 *      }
 *      else
 *      {
 *        조건이 false일 때
 *      }
 *       > 두개가 나눠지는 경우
 *         로그인 - 로그인(메인) > if
 *                로그인이 안된 경우(back,회원가입) > else
 *         찜하기 / 좋아요 - if~else
 *         대문자 / 소문자, 3의 배수
 *       다중 조건문
 *  *** 반복문
 *       do~while - 무조건 1번 이상을 수행
 *       while - 반복 횟수가 없는 경우 > 데이터베이스 / 파일
 *       *** for - 횟수 지정 > 코딩 테스트 / 정보처리 실기
 *       
 *  선택문 - 게임, 네트워크
 *  반복제어문
 *   ** break - 반복을 종료
 *   continue - 특정부분을 제외하고 다시 반복 시작
 *   
 *   1. 중첩 조건문
 *       컴퓨터와 사용자의 가위(0) 바위(1) 보(2) 게임
 *       
 *       경우의 수 > if
 *       컴퓨터 가위 - 사용자의 가위
 *                  사용자의 바위
 *                  사용자의 보
 *       컴퓨터 바위 - 사용자의 가위
 *                  사용자의 바위
 *                  사용자의 보
 *       컴퓨터 보 - 사용자의 가위
 *                 사용자의 바위
 *                 사용자의 보
 *         
 * 
 */
import java.util.Scanner; // 이미 만들어져 있는 클래스를 읽어오는 과정
// > 이미 만들어진 클래스 - 라이브러리
// 클래스를 가지고 올 때 import
public class 제어문_조건문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		// System.in - 키보드 입력값
		System.out.println("가위(0),바위(1),보(2):");
		int player=scan.nextInt();
		
		int com=(int)(Math.random()*3);
		System.out.print("Computer:");
		if(com==0)
			 System.out.println("가위");
		if(com==1)
			 System.out.println("바위");
		if(com==2)
			 System.out.println("보");
		
		System.out.print("Player:");
		if(player==0)
			 System.out.println("가위");
		if(player==1)
			 System.out.println("바위");
		if(player==2)
			 System.out.println("보");
		
		System.out.println("====== 결과 ======");
		//if(com==0) // 컴퓨터가 가위를 낸 경우
		//{
			if(player==0 && com==0)
				System.out.println("비겼다");
			if(player==1 && com==0)
				System.out.println("Player Win");
			if(player==2 && com==0)
				System.out.println("Computer Win");
		//}
		if(com==1) 
		{
			if(player==0)
				System.out.println("Computer Win");
			if(player==1)
				System.out.println("비겼다");
			if(player==2) 
				System.out.println("Player Win");
		}
		if(com==2) 
		{
			if(player==0)
				System.out.println("Player Win");
			if(player==1)
				System.out.println("Computer Win");
			if(player==2) 
				System.out.println("비겼다");
		}

	}

}
