package sec02_Pro;

import java.util.Scanner;

public class Programing2_08 {

	public static void main(String[] args) {	//0~999 ������ ������ �Է¹޾� �� �ڸ����� ���� ��� ���
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
		
		System.out.printf("�� �ڸ����� ���� : ");
		System.out.println(tmp_100 + tmp_10 + tmp_1);
	}

}
