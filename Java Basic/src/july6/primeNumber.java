package july6;

public class primeNumber {

	public static void main(String[] args) {
		
		
		
		for (int i=0; i<=100; i++ ) {
			
			if (checkPrime(i)) {
				System.out.print(i + " ");
			}
			
		}
		
		
	}
	
	public static boolean checkPrime(int value) {		
		int n = value;		
		boolean isPrime = true;		
		if (n==0 || n==1) {
			return false;
		}		
		for (int i=2; i<=n/2; i++) {			
			if (n%i==0) {				
				isPrime = false;
				break;				
			}			
		}		
		if (isPrime) {
			return true;
		} else {
			return false;
		}		
	}
}

