/*
 * 
 *  문자 자르기
 *  ***** (매우중요)
 *  substring - 문자열을 자르는 기능
 *   | 지정된 위치부터 마지막까지
 *      hello Java
 *      0123456789
 *      substring(6) > Java
 *   | 중간에서 자르기 
 *      substring(1,4) > ell
 *                  | endIndex -1
 *  trim() - 공백제거               
 *    
 *  >>>>>> JavaScript와 동일
 * 
 */
public class 문자열_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String data="Hello.Hello.java";
		//           0123456789...... +1
//		System.out.println(data.substring(data.lastIndexOf(".")+1));
		String data="ID:admin,PWD:1234";
		String id=data.substring(data.indexOf(":")+1,data.indexOf(",")); //,는 제외
		System.out.println(id);
		String pwd=data.substring(data.lastIndexOf(":")+1);
		System.out.println(pwd);
		System.out.println(data);
		
		String address="서울 동대문구 회기동 346-14[새주소] 서울 동대문구 경희대로4길 76";
		String adr1=address.substring(0,address.indexOf("["));
		System.out.println(adr1);
		String adr2=address.substring(address.indexOf("]")+1);
		System.out.println(adr2.trim());
		// trim() > 좌우의 공백을 제거
		System.out.println(address);
		
		String s="Hello Java";
		String ss=s.substring(s.indexOf(" ")+1);
		System.out.println(s);
		System.out.println(ss);
		
	}

}
