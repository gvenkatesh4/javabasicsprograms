package Practice;
import java.util.Scanner;

public class Gcdandlcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		int gcd=1;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number1");
		num1 = scan.nextInt();
		System.out.println("enter the number2");
		num2 = scan.nextInt();
		
		System.out.println("gcd of two numbers is"+gcd(num1,num2,gcd));
		//System.out.println("lcm of two numbers is"+lcm(num1,num2,gcd));

	}
public static int gcd(int num1,int num2,int gcd) {
	
	for(int i=1;i<num1&&i<num2;i++)
	{
		if(num1%i==0&&num2%i==0)
		{
			gcd=i;
		}
	
	
}

	int lcm = (num1*num2)/gcd;
	System.out.println("lcm is"+lcm);
	return gcd;

}
}
