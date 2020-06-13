package Creative;
import java.util.Scanner;

public class Happynumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int n = scan.nextInt();
		
		



	int r;
	int s;
	
	while(n>9)
	{
		 s =0;

	while(n!=0)
	{
		r = n%10;
		s = s+(r*r);
		n = n/10;
		n=s;
	}
	if(n==1)
	System.out.println("yes");
	else
		System.out.println("no");
}
}
}