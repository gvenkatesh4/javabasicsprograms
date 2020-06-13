package Extracoding;
import java.util.Scanner;
public class AdamNumber {

	public static void main(String[] args) {
		Scanner  scan = new Scanner(System.in);
		System.out.println("enter the number");
		
		int num = scan.nextInt();
		int value = num*num;
		System.out.println("it is first value="+value);
		int temp = num;
		int rev=0;
		int digit=0;
		
		while(num>0)
		{
			 digit = num%10;
			 rev = rev*10+digit;
			 num=num/10;
			 
			 

		}
		 rev = rev*rev;
			System.out.println("it is second value="+rev);
			int i = rev;
			int r = 0;
			int t = 0;
			while(i>0) {
				t = i%10;
				r = r*10+t;
				i = i/10;

			}				
				System.out.println("reverse of second value="+r);
		
				if(value==r)
					System.out.println("it is adam number");
				else
					System.out.println("it is not adam number");
				
	}

}
