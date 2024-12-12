/*
 * 
 *  멤버변수의 초기화
 *    생성자 - 인스턴스 변수, static 변수의 초기화
 *           반드시 호출하여 사용
 *    인스턴스 블록 - 인스턴스 변수, static 변수의 초기화 / 호출 없이 자동으로 처리
 *    static 블록 - static 변수의 초기화 / 호출 없이 자동으로 처리
 *    ---------- 멤버의 초기화, 시작과 동시에 처리하는 기능
 *               구현 가능, 상속은 예외
 *               
 *    기본 초기화 > 명시적 초기화 > static 블록
 *     int a;     int a=10   | static 변수 초기화
 *    인스턴스 블록 > 생성자      
 *     a=100     a=200
 *    ---------------- > 200 출력 / 동시에 사용 X 
 *    우선 사항
 *     명시적 초기화
 *     불가능할 때 > 생성자, static 블록을 이용
 *      | 구현
 *        int[] arr=new int[5];
 *      > int[] arr={1,2,3,4,5};
 *  
 */

class Movie
{
	int movieNo=1;
	static int id=1;
	// 인스턴스 블록
	{
		System.out.println("인스턴스 블록 진입");
		movieNo=2;
		System.out.println("movieNo 변수 저장 완료");
	}
	
	Movie()
	{
		System.out.println("생성자 호출");
		movieNo=3;
		System.out.println("생성자에서 movieNo 저장 완료");
	}
	
	static
	{
		System.out.println("static 블록 진입");
		id=100;
		System.out.println("저장 완료");
	}
	
}
public class 클래스_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Movie m=new Movie();
		System.out.println(m.movieNo);
		System.out.println(Movie.id); 
		// static 메모리 할당 필요 X > 생성자 호출 필요 X
	}

}
