package methods;

import java.util.Scanner;

public class CalBmi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input weight in kilogram: ");
		int weight = sc.nextInt();
		System.out.print("Input height in meters: ");
		double height = sc.nextDouble();

		System.out.println("The BMI is" + calBMI(height, weight));
	}

	public static double calBMI(double height, int weight) {
		double BMI = weight / height * height;
		return BMI;
	}

}
