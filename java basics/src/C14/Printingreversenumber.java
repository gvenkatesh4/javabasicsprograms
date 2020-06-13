package C14;
import java.util.Scanner;
import java.util.*;

public class Printingreversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
	int num;
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the number");
	num = scan.nextInt();
	System.out.println("given nuber is="+num);
	prn(num);
	}
public static void prn(int num) {
	int reverse=0;
	while(num>0)
	{
		int digit = num%10;
		reverse = reverse*10+digit; 
		num = num/10;
		
	}
	System.out.println("reverse is="+reverse);
}
}
