package methods;

import java.util.Scanner;

public class CalSpeed {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter distance in kilometers");
		int d = sc.nextInt();
		System.out.println("enter the time in hrs");
		int t = sc.nextInt();
		System.out.println("speed is:" +CalSpeed(d, t)+"m/s");

	}
	public static double CalSpeed(int d, int t) {
		double speed = (double)d / t;
		return speed;
	}

}
