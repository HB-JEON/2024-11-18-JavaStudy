/*
 * 
 *  프로그램
 *    요구사항분석(벤치마킹)   저장           화면 UI      구현    테스트               배포
 *        | 기능 설정      | 데이터 베이스                      | 단위 테스트(JUnit)  | 발표(더블클릭)                                             디버깅
 *    필요한 데이터 추출
 *        |
 *     클래스 설계         메모리 할당         출력     클래스와 연관
 *        | 메모리         | new                    | 클래스 다이어그램
 *       변수
 *        |
 *       유스케이스 다이어그램  정규화(1~3)
 *  객체 - 현실 세계에 있는 모든 사물(Object) > OOP
 *        ------------------
 *          | 단순화(시뮬레이션) > 가정 
 *            ---- 추상화 - 누구나 생각하는 공통된 데이터를 추출
 *             | 개발자만 알아볼 수 있도록
 *             
 *     예)
 *        사원관리
 *          사번 / 이름 / 부서명 / 직위 / 입사일 /근무지 / 연봉.. > 스태틱
 *          출근 / 영업 / 점심 > 메소드
 *          
 *        변수추출 > 기능 추출 > 구현 > 사용
 *                 | 추가, 수정
 *         > 클래스는 사원 > 1명에 대한 정보를 가지고 있다.
 *           컴퓨터 > 1개만 설계
 *           영화 > 1개
 *           레시피 > 1개
 */
// 변수 > 1. 기본형 2. 배열 3. 클래스
// 평점, 구분 번호, String, Actor
/*
 * 
 *  1. 클래스 구성요소
 *    class ClassName
 *    {
 *        변수
 *         1. 변수의 종류
 *           인스턴스 변수(객체변수)
 *            new 이용하여 메모리에 따라 저장이 가능하게 만든다.
 *            인스턴스 - 메모리에 데이터가 저장된 상태
 *            객체 = 인스턴스
 *           공통변수(정적변수)
 *            모든 객체가 공통으로 사용하는 변수
 *            > 메모리 공간이 한개
 *        생성자
 *        메소드
 *    }
 *    > new - 클래스의 메모리 크기를 확인 후 메모리 할당
 *                                  --------
 *                                  메모리 공간 생성
 *                                  사용된 주소 값을 객체로 생성
 *      생성자 - 변수의 초기값을 대입 > 메모리에 초기값을 생성
 *             new 생성자()       
 *    class A
 *    {
 *        int aa; > 0
 *        double dd; > 0.0
 *        static char cc; > '\0'
 *    }                   
 *    -----cc-----
 *        '\0'   >    a, b 사용 가능 > 로고, 학교명, 학원명...
 *    ------------         ---
 *                          읽기, 쓰기, 변경 가능 > 공통 메모리/공유 메모리
 *    A a=new A(); > 메모리 생성
 *    
 *    ------a------
 *         100   >    해당 주소에 있는 데이터만 접근 가능
 *    -------------     100-------------    > a.aa, a.dd
 *                            --aa--
 *                              0
 *                            ------
 *                         -------------
 *                            --dd--
 *                              0.0
 *                            ------
 *                         -------------
 *   A b=new A(); > 메모리 생성
 *    
 *    ------b------
 *         100   >    해당 주소에 있는 데이터만 접근 가능
 *    -------------     100-------------    > b.aa, b.dd
 *                            --aa--
 *                              0
 *                            ------
 *                         -------------
 *                            --dd--
 *                              0.0
 *                            ------
 *                         -------------
 *                         
 *    new - 사용시마다 클래스 크기만큼 메모리를 생성
 *     1. 클래스는 한개만 설계
 *     2. new 여러개를 저장해서 사용
 *     3. 사용자 정의 클래스 > 일반 변수와 동일
 *        ------------- 사용자 정의 데이터형 - 배열, 읽기, 쓰기
 *        ** 자바에서 지원
 *        
 *  종류                   메모리 저장          메모리 해제          저장위치          사용범위          사용방식
 *                          시점               시점
 * -----------------------------------------------------------------------------------------------------
 *  인스턴스 변수             new 사용 시        프로그램 종료         Heap           클래스 전체        객체명.변수명
 *                          저장                                              다른 클래스
 * -----------------------------------------------------------------------------------------------------
 *  정적변수(공유변수)         컴파일시 자동        프로그램 종료         MethodArea      클래스 전체       클래스명.변수명
 *                        메모리 할당                                            다른 클래스
 *                        한개만 생성
 * -----------------------------------------------------------------------------------------------------
 *  지역변수                 메소드 호출         메소드 종료          stack           {}             변수명
 *                        매개변수 포함
 * -----------------------------------------------------------------------------------------------------
 * 
 */


import java.text.DecimalFormat;
class Recipe2
{
	String poster; // null
	String title; // null
	String chef; // null
	String chef_poster; //
	int star; // 0
	int hit; // 0
}
public class 클래스_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. Recipe 저장
		//  1) 데이터를 저장 할 메모리 공간(메모리 할당)
		Recipe2 recipe1=new Recipe2(); // 24byte 메모리 생성
		// 기본형, 클래스형 > 4byte
		// > 데이터 초기화
		recipe1.poster="https://recipe1.ezmember.co.kr/cache/recipe/2024/11/24/565de119b099835a80ffdfc4006583621_m.jpg";
		recipe1.title="치킨너겟 교촌 허니콤보 만들기";
		recipe1.chef="태형제맘";
		recipe1.chef_poster="https://recipe1.ezmember.co.kr/cache/rpf/2024/10/24/1455cb2a66c286ac31d1c570f1276de11.jpg";
		recipe1.hit=1853;
		recipe1.star=5;
		// 변수값 지정
		// 저장된 데이터 출력 > 메모리 구조가 2중
		System.out.println("레시피 포스터:"+recipe1.poster);
		System.out.println("레시피 제목:"+recipe1.title);
		System.out.println("쉐프명:"+recipe1.chef);
		System.out.println("쉐프 포스터:"+recipe1.chef_poster);
		DecimalFormat df=new DecimalFormat("###,###");
		System.out.println(df.format(recipe1.hit));
		for(int i=1;i<=recipe1.star;i++)
		{
			System.out.print("★");
		}
		
//		// > recipe2에 데이터를 저장 > 출력
//		Recipe recipe2=new Recipe();
//		recipe2.poster="https://recipe1.ezmember.co.kr/cache/recipe/2024/11/30/b1418d5b7433ee7a2d1d45b1908ca2981_m.jpg";
//		recipe2.title="일본오뎅 만들기 일본 겨울 가정식요리 おでん";
//		recipe2.chef="일본사는수아";
//		recipe2.chef_poster="https://recipe1.ezmember.co.kr/cache/rpf/2024/11/23/ffbcbe17454570332649d59626a175771.jpg";
//		recipe2.hit=228;
//		recipe2.star=5;
//		
//		System.out.println("레시피 포스터:"+recipe2.poster);
//		System.out.println("레시피 제목:"+recipe2.title);
//		System.out.println("쉐프명:"+recipe2.chef);
//		System.out.println("쉐프 포스터:"+recipe2.chef_poster);
//		DecimalFormat df=new DecimalFormat("###,###");
//		System.out.println(df.format(recipe2.hit));
//		for(int i=1;i<=recipe2.star;i++)
//		{
//			System.out.print("★");
//		}
	}

}
