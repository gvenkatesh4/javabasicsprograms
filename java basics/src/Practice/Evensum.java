package Practice;
import java.util.Scanner;
public class Evensum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int num;
			Scanner scan = new Scanner(System.in);
			System.out.println("enter the number");
			num = scan.nextInt();
			sum(num);
	}
public static void sum(int num) {
	int sum=0;
	int sum1=0;
	for(int i=1;i<=num;i++)
	{
		if(i%2==0)
		{
			System.out.print("even num"+i+ " ");
			sum = sum+i;

		}
		else if(i%2!=0)
		{
			System.out.println("odd num"+i+ " ");
			sum1 = sum1+i;
		}
	}
	System.out.println("\n"+sum);
	System.out.println("\n"+sum1);
	
}
}
