package basics;
import java.util.Scanner;

import java.util.*;


public class evenoroddusindmethodandscan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		 int num2 = scan.nextInt();
		 
chekeven(num2);		

	}

	

	private static void chekeven( int num1) {
		
		
		if (num1%2 == 0 )
			System.out.println("It is even number");
		else
			System.out.println("It is odd number");
		
	}
}
			
		


