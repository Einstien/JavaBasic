package june21;

public class palindrome {
	
	public static void main(String [] args) {
		
		System.out.println(reverseValue());
	}
	
	private static String reverseValue() {
		String value  = "asdfhg";
		int lnth = value.length();
		String reverse = "";
		for (int j = lnth-1; j>0 ; j-- ) {
			reverse = reverse + value.charAt(j);
		}
		return reverse;
	}

}
