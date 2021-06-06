package loop;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		int fact = 0;
		for(int i = 1;i <=6 n/2;i++) {
			if(n % i == 0){
				fact += i;
			}
		}if(fact == n) {
			System.out.println("given number is perfect number");
		}else {
			System.out.println("given number is not perfect number");
		}sc.close();

	}

}
