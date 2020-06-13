package Practice;
import java.util.Scanner;
public class productpalin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start;
		int end;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the start number");
		start = scan.nextInt();
		System.out.println("enter the end number");
		end = scan.nextInt();
		System.out.println("countofpaln"+palin(start,end));

	}
public static int palin(int start,int end) {
	int countpalindrome=0;
	for(int i=start;i<=end;i++)
	{
		for(int j=start;j<=end;j++)
		{
			
	     int product = i*j;
	     
	     int temp = product;
	     int rev = 0;
	     int digit;
	     
	     while(temp>0)
	     {
	    	 digit=temp%10;
	    	 
	    	 rev = rev*10+digit;
	    	 temp=temp/10;
	    	 
	    	 
	     }
	     if(product==rev)
	     {
	    	 countpalindrome++;
	     }
	     
	     
	     
			
		}
	}
	return countpalindrome;
}
}
