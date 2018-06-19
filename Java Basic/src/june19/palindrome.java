package june19;

public class palindrome {
	
	public static void main(String args[]) {
		System.out.println( reverse("wqeyrbn"));
		
	}	
	static String reverse(String val) {	
		String data = val;
		int lnth= data.length();
		String reverse = "";
		for(int j= lnth-1 ; j>=0; j--) {
			char a = data.charAt(j);
			reverse = reverse + a;
			}
		return reverse;
	}
}
