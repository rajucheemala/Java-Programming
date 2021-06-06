package methods;

import java.util.Scanner;

public class AreaCircleandCir {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the radious");
		int r = sc.nextInt();
		System.out.println("area of triangle is:" +Area(r));
		//System.out.println("circumstance of triangle:" +Cir(r));
	}
	public static double Area(int r) {
		double area = 3.14 * r * r;
		return area;
	}

}
