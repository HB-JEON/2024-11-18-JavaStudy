/*
 * 
 *  국어 / 영어 / 수학 > 입력.. > 총점 / 평균 / 학점
 * 
 */
import java.util.Scanner;
/*
 *  1. 변수값 (초기화) > 입력을 받아서 초기화
 *  2. 처리 (기능)
 *     메소드를 이용하여 재사용
 *  3. 결과값
 */
public class 자바제어문_단일조건문_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.print("국어 점수 입력:");
		int kor=scan.nextInt();
		System.out.print("수학 점수 입력:");
		int eng=scan.nextInt();
		System.out.print("영어 점수 입력:");
		int math=scan.nextInt();
		
		int total=kor+eng+math;
		double avg=total/3.0;
		
		System.out.println("===== 결과값 =====");
		System.out.println("국어 점수:"+kor);
		System.out.println("영어 점수:"+eng);
		System.out.println("수학 점수:"+math);
		System.out.println("총 점:"+total);
		System.out.printf("평균 점수:%2f\n",+avg);
		// \n (다음줄 출력) \t (일정간격) \\(경로 출력) \"(출력) %.2f\n
		
		char score='A';
		
		
		int temp=(total/3); 
		if(temp>=90 && temp<=100)
			score='A';
		if(temp>=80 && temp<90)
			score='B';
		if(temp>=70 && temp<80)
			score='C';
		if(temp>=60 && temp<=70)
			score='D';
		if(temp<60)
			score='F';
			
		System.out.println("학점:"+score);
				
				
		

	}

}
