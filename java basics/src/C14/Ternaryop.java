package C14;
import java.util.Scanner;
import java.util.*;


public class Ternaryop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the age");
		age = scan.nextInt();
		//int num1 = 3;
		//int num2 = 2;
		
		
		
		//int max = num1 >= num2 ? num1 : num2;
		String message = (age>=18)?"eligible to vote":"not eligible to vote" ;
		System.out.println(message);
		//System.out.println(max);

	}

}
