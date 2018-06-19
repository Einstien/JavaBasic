package june19;

public class sortArray {
	
	public static void main(String args[]) {	
		arraySort();		
	}	
	static void arraySort() {
		int a []  =  {1, 2 , 5 ,10, 5, 9, 99, 2, 55 , 66 };
		int lnth = a.length;	
		
		for (int i= 0 ; i <lnth; i++) {
			for (int j= 0; j <lnth; j ++) {				
				if (a[i]<a[j]) {
				int temp = a[i];
				a[i] = a[j];
				a[j]= temp;
				} 
			} 
		}		 
		System.out.println("Decending Order");
		for (int i =lnth-1 ; i>=0;i--) {
			System.out.print(a[i] + " ");
		}		
	}
}
