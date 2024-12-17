/*
 * 
 *  반복문 > for 
 *   1. 형식
 *   	 for(초기식;조건식;증감식)
 *   	 {
 *   	 	반복수행 문장
 *   		여러개가 올 수 있다
 *   	 }
 *      > 향상된 for > for-each
 *      				| 배열 / Collection
 *      				| 웹에서 주로 사용
 *      				  VueJS / ReactJS
 *      				   | Vuex   | Redux > React-Query(개인프로젝트 진행)
 *      						 	 	 	 	 | nextjs 
 *      											 | MSA
 *      프로젝트
 *       1) 자바 > 자바 정리 (네트워크, 데이터베이스)
 *       2) 웹  데이터베이스 활용 / JSP 사용 / MVC 구조
 *       3) 웹 Spring 관련 내용 습득, 데이터베이스 고급
 *       4) 웹(개인프로젝트) > 신기술
 *       
 *   2. 동작 순서(66 page)
 *            1 >  2  < 4
 *   	for(초기식;조건식;증가식)
 *   			  | false면 종료
 * 		 		  | true 
 *             3 반복 수행 문장  > 4 이동
 *       1 초기식은 한번만 수행
 *       2 > 3 > 4
 *       2 > 3 > 4
 *       ...
 *       ...
 *       4번에 증가/감소 > 2 조건식에 대입 > false 도출까지
 *       
 *   3. 프로그램 구현 방법
 *    순서
 *     1) 변수 설정
 *     2) 변수 초기화(난수, 명시적, 입력값)
 *     3) 제어문을 이용하여 사용자 요청 값을 추출        2), 3) 데이터 처리
 *         > 데이터 베이스안에 있는 데이터 추출
 *     4) 결과값 출력
 *     
 *   for
 *    무한루프(종료가 없는 상태)
 *     | for(;;) > while(true)
 *       ** 1~10까지 출력 for/ while / do~while **
 *      ** 프로그램의 단점 > 정답이 없다. / 오라클 > SQL 문장이 틀리다. **
 * 
 */
import java.io.*;
public class 반복문_6 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
		// String movie="";
		StringBuffer sb=new StringBuffer();
		int i=0; // 문자 읽기
		while ((i=fr.read())!=-1) // -1 EOF(파일 끝)
		{
			sb.append((char)i);
		}
		fr.close();
		System.out.println(sb.toString());

	}

}
