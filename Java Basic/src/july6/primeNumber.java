package july6;

public class primeNumber {

	public static void main(String[] args) {
	
		int m = 0, n = 20;
		
		while (m<n) {
			boolean flag = false;
			
			for(int i = 2; i <= m/2; ++i) {
				
				if(m % i == 0) {
                    flag = true;
                    break;
                }
			
			}
			
			if (!flag)
                System.out.print(m + " ");

            ++m;
			
		}
			
		}
		
	}

