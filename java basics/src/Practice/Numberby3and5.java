 package Practice;
import java.util.Scanner;
public class Numberby3and5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		num = scan.nextInt();
		divisible(num);
	}
public static void divisible(int num) {
	int sum = 0;
	for(int i=1;i<=num;i++)
	{
		if(i%3==0||i%5==0)
		{
			sum = sum+i;
			System.out.println(i);

		}
	}
	System.out.println(sum);
}
}
