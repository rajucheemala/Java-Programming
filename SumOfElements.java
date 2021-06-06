package Arrays;
import java.util.*;


public class SumOfElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array:");
		int size =sc.nextInt();
		int sum = 0;
		int[] arr = new int[size];
		System.out.println("enter array elements:");
		for(int index = 0; index < arr.length; index++) {
			arr[index] = sc.nextInt();
			//System.out.println(arr[index]);
			
		}
		/*System.out.println("sum of elements are:"+ Raj(int[]));
		
		}
	public static int Raj(Class<int[]> class1) {
		for(int b = 0; b <= class1.length; b++) {
			int b = sc.nextInt();
			sum = sum + class1[b];
			System.out.println(sum);
			
		}return sum();*/
	}
	
}
