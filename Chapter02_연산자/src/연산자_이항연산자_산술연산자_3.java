/*
 * 
 *  임의로 변수 초기화
 *   난수 = Math
 *   
 *    Math.random()  >> double
 *                      0.0~9.9
 *    Math.random()*100
 *                      0.0~99.0
 *   (int)(Math.random()*100)
 *                      0~99
 *   (int)(Math.random()*100)+1
 *                      1~100                  
 * 
 */
public class 연산자_이항연산자_산술연산자_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=(int)(Math.random()*100)+1; // 게임
		int b=(int)(Math.random()*100)+1;
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println(a+b);
		
        
	}

}
