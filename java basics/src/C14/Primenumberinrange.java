package C14;
import java.util.Scanner;
public class Primenumberinrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		num = scan.nextInt();
primerange(num);
	}
public static void primerange(int num) {
	int count=0;
	for(int i=2;i<=num;i++)
	{
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
			{
				count++;
			}
			if(count==0)
				System.out.println(i);
		}
	}
}
}
	

