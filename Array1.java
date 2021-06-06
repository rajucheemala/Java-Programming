package Arrays;

public class Array1 {

	public static void main(String[] args) {
		int values [] = new int[4];
		values[0] = 22;
		values[1] = 23;
		values[2] = 24;
		values[3] = 25;
		/*System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);
		System.out.println(values[3]);*/
		for(int index = 0; index < 4; index++) {
			System.out.println("values[" + index+ "] = "  +values[index]);
		}
	}

}
