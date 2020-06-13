package Eccpractice;
import java.util.Scanner;
import java.util.*;


public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner palin = new Scanner(System.in);
		System.out.println("enter the mumber");
		num = palin.nextInt();
		System.out.println("palindrome no is"+palindrome(num));

	}
public static int palindrome(int num) {
	int rev = 0,digit = 0, temp = num;
	while(num>0) {
		digit = num%10;
		rev = rev*10+digit;
		num = num/10;
		
		
	}
	
		System.out.println("palindrome is"+rev);
		if(rev == temp) 
		{
			System.out.println("it is palinrome");
		}	
			else
			{		
				System.out.println("it is not palindrome");
			}
		return temp;
		
}
}
