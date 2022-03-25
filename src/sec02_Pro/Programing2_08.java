package sec02_Pro;

import java.util.Scanner;

public class Programing2_08 {

	public static void main(String[] args) {	//0~999 사이의 정수를 입력받아 각 자릿수를 더한 결과 출력
		// TODO Auto-generated method stub
		int num, tmp_100, tmp_10, tmp_1;
		
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		
		tmp_100 = num / 100;
		System.out.println(tmp_100);
		
		tmp_10 = (num % 100) / 10;
		System.out.println(tmp_10);
		
		tmp_1 = (num % 100) % 10;
		System.out.println(tmp_1);
		
		System.out.printf("각 자릿수의 합은 : ");
		System.out.println(tmp_100 + tmp_10 + tmp_1);
	}

}
