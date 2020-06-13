package C14;
import java.util.Scanner;
import java.util.*;

public class Gcdoftwonumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		int gcd = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number1");
		num1 = scan.nextInt();
		System.out.println("enter the number");
		num2 = scan.nextInt();
	System.out.println(gcdfinding(num1,num2,gcd));
		 
	}
public static int gcdfinding(int num1,int num2, int gcd) {
	int lcm;
	for(int i=1;i<num1&&i<num2;i++)
	{
		if( num1%i==0 && num2%i ==0)
		
		
		gcd=i;
		
		
	}
	lcm = (num1*num2)/gcd;
	System.out.println("lcm is"+lcm);
	return gcd;
}
}
