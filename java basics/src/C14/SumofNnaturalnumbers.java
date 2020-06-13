package C14;
import java.util.Scanner;


public class SumofNnaturalnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		num = scan.nextInt();
		natnumbers(num);
	}
public static void natnumbers(int num) {
	int sum = 0;
	for(int i=1;i<=num;i++)
	{
		sum = sum+i;
	}
		System.out.print("sum of natural numbers"+sum);
	
	
}
}
