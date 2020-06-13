package C14;
import java.util.Scanner;
public class Perfectnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num ;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		num = scan.nextInt();
		
perfect(num);
	}
public static void perfect(int num) {


	int sum=0;
	
	for(int i=1;i<num;i++)
	{
		
		if(num%i==0)
			
		{
			sum = sum+i;
		}
			
		
	}
	
	if(num==sum)
	
		System.out.println("it is perfect number");
	else
		System.out.println("it is not perfect number");
	

}
}
