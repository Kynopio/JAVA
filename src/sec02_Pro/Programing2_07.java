package sec02_Pro;

import java.util.Scanner;

public class Programing2_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		
		//what = (num % 4 == 0) && (num % 5 == 0) ? True : False//"True. 4와 5로 나눠집니다." : "False. 4와 5로 나눠지지 않습니다.";
		//이거는 안돼, ? : 조건 만족시 실행문(:)에 ""가 들어갈 수 없음


		
		System.out.printf("4와 5로 둘 다 나눠집니까? ");
		System.out.println((num % 4 == 0) && (num % 5 == 0));
		System.out.printf("4나 5 둘중에 하나라도 나눠집니까? ");
		System.out.println((num % 4 == 0) || (num % 5 == 0));
		System.out.printf("4와 5 모두가 아닌 4나 5중 하나로만 나눠집니까? ");
		System.out.println((num % 4 == 0) ^ (num % 5 == 0));
	}

}
