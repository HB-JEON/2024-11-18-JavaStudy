// replaceAll("","")
// 정규식 > 데이터 수집
public class 문자열_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String data="Hello 자바 1234";
		System.out.println(data.replaceAll("[^가-힣]", ""));
		// 한글만 출력                          ^(제외) 한글만 제외하고 공백
		System.out.println(data.replaceAll("[^A-Za-z]", ""));
		// 영문만 출력
		System.out.println(data.replaceAll("[^0-9]", ""));
		// 숫자만 출력
	 	
	}

}
