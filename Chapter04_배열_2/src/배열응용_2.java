// 달력
/*
 * 
 *  1. 사용자 정의
 *      달력 : 1일자의 요일 확인
 *       > 1년도 1월 1일 - 월요일
 *        (1) 1/1/1 ~ 2013/12/31 총 날짜의 수 계산
 *        (2) 2023/11/30 > 총 날짜의 수 계산
 *        (3) +1
 *        (1)+(2)+(3) / 7 = 요일
 *         0~6 0=일요일 6=토요일
 *        > 예약 / 일정 관리 
 *  2. 라이브러리 Calendar
 *  
 *  
 */
import java.util.Scanner;
public class 배열응용_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 입력받기 > year/month/day > 요일
		Scanner scan=new Scanner(System.in);
		System.out.print("년도 입력:");
		int year=scan.nextInt();
		System.out.print("월 입력:");
		int month=scan.nextInt();
//		System.out.print("일 입력:"); 
//		int day=scan.nextInt();
		
		// 전 년도까지의 날
		// *** 윤년 계산 ***
		int total=(year-1)*365
				 +(year-1)/4
				 -(year-1)/100 // 윤년 처리 제외
				 +(year-1)/400; // 윤년 처리 /4, /400
		// 전 달까지의 날
		int[] lastday={31,28,31,30,31,30,31,31,30,31,30,31};
		if ((year%4==0 && year%100!=0) || (year%400==0))
			// 윤년 조건
			lastday[1]=29;
		else
			lastday[1]=28;
		for(int i=0;i<month-1;i++)
		{
			total+=lastday[i];
		}
		// 입력한 날 +
//		total+=day;
		total++;
		
		// 요일
		// switch case 대신 사용
		char[] strWeek={'일','월','화','수','목','금','토'};
		int week=total%7;
		
		System.out.println(year+"년도"+month+"월");
		System.out.println();
		
		for(char c:strWeek)
		{
			System.out.print(c+"\t");
		}
		System.out.println();
		for(int i=1;i<=lastday[month-1];i++)
		{
			if(i==1) // for 시작
			{
				for(int j=0;j<week;j++)
				{
					System.out.print("\t"); // HTML 변경
				}
			}
			System.out.printf("%-2d\t",i);
			week++; // 요일 변경
			if(week>6) // 일요일이라면
			{
				week=0;
				System.out.println(); // 다음 줄 출력
			}
		}
	}

}
