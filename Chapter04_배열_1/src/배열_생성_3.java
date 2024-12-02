//  변수 > 배열
//  연산처리 > 제어문 처리 > 사용자 요청 > 메소드
//  ---------------------------------- 클래스 구성 요소
//  객체 지향 언어 > 자바 시작(5장)
//  사용자 정의 데이터형
//  1. 정수를 입력 받아서 > 2진법 출력 10 > 0000 0000 0000 1010
//  16bit > 2byte > 32767           ----bit

import java.util.Scanner;
public class 배열_생성_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int INDEX=32;
		Scanner scan=new Scanner(System.in);
		System.out.print("0~32767사이 정수 입력:");
		int num=scan.nextInt();
		// 저장 공간 - 0,1을 16개 저장하는 공간
		int[] binary=new int[INDEX];
		// 앞(index=0), 뒤(index=15) 저장 방향
		// index=0 > 0부터 출력 FIFO > Queue
		// index=15 > 15부터 출력 LIFO > Stack
		int index=INDEX-1; // 저장위치
		
		// 요청 처리 > 제어문 / 연산자
		while(true)
		{
			binary[index]=num%2;
			num/=2;
			
			if(num==0)
				break;
			
			index--;
		}
		// 출력
		for(int i=0;i<binary.length;i++)
		{
			// 배열의 갯수
			if(i!=0 && i%4==0)
				System.out.print(" ");
			System.out.print(binary[i]);
		}
	}

}
