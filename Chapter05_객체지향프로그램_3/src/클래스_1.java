/*
 * 
 *  구성요소
 *    멤버변수
 *     | 공통으로 사용하는 변수 여부(static)
 *       정보 전체 / 데이터 관리 > 오라클(static)
 *                            | 공유된 데이터
 *    생성자 / 초기화 블록
 *    ---- 생략 가능 / 오라클 연동(드라이버 등록)
 *         윈도우의 레이아웃
 *         웹 > 자동 로그인
 *    static 블록 - MyBatis 연동
 *    활용 > *** 메소드
 *           | 다른 클래스 연동(메세지)
 *             기능 처리 > 재사용
 *    웹(JSP/Spring)
 *      1. 변수 2. 메소드 3. 생성자 4. 인터페이스 5. 라이브러리
 *      > 인스턴스
 *        공통으로 사용되는 부분 - static
 *        Header / Footer
 *   1. 메소드 형식
 *     [접근지정어][제어어] 리턴형 메소드명(매개변수...) > 선언부
 *     
 *      [접근지정어]       
 *        다른 클래스와 연결 > 공개(public)
 *        public       /       protected       /       private       /       default
 *                           같은 폴더(패키지)         자신의 클래스 영역에서만      같은 폴더안에서만 접근 가능
 *                            상속받은 클래스           사용 가능(은닉화)
 *      [제어어]                       
 *        static - 공통으로 적용되는 메소드
 *        final - 종단 메소드 > 확정/변경 불가능
 *        abstract - 선언만 할 때 사용
 *         | 프로그램에 맞게 구현하여 사용
 *           버튼 - click();
 *           추상클래스 / 인터페이스   
 *      리턴형
 *        사용자 요청한 결과값
 *        반드시 한개값만 설정
 *        없는 경우 void
 *        기본형 / 배열 / 클래스
 *      메소드명
 *        변수 > 식별자
 *        소문자로 시작
 *        약간의 의미만 부여
 *        두개의 단어를 이용
 *        파일 이름 가져오기
 *         getFileName() (헝거리식 표기법)
 *         get_file_name()
 *         _temp() > 임시 메소드(테스트용)
 *      매개변수
 *        0이상 여러개 사용 가능
 *        사용자로부터 요청 값을 받아오기
 *        예) 영화검색
 *           String[] find(String findData)
 *           boolean isLogin(String id,String pwd)
 *        *** 매개변수는 3개 이상이면 클래스, 배열로 전송
 *        예)
 *           정수 30개 전송 > 정렬한 결과
 *           int[] sort(int a1,,,int a30)
 *                      int[] arr 
 *       
 *       리턴형 메소드명(매개변수) > 선언부
 *        {
 *            구현부
 *            return 값; > void 일 때 생략 가능
 *                          | 컴파일러가 자동으로 추가
 *                            return 은 반드시 필요
 *                            return 메소드 종료점
 *                            중간에서 return 사용 가능
 *        }
 *       리턴형
 *        return 값 > 데이터형 동일(권장)
 *                    리턴형이 큰 데이터형을 사용
 *        
 *        int
 *        return 10
 *        double
 *        return 10.5
 *        String
 *        retrun "";
 *        
 *        double
 *        return 10 // 권장하지 않으나 가능
 *                    
 *   2. 메소드 호출
 *     인스턴스 메소드 > 객체명.메소드명(값...)
 *     static > 클래스명.메소드명(값...)
 *      예)
 *         class A
 *         {
 *             void display(){}
 *             static void print(){}
 *         }
 *         > print() > 저장 완료
 *           A.print()
 *         > A a=new A();
 *           a.display()
 *           > 약식
 *           new A().display()
 *      ----------------------------
 *      Date date=new Date();
 *      SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd")
 *      String today=sdf.format(date)
 *      
 *      Stirng today=new SimpleDateFormat("yyyy-MM-dd").format(new Date());
 *             
 *   3. 메소드 종류
 * 
 */
import java.util.Date;
public class 클래스_1 {
	int a=10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		클래스_1 aa=new 클래스_1();
		System.out.println(new 클래스_1().a);
		
	}

}
