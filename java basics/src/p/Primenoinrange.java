package p;
import java.util.Scanner;
public class Primenoinrange {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the start number");
		int start = scan.nextInt();
		
		System.out.println("enter the end number");
		
		int end = scan.nextInt();

		
		for(int num = start;num<=end;num++)
		{
			int count = 0;

			for(int i = 2;i<num;i++) 
			{
				if(num%i==0) 
				{
					count++;
				}
				
			}
			
		
		if(count==0)
		{
			System.out.println(num+" ");
	    }
	}
		
		}
}
