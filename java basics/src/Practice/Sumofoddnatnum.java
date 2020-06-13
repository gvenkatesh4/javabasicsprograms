package Practice;
import java.util.Scanner;
public class Sumofoddnatnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		num = scan.nextInt();
System.out.println("odd numbers sum ="+oddnumsum(num));
	}
public static int oddnumsum(int num) {
	int sum = 0;
	int i=1;
	while(i<=num)
	{
		if(i%2!=0)
		{
			//sum = sum+i;
			System.out.print(i+" ");
			
		}i++;
	}
	return sum;
}
}
