package sec02;

public class Exercise2_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0, y = 1;
		System.out.println((x < 1) || (y-- < 1));
		System.out.println("x = " + x + ", y = " + y);
		
		x = 0;
		y = 1;
		System.out.println((x < 1) | (y-- < 1));
		System.out.println("x = " + x + ", y = " + y);
	}

}
