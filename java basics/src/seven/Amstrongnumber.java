package seven;
import java.util.Scanner;
import java.util.*;

public class Amstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
	
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		num = scan.nextInt();
		
		ams(num);

	}
public static void ams(int num) {
	int temp;
	int c=0;
	int a;
	temp = num;
	 while(num>0)
	{
   a = num%10;
	num = num/10;

		c = c+(a*a*a);
	}

	if(temp==c)
	
		System.out.println("it is amstrong number");
		else
			System.out.println("it is not amstrong number");
	
}
}
