package sec02_Pro;

//import java.util.Scanner;

public class Programing2_05 {		//임의의 소문자를 대문자로, 순서: 대문자A(65) 소문자a(97)

	public static void main(String[] args) { //32
		// TODO Auto-generated method stub
		char c = 'a';
		int i_c;
		
		//Scanner in = new Scanner(System.in);
		//c = in.next();
		
		//i_c = (int)'A' - (int)'a';
		i_c = (int)'a' - 32;
		c = (char)i_c;
		
		System.out.println(c);
	}

}
