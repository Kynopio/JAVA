package sec02_Pro;

import java.util.Scanner;

public class Programing2_04 {

	public static void main(String[] args) {	//�ʸ� �Է��ϸ� �ð�, ��, �ʷ� ȯ��
		// TODO Auto-generated method stub
		int second, hour, minute;
		
		Scanner num = new Scanner(System.in);
		System.out.println("�� ���� ������ �Է��Ͻÿ� : ");
		second = num.nextInt();
		
		hour = second / 3600;
		minute = (second / 60) % 60;
		second = second % 60;
		
		System.out.printf("%d�ð� %d�� %d��", hour, minute, second);
	}

}
