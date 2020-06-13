package basics;
import java.util.Scanner;
import java.util.*;


public class multiplication {

	public static void main(String[] args) {
		int num1,num2,multi;
		
		System.out.println("Enter the number1");
		
		Scanner scan = new Scanner(System.in);
		
		num1  = scan. nextInt();
		
		System.out.println("Enter the second number2");
		 num2 = scan.nextInt();
		 
		scan.close();
		
		multi=num1*num2;
		
		System.out.println("multliplication of two numbers="+multi);
   
	}

}
