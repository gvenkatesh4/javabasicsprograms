package Practice;
import java.util.Scanner;
public class Sumoffiba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		num = scan.nextInt();
		
		int a = 0;
		int b = 1;
		int c;
		int s=0;
		for(int i=1;i<=num;i++)
		{
			
			c=a+b;
			System.out.println(c);
			 a=b;
			 b=c;
			 s= s+c;
		}
		System.out.println(s);
	}

}
