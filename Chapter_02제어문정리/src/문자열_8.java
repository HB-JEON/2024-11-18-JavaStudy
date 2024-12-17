// 대문자 변환 > toUpperCase()
import java.util.Scanner;
/*
 *  함수 - function
 *  메소드 - method
 *  	> 기능상 동일
 *   class 종속
 *   C/C++/Python > function
 *   Java/Kotlin > method
 *  
 *  replace(문자,문자)
 *          |old |new
 *          
 *  String data="Hello Java"
 *  data.replace('a','b') > Hello Jbvb        
 *          
 *  replace(문자열,문자열)
 *          |old  |new
 *  String data="Hello Java"
 *  data.replace('Java','Oracle') > Hello Oracle
 */
public class 문자열_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String name="HONG GIL DONG";
//		System.out.println(name.toLowerCase());
		// Upper/Lower 오라클 함수
		// 데이터 관리 > 자바+오라클 > JSP에서 HTML로 변환
		
		String data="Hello Java";
		System.out.println(data.replace('a', 'k'));
		System.out.println(data.replace("Java", "Oracle"));
		// 이미지, 줄거리, 내용
		// |, &, '' > 오라클 - 첨부 불가
		// & > Scanner
		// || > 문자열 결합
		// 문자열 > ''		> replace를 통하여 오라클에 첨부/연동
		
	}

}
