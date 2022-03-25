package sec02_Pro;

import java.util.Scanner;

public class Programing2_02 {		//제곱수 구하기

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner num = new Scanner(System.in);
		
		System.out.println("정수를 입력하시오 : ");
		n = num.nextInt();
		
		System.out.printf("%d의 제곱은 %d", n, n*n);
	}

}
