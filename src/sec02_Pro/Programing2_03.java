package sec02_Pro;

import java.util.Scanner;

public class Programing2_03 {		//원기둥의 부피 구하기

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r, h;
		double v;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("원기둥의 밑면 반지름은?");
		r = in.nextInt();
		System.out.println("원기둥의 높이는?");
		h = in.nextInt();
		
		v = 3.14 * r * r * h;
		System.out.println("원기둥의 부피는 " + v);
	}

}
