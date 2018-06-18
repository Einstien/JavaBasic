package java_Basic;


public class sortArray {

	
	public static void main (String [] args) {
		int [] a = {2,5,8,10,78, 98, 56, 0 , 98};		
		int aryLength = a.length;
		
		for (int i=0; i<aryLength; i++ ) {
			for (int j=0; j<aryLength; j++ ) {				
				if (a[i] < a[j]) {					
					int temp = a[i];
					a[i] = a[j];
					a[j] =temp;
				}
			}
		}
		System.out.println("Accending Order\n");
		for (int i =0; i<aryLength; i ++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.println("\n\nDecending Order\n");
		for (int i =aryLength-1; i>=0; i --) {
			System.out.print(a[i] + " ");
		}
	}

}