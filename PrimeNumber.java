package loop;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		boolean flag = false;
		for(int i = 2; i <= num/2; i++) {
			if(num%i == 0) {
				flag = true;
				System.out.println("given number is not  prime");
				break;
				
			}
			}
		sc.close();
		if(flag == false) {
			System.out.println("prime number");
		}
	}

}
