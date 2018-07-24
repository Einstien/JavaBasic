package july24;

public class sumofArray {
	
	public static void main (String args[]) {
		int[] array = {10, 20, 30, 41, 50, 100};
		int sum = 0;
		for (int num: array) {
			sum = sum + num;
		}
		
		System.out.println(sum);
	}

}
