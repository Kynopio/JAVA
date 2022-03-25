package sec02_Pro;

import java.util.Scanner;

public class Programing2_04 {

	public static void main(String[] args) {	//초를 입력하면 시간, 분, 초로 환산
		// TODO Auto-generated method stub
		int second, hour, minute;
		
		Scanner num = new Scanner(System.in);
		System.out.println("초 단위 정수를 입력하시오 : ");
		second = num.nextInt();
		
		hour = second / 3600;
		minute = (second / 60) % 60;
		second = second % 60;
		
		System.out.printf("%d시간 %d분 %d초", hour, minute, second);
	}

}
