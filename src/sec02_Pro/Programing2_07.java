package sec02_Pro;

import java.util.Scanner;

public class Programing2_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		
		//what = (num % 4 == 0) && (num % 5 == 0) ? True : False//"True. 4�� 5�� �������ϴ�." : "False. 4�� 5�� �������� �ʽ��ϴ�.";
		//�̰Ŵ� �ȵ�, ? : ���� ������ ���๮(:)�� ""�� �� �� ����


		
		System.out.printf("4�� 5�� �� �� �������ϱ�? ");
		System.out.println((num % 4 == 0) && (num % 5 == 0));
		System.out.printf("4�� 5 ���߿� �ϳ��� �������ϱ�? ");
		System.out.println((num % 4 == 0) || (num % 5 == 0));
		System.out.printf("4�� 5 ��ΰ� �ƴ� 4�� 5�� �ϳ��θ� �������ϱ�? ");
		System.out.println((num % 4 == 0) ^ (num % 5 == 0));
	}

}
