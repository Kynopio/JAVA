package sec02_Pro;

import java.util.Scanner;

public class Programing2_09 {

	public static void main(String[] args) {	//�������� ���ϱ�, ����: 70�̻�, ����� �Ϲ��� �� 30 �̻� Ȥ�� ���� ���� 80�̻�
		// TODO Auto-generated method stub
		int major, refinement, genelar;
		char a;
		Scanner in = new Scanner(System.in);
		
		System.out.println("���� �̼� ���� : ");
		major = in.nextInt();
		System.out.println("���� �̼� ���� : ");
		refinement = in.nextInt();
		System.out.println("�Ϲ� �̼� ���� : ");
		genelar = in.nextInt();
		
		// (����) ? (����):(����)�� ���, ������
		/*System.out.println(major + refinement + genelar >= 140
				&& major >= 70
				&& ((refinement >= 30 && genelar >= 30) || refinement + genelar >= 80) ? "���� ����" : "���� �Ұ���" );
				*/
		
		// ��ø if�� ���
		if (major + refinement + genelar >= 140 ) {
			if (major >= 70) {
				if ((refinement >= 30 && genelar >= 30) || (refinement + genelar >= 80))
					System.out.println("���� ����");
				else
					System.out.println("���� �Ұ���");		//else ��ġ�� ����
			}
		}
		
		
	}

}
