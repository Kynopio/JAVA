package sec02_Pro;

import java.util.Scanner;

public class Programing2_09 {

	public static void main(String[] args) {	//졸업학점 구하기, 전공: 70이상, 교양과 일반은 각 30 이상 혹은 둘이 합쳐 80이상
		// TODO Auto-generated method stub
		int major, refinement, genelar;
		char a;
		Scanner in = new Scanner(System.in);
		
		System.out.println("전공 이수 학점 : ");
		major = in.nextInt();
		System.out.println("교양 이수 학점 : ");
		refinement = in.nextInt();
		System.out.println("일반 이수 학점 : ");
		genelar = in.nextInt();
		
		// (조건) ? (실행):(실행)의 방법, 복잡함
		/*System.out.println(major + refinement + genelar >= 140
				&& major >= 70
				&& ((refinement >= 30 && genelar >= 30) || refinement + genelar >= 80) ? "졸업 가능" : "졸업 불가능" );
				*/
		
		// 중첩 if문 사용
		if (major + refinement + genelar >= 140 ) {
			if (major >= 70) {
				if ((refinement >= 30 && genelar >= 30) || (refinement + genelar >= 80))
					System.out.println("졸업 가능");
				else
					System.out.println("졸업 불가능");		//else 위치에 유의
			}
		}
		
		
	}

}
