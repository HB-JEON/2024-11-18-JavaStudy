/*
 *  
 *  중첩 조건문
 *   3개의 점수를 받아서 총점, 평균, 학점
 *   > 97이상 A+ / 94이상 A0 / 90 A-
 */
import java.util.Scanner;
public class 제어문_조건문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.print("국어 점수 입력:");
		int kor=scan.nextInt();
		System.out.print("영어 점수 입력:");
		int eng=scan.nextInt();
		System.out.print("수학 점수 입력:");
		int math=scan.nextInt();
		
		int total=kor+eng+math;
		// 총점
		double avg=total/3.0;
		// 평균
		char score='A',opt='+'; // 초기화
		// 학점 | A~F    | +,0,-
		int avg2=(int)avg;
		if(avg2>=90 && avg2<100)
		{
			score='A';
			if(avg2>=97 && avg2<=100)
				opt='+';
			if(avg2>=94 && avg2<97)
				opt='0';
			if(avg2<94)
				opt='-';
		}
		if(avg2>=80 && avg2<90)
		{
			score='B';
			if(avg2>=87 && avg2<=90)
				opt='+';
			if(avg2>=84 && avg2<87)
				opt='0';
			if(avg2<84)
				opt='-';
		}
		System.out.println("===== 결과값 =====");
		System.out.println("국어 점수:"+kor);
		System.out.println("영어 점수:"+eng);
		System.out.println("수학 점수:"+math);
		System.out.println("총 점:"+total);
		System.out.printf("평균:%.2f\n",avg);
		System.out.println("학점:"+score+""+opt);
		
		
	}

}
