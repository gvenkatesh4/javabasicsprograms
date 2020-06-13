package Creative;
import java.util.Scanner;
public class Happynumber11 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method st
		int num;
		int sum=0;
		int digit = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the number");
		num=scan.nextInt();
		while(num>0)
		{
			int rem =num%10;
			digit=sum+rem*rem;
		 num=num/10;
			
		}
		System.out.println(digit);

	}

}
