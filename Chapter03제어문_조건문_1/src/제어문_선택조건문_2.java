/*
 *  
 *  정수를 입력을 받은 후 짝수/홀수
 *  random() 1~100
 *  random() 1~100 숫자 2개 발생 
 *  >최대값 / 최소값
 */
public class 제어문_선택조건문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 임의의 정수를 받는다
		/*
		int num=(int)(Math.random()*100)+1;
		if(num%2==0) // 짝수라면
			System.out.println(num+"는(은) 짝수");
		else
			System.out.println(num+"는(은) 홀수");\
			*/
		int num1=(int)(Math.random()*100)+1;
		int num2=(int)(Math.random()*100)+1;
		System.out.println("num1="+num1+",num2="+num2);
		
		int max=0,min=0;
		if(num1>num2)
		{
			max=num1;
			min=num2;
		}
		else
		{
			max=num2;
			min=num1;
		}
		
		
			System.out.println("===== 결과값 =====");
			System.out.println("최대값:"+max);
			System.out.println("최소값:"+min);
			
		/*
		System.out.println("===== 결과값 =====");
		System.out.println("최대값:"+Math.max(num1, num2));
		System.out.println("최소값:"+Math.min(num1, num2));
		*/
	}

}
