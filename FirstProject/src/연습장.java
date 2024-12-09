// x<10 && x>20
// ch==' ' || ch=='\t'
// ch=='x' || ch=='X'
// ch<=0 && ch=>9

import java.util.Scanner;
public class 연습장 {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int donpr=8000;
		int kalpr=6000;
		int pupr=5000;
		
		int donea=16;
		int kalea=8;
		int puea=1;
		
		int sum=donpr*donea+kalpr*kalea+pupr*puea;
		
		System.out.printf("돈까스 %-2d x %-2d = %-2d\n",donpr, donea, donpr*donea);
		System.out.printf("칼국수 %-2d x %-2d = %-2d\n",kalpr, kalea, kalpr*kalea);
		System.out.printf("왕만두 %-2d x %-2d = %-2d\n",pupr, puea, pupr*puea);
		System.out.println("총합 : "+sum );
		
	}

}

