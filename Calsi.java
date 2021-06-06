package methods;

import java.util.Scanner;

public class Calsi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("sum is:" +add (num1, num2));
		System.out.println("difference is:" +sub (num1, num2));
		System.out.println("multiplication is:" +mul (num1, num2));
		System.out.println("division is:" +div (num1, num2));
		System.out.println("average  is:" +avg (num1, num2));

	}
	public static int add (int num1, int num2) {
	int sum = num1 + num2;
	return sum;
	}
	public static int sub (int num1, int num2) {
		int diff = num1 - num2;
		return diff;
	}
	public static double mul (int num1, int num2) {
		double multiple = num1 * num2;
		return multiple;
	}public static double div (int num1, int num2) {
		double division = (double)num1 / num2;
		return division;
	}
	public static double avg (int num1, int num2) {
	double res = add(num1, num2);
	double avg = res / 2;
	return avg;
	}

}
