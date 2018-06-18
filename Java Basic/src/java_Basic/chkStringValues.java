package java_Basic;



public class chkStringValues {

	public static void main(String[] args) {		
		chkStringValues a = new chkStringValues ();
		a.checkStringValues("{}{}}{{}{@#%$^^&&*^*&545645646545jkhkjnkmbnvhjv1464541321212^");
		
	}		
	protected void checkStringValues(String data) {		
		int ln = data.length();
		String intval = "";
		String chval = "";
		String schval = "";			
		if (ln != 0) {		
		for (int i =0; i<ln; i++) {			
			char  a =data.charAt(i);			
			boolean d = Character.isDigit(a);
			boolean c = Character.isLetter(a);			
			if (d) {							
				intval = intval + a;				
			}
			else if (c) {				
				chval =chval+a;
			}	
			else {
				schval = schval+a;
			}
		}		
				
	} 
		else {System.out.println("No Values in String");}		
		while (intval.length() != 0) {System.out.println("The Integer Value in String is : " + intval); break;}
		while (chval.length() != 0) {System.out.println("The Charachter Value in String is : " + chval); break;}
		while (schval.length() != 0){System.out.println("The Special Charachter Value in String is : " + schval); break;}
  }
}
