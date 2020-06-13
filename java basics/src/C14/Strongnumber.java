package C14;
import java.util.Scanner;
import java.util.*;
public class Strongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num ;
		 int rem=0;
		 int fact;
		 int sum = 0;
		 
		 Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		num = scan.nextInt();
		int temp = num;
		while(num>0)
		{    
			rem = num%10;
			fact = 1;
			for(int i=rem;i>=1;i--)
			{
			fact = fact*i;
			}
			sum = sum+fact;
			num = num/10;

		}		
		if(temp == sum)
		 System.out.println("it is strong number");
		else
			System.out.println("it is not strong number");
	

}
}