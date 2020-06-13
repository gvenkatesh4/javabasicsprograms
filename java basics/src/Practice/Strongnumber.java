package Practice;
import java.util.Scanner;


public class Strongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		num = scan.nextInt();
		
strong(num);
	}
public static void strong(int num) {
	
	int digit;
	int rem = 0;
	int sum = 0;
	int temp = num;
	while(num>0)
	{
		rem = num%10;
		int fact = 1;

	
	for(int i=rem;i>=1;i--)
	{
		fact = fact*i;
	}
	sum = sum+fact;
	num = num/10;

	}
	if(temp==sum)
		System.out.println("it is strong number");
	else
		System.out.println("it is not strong number");
	
}
}
