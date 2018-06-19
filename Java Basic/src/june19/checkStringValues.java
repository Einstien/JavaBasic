package june19;

public class checkStringValues {
	
	public static void main (String [] args) {
		checkVlaueFormat("ahdfadndfnaop@#$#%&*^(*&(HGJHGHJKH2335645656768HKLHKLJ");
	}	
	static void checkVlaueFormat(String val) {		
		String data = val;
		int dataLength = data.length();
		String charValue = "";
		String intValue = "";
		String spValue = "";
		
		for (int i=0; i<dataLength; i++ ) {			
			char a = data.charAt(i);
			boolean charac = Character.isLetter(a);
			boolean intval = Character.isDigit(a);
			if (charac) {
				charValue = charValue + a;
				}
			else if (intval) {
				intValue = intValue + a;
				}
			else {
				spValue = spValue + a;
			}			
		}
		while (charValue.length()!=0) {System.out.println("Charachter value :" + charValue); break;}
		while (intValue.length()!=0) {System.out.println("Integer Value :" + intValue); break;}
		while (spValue.length()!=0) {System.out.println("Special Charachter :" + spValue); break;}		
	}
}
