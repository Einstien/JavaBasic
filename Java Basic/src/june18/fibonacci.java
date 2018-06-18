package june18;

public class fibonacci {

	public static void main(String[] args) {
		
		fibonacci a = new fibonacci(5);
		fibonacci b = new fibonacci(20);

	}
	
	fibonacci(int data) {
		int n1 = 0, n2 = 1 , n3 , count = data; 
		System.out.print(n1 + " " + n2);
		for (int i=2; i<count ; i ++) {
			n3 = n1+ n2;
			System.out.print(" " + n3);
			n1=n2;
			n2=n3;
		}
		System.out.println(" ");
	}

}
