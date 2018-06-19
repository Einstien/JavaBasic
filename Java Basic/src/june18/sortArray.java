package june18;

public class sortArray {
	
	public static void main(String [] args) {	
		sortArray a = new sortArray();
	}	
	sortArray() {		
		int array [] = {1, 3 , 9 ,2  , 8, 19 , 32};
		int arryLength = array.length;		
		for (int i=0; i<arryLength; i ++ ) {			
			for (int j=0; j<arryLength; j++) {				
				if (array [i] < array[j]) {					
					int temp = array[i];
					array [i] = array [j];
					array [j] = temp;				
				}					
			}			
		}		
		System.out.println("Acending Order");		
		for (int i=0; i<arryLength; i++) {
			System.out.print(array[i]+ " ");
		}		
		System.out.println("\nDecending Order");		
		for (int i=arryLength -1 ; i >= 0; i--) {
			System.out.print(array[i]+ " ");
		}	
	}
}
