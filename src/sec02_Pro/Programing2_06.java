package sec02_Pro;

import java.util.Scanner;

public class Programing2_06 {

	public static void main(String[] args) {	//È­¾¾(F')¸¦ ÀÔ·Â¹Þ¾Æ ¼·¾¾(C')·Î È¯»êÇØ Ãâ·Â
		// TODO Auto-generated method stub
		float fa;
		float cel;
		
		Scanner in = new Scanner(System.in);
		fa = in.nextFloat();
		
		cel = (5 / 9f) * (fa - 32);
		System.out.printf("È­¾¾(F) %.1fµµ¸¦ ¼·¾¾(C)·Î º¯È¯ÇÏ¸é %.2fµµ",fa, cel);
	}

}
