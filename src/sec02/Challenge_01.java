package sec02;

import java.util.Scanner;

public class Challenge_01 {		//직사각형의 넓이 구하기

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double w, h, area;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("직사각형의 가로 길이를 입력하시오: ");
		w = in.nextDouble();

		System.out.println("직사각형의 세로 길이를 입력하시오: ");
		h = in.nextDouble();
		
		area = w * h;
		
		System.out.println("직사각형의 넓이는 " + area + "입니다.");
		
	}
	//챔피언! 소리 지르는 니가!
	//챔피언! 음악에 미치는 니가!
}
