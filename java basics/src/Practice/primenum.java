package Practice;
import java.util.Scanner;
public class primenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		num = scan.nextInt();
		prime(num);
	}
public static void prime(int num) {
	
	for(int i=1;i<=num;i++)
	{
		if(i%2!=0)
		{
			
			System.out.println(i);
		}
	}
	
}
}
		//System.out.println("it is not prime");
	//else
			//System.out.println("it is  prime");
	
	

