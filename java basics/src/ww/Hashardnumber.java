package ww;

import java.util.Scanner;

public class Hashardnumber {
	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		
		int a = scan.nextInt();
		
		int num = a;
		System.out.println(num);
		int sum = 0;
		while(a>0) {
			int digit = a%10;
			sum = sum+digit;
			a = a/10;
		}
		System.out.println(sum);
		
		if(num%sum==0) {
			System.out.println("it is hashardnumber");
			
		}
		else
		{
			System.out.println("it is not hashard number");
			
		}
	}

}
