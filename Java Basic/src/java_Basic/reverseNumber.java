package java_Basic;

import java.util.Scanner;

public class reverseNumber {

	public static void main(String[] args) {

		int sum =0, rev =0, digit, no;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number to get reversed");
		no =s.nextInt();
		s.nextLine();
		
		while(no!=0) {
			digit = no%10;
			no = no/10;
			sum = sum+digit;
			rev= rev*10+ digit;
		}
		
		System.out.println("The Sum of the Number is " + sum);
		System.out.println("The Reverse Number is " + rev);
	}

}
