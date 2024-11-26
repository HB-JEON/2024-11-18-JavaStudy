/*
 * 
 *        break - 반복문, 선택문에서만 사용 가능
 *        			| 조건문 사용 불가능
 *                 for()
 *                 {
 *                    if()
 *                    {
 *                       break
 *                    }
 *                 }
 *                 
 *                 if() > 단독문으로 사용시에 사용 불가능
 *                 {
 *                    break; > X
 *                 }
 *                > 반복문이 선택문을 종료할 때 사용하는 제어문
 *                 
 *        continue - 반복문에서만 사용 가능
 *        				| 조건문 선택문에서 사용 불가능 
 *        				| 특정 부분을 제외할 때 사용
 *        				| for문 증가식 이동
 *        				| while문 조건식 이동
 *       *** break, continue 다음에는 소스 코딩 불가능
 *                 for()
 *                 {
 *                    if
 *                    {
 *                       // 소스 코딩 가능
 *                       break;
 *                       // 소스 코딩 불가능
 *                    }
 *                 }
 * 
 */
public class 반복제어문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=10;i++)
		{
			if(i==5 || i==7)
				// break;
				continue; // i++로 이동 > 6부터 출력
			System.out.print(i+" ");
		}
		
	}

}
