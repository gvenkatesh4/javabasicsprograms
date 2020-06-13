package C14;
import java.util.Scanner;

public class Primenumornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		num = scan.nextInt();
		
prime(num);
	}
public static void prime(int num) {
	int count =0;
	
	for(int i = 2;i<num;i++)
	{
		if(num%i==0)
			count++;
	}
	if(count==0)
	
		System.out.println("it is    prime number");
		else
			System.out.println("it is not  prime number");
	
	
}
}