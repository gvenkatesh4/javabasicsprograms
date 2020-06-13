package Practice;
import java.util.Scanner;
public class Perfectnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		num = scan.nextInt();
perfectnumbers(num);
	}
public static void perfectnumbers(int num) {
	int i = 1;
	int sum = 0;
	int temp = num;
	while(i<num)
	{
		if(num%i==0)
		{
		   	sum = sum+i;
		}
		i++;
	}
	if(sum == temp)
	
	System.out.println("it is natural number");
	else
		System.out.println("it is not natural number");
	
}
}
