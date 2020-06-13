package Creative;
import java.util.Scanner;
public class RoundedSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int num3=scan.nextInt();

		System.out.println(roundsummethod(num1,num2,num3));
	}
public static int roundsummethod(int num1,int num2,int num3) {
	if(num1<=0||num2<=0||num3<=0)
	{
		System.out.println("it is wrong number");
	}
	num1=((num1+9)/10)*10;
	num2=((num2+9)/10)*10;
	num3=((num3+9)/10)*10;
	int sum=num1+num2+num3;
	
	System.out.println("rounded numbers is"+num1+" "+num2+" "+num3);
	//System.out.println("sum of rounded numbers is"+sum);
	return sum;
	}
}
