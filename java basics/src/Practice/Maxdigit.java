package Practice;
import java.util.Scanner;

public class Maxdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,num3,num4;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the numbers ");
		num1= scan.nextInt();
		num2= scan.nextInt();
		num3= scan.nextInt();
		num4= scan.nextInt();
System.out.println(max(num1,num2,num3,num4));
	}
public static int max(int num1,int num2,int num3,int num4) {
	
	int max = num1;
	if(max<num2)
	{
		max = num2;
		
	}
	if(max<num3)
	{
		max = num3;
	}
	if(max<num4)
	{
		max = num4;
	}
	return max;
}
}
