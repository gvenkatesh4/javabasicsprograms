package C14;
import java.util.Scanner;

public class Primediff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");

		num = scan.nextInt();
		
	}
public static int pri(int num) {
	if(num==1)
	return" 1 is not prime number";
	else if(num==2)
		return"2 is prime number";
	else
	{
		for(int i=2;i<=num;i++)
		{
			if(num%i==0)
			return num +"is not a prime number";
			}
		return num+"is a prime number";
		}
	}
}

