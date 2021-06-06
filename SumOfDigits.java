package loop;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		int digit = 0;
		int sum = 0;
		while(num>0) {
			digit = num % 10;
			sum = digit + sum;
			num = num / 10;
		}
		System.out.println(sum);
		sc.close();

	}

}
