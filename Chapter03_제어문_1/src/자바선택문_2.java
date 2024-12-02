/*
 * 
 *  64 page > 계절 처리
 *   3 4 5 봄
 *   6 7 8 여름
 *   9 10 11 가을
 *   12 1 2 겨울
 *   난수 처리
 * 
 */
public class 자바선택문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~12의 무작위수를 임의 추출
		
		int month=(int)(Math.random()*12)+1; // 1~12
		// 사용자 입력은 범위를 벗어날 확률이 존재 > default
		// default / else > 다른 값을 입력하거나 잘못된 입력을 처리할 때
		// 					default / else는 이러한 이유로 생략이 가능
		switch(month)
		{
			case 3: case 4: case 5: // if(month==3 || month==4 || month==5)
			System.out.println(month+"월은 봄 입니다.");
			break;
			case 6: case 7: case 8: // else if(month==6 || month==7 || month==8)
				System.out.println(month+"월은 여름 입니다.");
				break;
			case 9: case 10: case 11: // else if(month==9 || month==10 || month==11)
				System.out.println(month+"월은 가을 입니다.");
				break;
			case 12: case 1: case 2:  // else if(month==12 || month==1 || month==2)
				System.out.println(month+"월은 겨울 입니다.");
				break;
			// default > 생략이 가능(필요 시에만 사용)
			
		}

	}

}
