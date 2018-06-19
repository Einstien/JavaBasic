package june18;

public class palindrome {

	public static void main(String[] args) {
		
		palindrome a = new palindrome();
	}
	 
	palindrome() {		
		String value = "asdffhaklj";
		int valu = value.length()-1;
		String reverse = " ";
		for (int i = valu; i >=0 ;  i--) {
			reverse = reverse + value.charAt(i);
			}
		System.out.println(reverse);		
	}
}
