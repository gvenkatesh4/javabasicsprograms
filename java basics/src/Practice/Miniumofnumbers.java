package Practice;
import java.util.Scanner;

public class Miniumofnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,num3,num4;
Scanner scan = new Scanner(System.in);
System.out.println("enter the numbers");
num1 = scan.nextInt();
num2 = scan.nextInt();
num3 = scan.nextInt();
num4 = scan.nextInt();
System.out.println(minium(num1,num2,num3,num4));

	}
public static int minium(int num1,int num2,int num3,int num4) {
	int min = num1;
	if(min>num2)
	{
		min = num2;
	}
	if(min>num3)
	{
		min = num3;
	}
	if(min>num4)
	{
		min = num4;
	}
	return min;
}
}
