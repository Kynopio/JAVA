package sec02_Pro;

import java.util.Scanner;

public class Programing2_06 {

	public static void main(String[] args) {	//ȭ��(F')�� �Է¹޾� ����(C')�� ȯ���� ���
		// TODO Auto-generated method stub
		float fa;
		float cel;
		
		Scanner in = new Scanner(System.in);
		fa = in.nextFloat();
		
		cel = (5 / 9f) * (fa - 32);
		System.out.printf("ȭ��(F) %.1f���� ����(C)�� ��ȯ�ϸ� %.2f��",fa, cel);
	}

}
