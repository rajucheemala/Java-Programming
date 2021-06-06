package loop;

import java.util.Scanner;

public class FactorialOfGivenNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		int temp = 1;
		for(int i = 1;i<=n;i++) {
			temp = temp * i;
		
			
		}System.out.println(temp);
		sc.close();

	}

}
