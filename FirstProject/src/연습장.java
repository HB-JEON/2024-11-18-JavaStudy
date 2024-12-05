// x<10 && x>20
// ch==' ' || ch=='\t'
// ch=='x' || ch=='X'
// ch<=0 && ch=>9

import java.util.Scanner;
public class 연습장 {
	
	static void input(int[] kor, int[] eng, int[] math, int[] total, double[] avg) {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < kor.length; i++) {
            // Input scores for each student
            System.out.print((i + 1) + "' 학생 국어 점수: ");
            kor[i] = scan.nextInt();

            System.out.print((i + 1) + "' 학생 영어 점수: ");
            eng[i] = scan.nextInt();

            System.out.print((i + 1) + "' 학생 수학 점수: ");
            math[i] = scan.nextInt();

            // Calculate total and average
            total[i] = kor[i] + eng[i] + math[i];
            avg[i] = total[i] / 3.0;  // Make sure this calculates as a double
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] kor = new int[3];
        int[] eng = new int[3];
        int[] math = new int[3];
        int[] total = new int[3];
        double[] avg = new double[3];

        // Call input method to take user input
        input(kor, eng, math, total, avg);

        // Display results (optional)
        for (int i = 0; i < kor.length; i++) {
            System.out.println((i + 1) + "' 학생 총점: " + total[i] + ", 평균: " + avg[i]);
        }
		
	}

}

