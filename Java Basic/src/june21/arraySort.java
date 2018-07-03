package june21;

public class arraySort {
	
	public static void main (String []args) {
		sortArray();
	}

	
	static void sortArray() {
		
		char a [] = {'a' , 'b' , 'c'};
		int lnth = a.length;
		
		for (int i=0; i<lnth; i ++) {
			for (int j=0; j<lnth; j++) {
				
				if (a[i] < a[j]) {
				char temp = a[i];
				a[i] = a[j];
				a[j] = a[i];
				}
			}
		}
		
		for (int j = lnth-1; j>=0; j--) {
			System.out.print(a[j] + " ");
		}
		
	}
}
