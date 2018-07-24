package july24;

public class primeNumber {
	
	public static void main (String args[]) {		
		
		for (int i=5 ; i<90; i++) {
			
			if (checkPrime(i)) {
				
				System.out.print(i + " ");
				
			}
		}
		
	}		
	
	static boolean checkPrime(int valu) {		
		int n = valu;
		boolean isPrime = true;	
		if (n==0 || n==1) {
			return false;
		}	else {
		 
		for (int i=2; i<n/2; i++ ) {			
			if (n%i==0) {				
				isPrime = false;
				break;
			}			
		}	
		}	
		if (isPrime) {
			return true;				
		} else {
			return false;
		}		
	}
}
