// 6개의 난수 발생 후 (1~45) 중복이 없는 데이터를 출력 
// 피망 > 로직
/*
 *  클래스의 구성요소
 *  class ClassName
 *  {
 *    --------------
 *     변수 > 멤버변수
 *           공유변수
 *           > 일반 변수 / 배열 / 클래스(변수)
 *             변수를 보호(데이터 보호)
 *             -------- 캡슐화 / 은닉화
 *    --------------
 *     메소드 > 기능 / 재사용
 *            유지보수 관련(수정, 추가) > 오버라이딩 / 오버로딩
 *    --------------
 *     생성자 > 메모리에 클래스 저장 > 생략이 가능
 *    --------------
 *  }
 *  
 *  9장 > 조립(사용자 클래스 + 라이브러리)
 *  10~11장
 *   > 데이터 영구적으로 저장 불가 > 오라클
 *    HTML/CSS/JavaScript
 *    조립 > JSP < MVC > 1차 프로젝트 (2월~3월초)
 *                Jquery/Ajax
 *   > 통합
 *    Spring > 2차 프로젝트 (5월~5월 중순)
 *   > Spring-Boot/Django/Python
 *    React-Query/Redux/NextJS > MSA(옵션) TypeScript
 *   > AWS
 *   > 데이터베이스 연결
 *    JDBC/Mybatis/JPA
 * 
 */
import java.util.Arrays;
// 재사용이 가능한 프로그램 > 메소드화
public class 배열_4 {
	// for > 반복 횟수 지정
	//  while 반복 횟수 미정
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 6개의 저장 메모리 공간 > 배열
		int[] lotto=new int[6];
		int su=0; // 난수 발생 시 저장하는 변수
		boolean bCheck=false; // 중복 여부 확인
		
		for(int i=0;i<lotto.length;i++)
		{
			bCheck=true;
			while(bCheck) // 중복 여부 확인 = 횟수가 지정이 안됨
			{
				// 난수 발생
				su=(int)(Math.random()*45)+1;
				bCheck=false;
				// 중복된 숫자 확인
				for(int j=0;j<i;j++)
				{
					if(lotto[j]==su) // 저장된 데이터 중에 난수와 같은 값이 있는지
					{
						bCheck=true; // while 문을 다시 수행
						break;
					}
				}
			}
			lotto[i]=su;
		}
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));
	}

}
