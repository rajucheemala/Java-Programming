package loop;

import java.util.Scanner;

public class SumOfOddNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		int sum = 0;
		int b = 1;
		for(int i = 1;i <= n;i++) {
			sum = sum+b;
			b = b+2;
			
		}System.out.println(sum);
		sc.close();
		

	}

}
