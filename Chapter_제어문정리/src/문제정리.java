/*
 * 
 *  1. String
 *      문자열 저장 클래스 / 일반 데이터형처럼 사용이 가능
 *      String name=""; > 선호
 *      String name=new String("초기값");
 *      
 *      클래스 > 문자열은 제어하는 기능 제공(메소드)
 *             완전 표준화(확장, 변경 불가능)
 *      메소드
 *       결과값(리턴형)
 *       어떠한 데이터를 첨부(매개변수)
 *       메소드명
 *        
 *      기능     | 매개변수
 *       int length()
 *              | 메소드명
 *        | 리턴형
 *        
 *       boolean equals(String s) > if
 *       String s1="";
 *       String s2="";
 *       // 아이디 중복체크, 로그인
 *       
 *       if(s1.equals(s2))   >  같은경우
 *       if(!s1.equals(s2))  >  같지 않은 경우
 *       
 *       if(s2.equals(s1))   >  같은경우
 *       if(!s2.equals(s1))  >  같지 않은 경우
 *       
 *       boolean contains(String s) > 포함된 문자인지 확인하는 경우
 *       String s1="aaaaaaa";
 *       String s2="a";
 *       if(s1.contains(s2)) > s1 안에 s2 포함 되어있는 경우(s1, s2는 변경 불가능)
 *       // 우편번호 검색, 검색
 *       
 *       boolean startsWith(String s)
 *       String s1="Hello Java";
 *       String s2="he";
 *       String s3="java";
 *       if(s1.startsWith(s2)) > 시작하는 문자열을 확인하는 경우
 *       inf(s1.endsWith(s3)) > 끝나는 문자열을 확인하는 경우
 *       // 자동완성기(서제스트)
 * 
 */
public class 문제정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
