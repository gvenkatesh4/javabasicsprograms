package Eccpractice;
import java.util.Scanner;
import java.util.*;

public class palindromesingivenrange{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first,end;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the first number");
		first = scan.nextInt();
		System.out.println("enter the end number");
		end = scan.nextInt();
		System.out.println(palin(first,end));
	}
public static String palin(int first,int end ) {
	int rev,digit=0;
	
	String str = "";
	for(int i = first;i<=end;i++) {
		int temp = i;
		rev = 0;
		while(temp>0)
		{
			digit = temp%10;
			rev = (rev*10)+digit;
			temp = temp/10;
			
		}
		if (rev == i)
			str = str + " " + i;
	
	}
	return Str;
	
}
}


