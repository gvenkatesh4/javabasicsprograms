package Extracoding;
import java.util.Scanner;
public class AmicablePairs {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner scan = new Scanner(System.in);
		int num=scan.nextInt();
		int sum = 0;

		for(int i=1;i<num;i++) 
		{
           if(num%i==0) 
			{
				sum = sum+i;
			}
        }
		System.out.println(sum);
		
		int value = sum;
		int s = 0;
		for(int i =1;i<sum;i++) 
		{
			if(sum%i==0)
			{
				s = s+i;
				//System.out.println(i);
			}
		}
		System.out.println(s);
		
		if(num==s)
			System.out.println("It Is AmicablePairs");
		else
			System.out.println("It  Is not AmicablePairs");
	}

}
