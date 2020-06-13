package Practice;
import java.util.Scanner;
public class Palindromewithinspecificrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start;
		int end;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the start number");
		start = scan.nextInt();
		System.out.println("enter the end number");
		end = scan.nextInt();
		palin(start,end);
	}
public static void palin(int start,int end) {
	for(int i = start;i<=end;i++)
	{
		
		int num = i;
		int rev =0;
		int digit = 0;
		while(num>0)
		{
			digit=num%10;
			rev= rev*10+digit;
			num = num/10;
		}
		if(rev==i) {
			System.out.println(i);
		}
		
		
		
	}
	
	
	
	
}
}
