/*
 *  1. 데이터를 관리하기 쉽게 데이터 묶어서 사용
 *    같은 데이터형을 모아서 관리 > 배열
 *    다른 데이터를 모아서 관리 > 구조체 / 클래스
 *                         |       | 사용자 정의 데이터형
 *                         | 자바 사용 X
 *  2. 관련된 명령문을 묶어서 사용 > 재사용   
 *              연산자, 제어문 > 메소드                       
 *     =========================== 클래스(묶음)
 *      클래스 - 객체지향의 특성
 *              캡슐화
 *              상속
 *              다양성
 *      클래스의 종류 - 종단 클래스 / 추상 클래스 / 인터페이스 / 내부 클래스 
 *      
 *  84 page
 *   배열
 *    일차원 배열
 *     웹 > 일차원 배열
 *    이차원 배열
 *    다차원 배열
 *    가변 배열  
 *   | > Collection > 10장(데이터를 모으는 웹 프로그램의 핵심)
 *     > 자바 > 웹이서 사용하는 자바
 *  배열 (Array)
 *   장점
 *    인덱스 - 기반 0번부터 시작하여 순차적으로 진행
 *      > for 사용 용이, 데이터를 빠르게 접근 가능
 *    연속적인 메모리 저장 - 메모리 크기가 동일
 *      ** 메모리 관리 효율적 **
 *      ** CPU 캐시(cache)를 통하여 배열에 있는 데이터에 접근하는 시간 단축 **
 *      
 *   단점 
 *    고정된 크기 - 사용 전 크기를 설정
 *     *** 가변형 > ArrayList ***
 *    데이터 삽입 / 삭제 불가
 *     추가 / 삭제 > 새로운 배열을 생성하여 사용
 *     
 *   ** 같은 유형의 변수를 여러개 저장하는 고정된 크기의 데이터 구조 **
 *      ----------- long(int,char..)
 *      ----------- 선언 시 큰 데이터형을 선언 > 작은 데이터형 첨부
 *      메모리 연속 배치
 *  
 *  배열의 필요성
 *   *** 3명의 학생의 국어 영어 수학 점수를 입력 받은 후 총점 평균을 구한다.
 *  
 */

import java.util.Scanner;
public class 배열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		int kor1,kor2,kor3;
		int eng1,eng2,eng3;
		int math1,math2,math3;
		int total1,total2,total3;
		double avg1,avg2,avg3;
		// 변수가 많은 경우에는 관리가 어렵다 > 한개의 이름으로 제어
		// 배열 > 클래스
		// 클래스 여러개 > 인터페이스 / 추상 클래스
		
		System.out.print("첫번째 학생의 국어 점수:");
		kor1=scan.nextInt();
		System.out.print("첫번째 학생의 영어 점수:");
		eng1=scan.nextInt();
		System.out.print("첫번째 학생의 수학 점수:");
		math1=scan.nextInt();
		
		System.out.print("두번째 학생의 국어 점수:");
		kor2=scan.nextInt();
		System.out.print("두번째 학생의 영어 점수:");
		eng2=scan.nextInt();
		System.out.print("두번째 학생의 수학 점수:");
		math2=scan.nextInt();
		
		System.out.print("세번째 학생의 국어 점수:");
		kor3=scan.nextInt();
		System.out.print("세번째 학생의 영어 점수:");
		eng3=scan.nextInt();
		System.out.print("세번째 학생의 수학 점수:");
		math3=scan.nextInt();
		
		total1=kor1+eng1+math1;
		total2=kor2+eng2+math2;
		total3=kor3+eng3+math3;
		
		avg1=total1/3.0;
		avg2=total2/3.0;
		avg3=total3/3.0;
		
		System.out.printf("%d %d %d %.2f\n"+kor1,eng1,math1,total1,avg1);
		System.out.printf("%d %d %d %.2f\n"+kor2,eng2,math2,total2,avg2);
		System.out.printf("%d %d %d %.2f\n"+kor3,eng3,math3,total3,avg3);
		
	}

}
