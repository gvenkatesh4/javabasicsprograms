package C14;
import java.util.Scanner;
import java.util.*;



public class Factorial{
	
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int num;
			Scanner scan = new Scanner(System.in);
			System.out.println("enter the number");
			num = scan.nextInt();
			
	System.out.println("factorial is"+factorial(num));
		}
	public static int factorial(int num) {
		int i,fact = 1;
		for(i = 1;i<=num;i++)
		{
		fact = fact*i;
		}
		return fact;
		
				
				
				
		
	}
	}


