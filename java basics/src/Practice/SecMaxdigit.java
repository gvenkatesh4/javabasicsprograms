package Practice;
import java.util.Scanner;
public class SecMaxdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		num = scan.nextInt();
System.out.println(secmaxx(num));
	}
public static int secmaxx(int num) {
	int max = 0;
	int secmax = 0;
	while(num>0)
	{
		int digit = num%10;
		if(digit>max)
		{
		secmax = max;
		max = digit;

	    }
		else if(digit<max&&digit>secmax)
		
			secmax = digit;
		num = num/10;

		
	
}
	return secmax;

}
}