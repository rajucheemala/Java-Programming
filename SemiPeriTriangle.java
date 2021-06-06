package methods;

import java.util.Scanner;

public class SemiPeriTriangle {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the three sides");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
       System.out.println("The Triangle semiperimeter is"+CalculateSemiPerimeter(a, b, c));

	}
	public static double CalculateSemiPerimeter(int a,int b,int c)
	{
		double semiperimeter=(a+b+c)/2;
		return semiperimeter;
	}

}
