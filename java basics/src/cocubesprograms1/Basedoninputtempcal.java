package cocubesprograms1;

import java.util.Scanner;

public class Basedoninputtempcal {

	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the temp ");
		float temp = scan.nextFloat();
		
		
		//System.out.println("enter the temp in celsius");
		//float cel = scan.nextFloat();
		
		System.out.println("enter the input 1 for fahernheat and 0 for celsius");
		int ha = scan.nextInt();
		
		switch(ha) {
		
		
		case 0:
			float celsius = ((temp-32)*5)/9;
			System.out.println("celsius temp"+celsius);
			break;
		case 1:
			float fahern = temp *(9f/5)+32;
			System.out.println("fahern heat"+fahern);
			break;
		default:
			System.out.println("please enter correct input");
		
		}
	}
	
}
