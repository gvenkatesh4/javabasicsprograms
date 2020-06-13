package Eccpractice;
import java.util.Scanner;
import java.util.*;

public class Eccpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the no");
		num = scan.nextInt();
System.out.println("prime num is"+prime(num));
	}
public static boolean prime(int num) {
	int count = 0;
	for (int i=1; i<=num;i++) 
	{
   if(num%i==0)
	count++;
			
	}
	
	if (count==2)
		return true;
	else
		return false;

}
}