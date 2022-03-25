package sec02;

public class Exercise2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mach;
		int distance;
		mach = 340;		//음속을 m/s로 나타낸 값
		distance = mach * 60 * 60;
		System.out.println("소리가 1시간 동안 간 거리: " + distance + "m");
		
		double radius;	//반지름
		double area;	//원의 넓이
		radius = 10.0;
		area = 3.14 * radius * radius;
		System.out.println("반지름이 " + radius + "인 원의 넓이: " + area);
	}

}
