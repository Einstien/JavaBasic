package june18;



public class checkStringValues {
	
	public static void main (String [] args) {		
		String chkValue = "467578asndfn,masfnldfm21i32p-o3#%$#@%%*&^*(&*(*(" ;	
		checkValues(chkValue);
	}	

  static void checkValues(String data) {	  
	  String value = data ;
	  int lnth =value.length();
	  String intValue = " "; 
	  String charValue = " ";
	  String spValue = " ";
	  if (lnth != 0) {
		  for (int i=0; i<lnth; i++) {			  
			  char a = value.charAt(i);
			  boolean b= Character.isDigit(a);
			  boolean c = Character.isLetter(a);			  
			  if (b){				  
				  intValue = intValue +a;   
			  } else if (c) {
				  charValue = charValue + a;
			  } else {
				  spValue = spValue + a;
			  }		  
		  }
	  } else {System.out.println("No Vlaues Given");}
    while (intValue.length() != 0) {System.out.println("Integer Values :" + intValue); break;} 
    while (charValue.length()!=0) {System.out.println("Character Values :" + charValue); break;}
    while (spValue.length() != 0) {System.out.println("Special Character Values :" + spValue); break;}
  }	
}
