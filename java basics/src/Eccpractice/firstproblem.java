package Eccpractice;
import java.util.Scanner;
import java.util.*;

public class firstproblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,num1,num2,num3,sum;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		number = scan.nextInt();
		
		
	

	num1 = number/100;
	num2 = ((number/100)%10);
	num3 = number%10;
	sum = num1+num2+num3;
			System.out.println("sum of digits is"+sum);
			
}
}
