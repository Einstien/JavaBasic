package june21;

public class ConvertIntArray {
	
	public static void main(String []args) {
		
		convertArray();
		
	}
	
	static void convertArray( ) {
		
		int a = 21634541, count = 0;
		
		// int len = Integer.toString(a).length();
		// Count the number of digit in a integer
		while(a>0) {
			a = a/10;
			count  = count +1;
			}
		
		int ln = count ;
		int arr[] = new int[ln];
		for (int j=0; j<ln; j++) {
			
			arr[j] = a%10;
			a /=10;
			
		}
		
	}

}
