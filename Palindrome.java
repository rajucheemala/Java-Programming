package loop;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		int reverse = 0;
		int sum = 0;
		while (num != 0) {
			reverse = num % 10;
			sum=(sum*10)+reverse;
			num = num / 10;
			
		}System.out.println(sum);
		if(num == sum) {
			System.out.println("given number is palindrom");
			
		}else {
			System.out.println("given number is not a palindrome");
			sc.close();
		}
		
			

	}

}
