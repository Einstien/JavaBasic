package java_Basic;

public class palindrome {	
	
	public static void main (String [] args) { 	
	 String a = "656";	 
	 int j = a.length()-1;	 
	 String reverse = "";	 
	 for(int i= j; i>=0; i--) {		 
		 reverse = reverse + a.charAt(i);		 
	 }
	 System.out.println(reverse );
	 
	 if (a.equalsIgnoreCase(reverse)) {		 
		 System.out.println( a + " Is Plaindrome");
		 }
 }

}
