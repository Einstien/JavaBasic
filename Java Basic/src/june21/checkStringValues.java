package june21;

public class checkStringValues {

	public static void main(String[] args) {
		
		checkStringValues a = new checkStringValues();
		a.checkValueFormat("asdgifhjkasfndklmasfl#$^&%^*(122344567&*^*(%$^JGHJKHKJH");

	}
	
	private void checkValueFormat(String vale) {		
		String data = vale;
		int lnth = data.length();
		String charValue = "";
		String intValue = "";
		String spValue = "";
		for (int i=0 ; i<lnth; i++) {
			char da = data.charAt(i);
			boolean ch = Character.isLetter(da);
			boolean in = Character.isDigit(da);			
			if (ch) {
				charValue = charValue + da;
				}
			else if (in) {
				intValue = intValue + da;
				}
			else {
				spValue = spValue + da;
			}		
		}
		while (intValue.length() !=0) {System.out.println("Integer Value :" + intValue); break;}
		while(charValue.length() != 0) {System.out.println("Charchter Value :" + charValue); break;}
		while (spValue.length() !=0) {System.out.println("Special Charachter Value :" + spValue); break;}
	}
}
