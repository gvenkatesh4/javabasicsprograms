package Practice;
import java.util.Scanner;
public class Primenumcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		num = scan.nextInt();
		int count = 0;
		
	for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
				
		}
if(count==2)

	System.out.println("it is prime number");
	else
		System.out.println("it is not prime");

	}

}
