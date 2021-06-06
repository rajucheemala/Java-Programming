package methods;

import java.util.Scanner;

public class Fibo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		fibonacciNum(num);
	}
public static void fibonacciNum(int num)
{
	int n1 = 0, n2 = 1;
	for (int i = 1; i <= num; ++i) 
	{
		System.out.print(n1 + " "); 

		int temp = n1 + n2;
		n1 = n2;
		n2 = temp;

	}

	 }
}

