/*
 * 
 *  문자의 위치 찾기
 *   indexOf(문자) : 지정된 문자를 문자열 앞에서부터
 *   lastIndexOf(문자) : 지정된 문자를 문자열 뒤에서부터
 *    > 확장자
 *   *** 없는 경우 -1 ***
 *    
 *    Hello Java
 * 
 */
public class 문자열_5 {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String data="Hello Java";
		// 웹에서 등장 - URL > 마지막 파일명을 찾아서 처리
		int a=data.indexOf("a");
		int b=data.lastIndexOf("a");
		int c=data.indexOf("c");
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		
	}

}
