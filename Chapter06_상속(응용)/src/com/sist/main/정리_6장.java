package com.sist.main;
/*
 * 
 *  객체지향 프로그램 - 하드웨어(직접회로 => 모방)
 *  ------------ 조립식(한개 클래스 => 부품) => CBD
 *   => 이미 만들어진 클래스 - 변경(요구사항) => 오버라이딩
 *    1차 => 2차 오버라이딩
 *    ---------------- 재사용
 *         
 *  1. 목적 => 재사용
 *            ---- 변경이 가능, 추가가 가능
 *                 --        --
 *                 오버라이딩   오버로딩
 *                면접 - 정의 => 부연(프로젝트)
 *  2. 신뢰성 - 검증을 거친 프로그램으로 신뢰성이 높음
 *  3. 대규모 프로젝트 => 재사용
 *     안산시청 => 서울시청
 *               ----- C# / 국민연금 - Pro-C
 *  4. 클래스 => 추상화 => 구체화
 *             --- 설계 ---- 구현
 *              | 공통적인 데이터나 기능을 모아서 설계
 *                ---------------
 *                 벤치마킹 (CGV, 메가박스, 롯데시네마)
 *                   | 불편한 점 => 사용자 편의성
 *              | 단순화 - 시뮬레이션
 *                공통적인 데이터 / 기능
 *                ----------    --
 *                 | 변수         | 메소드
 *                    명사형          동작 - 메뉴 / 버튼 /마우스
 *                   눈에 보이는 데이터
 *   변수 설정
 *    기능(메소드에서 공통으로 사용되는 변수)
 *     예)
 *        달력
 *        사용자로부터의 입력 값 - year/month
 *        요일 - week
 *        달력 출력 - week => 1.... month/year
 *         => 전역변수 / 멤버변수 (W/M/Y)
 *        어떤 기능 => 사용되는 변수 => 중복
 *        요구사항 => 기능(메소드) => 사용되는 데이터 찾기
 *                                | 관련된 데이터 여러개
 *                                  클래스로 사용자 정의 데이터
 *                                  ~VO
 *   클래스 설계
 *   class ClassName
 *   {
 *      -------------
 *       변수 설정
 *       *** 저장 데이터가 다른 경우 => 따로 저장(인스턴스)
 *       저장 데이터 1개 사용 => 정적(static)
 *       => 변수 초기화 여부 - 생성자 => 생략
 *       => 보안 => 데이터 손실 X
 *       => private
 *       -------------
 *       생성자 - 윈도우, 데이터베이스, 서버 연결
 *       * 없는 경우 => 자동 생성(디폴트 생성)
 *       생성자 - 여러개 사용 가능
 *              ----------- 오버로딩
 *       => 클래스명 동일(리턴형 X)
 *        ** void = 리턴형
 *       => 다른 클래스에서 사용이 가능하게 생성
 *           => public
 *       기능처리
 *        => 메소드
 *        => 다른 클래스와 통신을 담당 => public
 *        => 형식)
 *                [접근지정어][제어어] 리턴형 메소드명(매개변수...)
 *                {
 *                   return 값;
 *                }
 *                
 *                리턴형 => 처리한 결과값(한개만 설정)
 *                         기본형 / 배열 / 클래스
 *                매개변수 => 사용자가 보내준 값
 *                          여러개 사용 가능
 *                           | 가급적 3개 이상이라면 배열/클래스 이용
 *                
 *                => 호출
 *                   인스턴스
 *                    객체 생성 후 처리
 *                     객체.메소드(값...)
 *                   static
 *                    클래스명.메소드()           
 *   *** 인스턴스 메소드, 생성자
 *         => 인스턴스 변수, 메소드, static 변수, static 메소드
 *            사용 가능
 *   *** static 메소드, static 블록
 *         => static 변수, static 메소드만 사용이 가능
 *            인스턴스 사용 시에는 반드시 객체 생성 후 사용                          
 *         => 제약이 많다 : 공통사용 : 한글변환, 
 *   }
 *  
 *   접근지정어
 *   public - 모든 클래스에서 사용 가능
 *   protected(X) - 같은 패키지 안에서 사용 가능
 *                  다른 패키지 안에 상속을 받은 클래스
 *   default - 같은 패키지 안에서 사용이 가능
 *             Component 사용 시에 주로 사용
 *             
 *             윈도우
 *               Container - JFrame, JPanel...
 *               Component - Button, TextField...
 *   private - 개인정보 보호
 *             일반 멤버변수 - private
 *              => setter/getter => 캡슐화
 *      public / private
 *   제어어
 *      static - 공통으로 사용하는
 *      abstract - 추상적인 => 구현 X
 *                 버튼 / 마우스 / 키보드
 *                 프로그램에 맞게 구현하여 사용
 *                 인터페이스
 *      final - 마지막
 *              변수 => 상수
 *              메소드 => 종단 메소드
 *              클래스 => 종단 클래스
 *              ---------------- 확장 및 상속 불가능
 *  ************ 5장 ************ 
 *  객체 지향의 3대 특성 => 권장(문법 사항 X)
 *    1. 캡슐화 - 데이터 보호 목적
 *    2. 상속 - 재사용
 *    3. 다형성 - 변경 / 추가
 * 
 */
public class 정리_6장 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
