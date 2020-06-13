package C14;
import java.util.Scanner;


public class Numberswhicharedivisibleby3and5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		num = scan.nextInt();
System.out.println("sum of numbers are"+divisiblebynumbers(num));
	}
	public static int divisiblebynumbers(int num) {
		
	int sum = 0;
		for(int i=1;i<=num;i++)
		{
			if(i%3==0||i%5==0)
			{
				System.out.println(i);
				sum = sum+i;

			}

		}
		return sum;
	}

}
