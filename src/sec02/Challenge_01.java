package sec02;

import java.util.Scanner;

public class Challenge_01 {		//���簢���� ���� ���ϱ�

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double w, h, area;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("���簢���� ���� ���̸� �Է��Ͻÿ�: ");
		w = in.nextDouble();

		System.out.println("���簢���� ���� ���̸� �Է��Ͻÿ�: ");
		h = in.nextDouble();
		
		area = w * h;
		
		System.out.println("���簢���� ���̴� " + area + "�Դϴ�.");
		
	}

}
