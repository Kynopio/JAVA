package sec02_Pro;

import java.util.Scanner;

public class Programing2_03 {		//������� ���� ���ϱ�

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r, h;
		double v;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("������� �ظ� ��������?");
		r = in.nextInt();
		System.out.println("������� ���̴�?");
		h = in.nextInt();
		
		v = 3.14 * r * r * h;
		System.out.println("������� ���Ǵ� " + v);
	}

}
