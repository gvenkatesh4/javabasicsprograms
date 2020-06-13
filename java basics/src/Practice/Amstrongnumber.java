package Practice;
import java.util.Scanner;

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
	int sum =0;
	int temp = num;
	while(num>0)
	{
		int rem = num%10;
		sum = sum+rem*rem*rem;
		num = num/10;

	}
    if(temp==sum)
    
    	System.out.println("it is amstrong number");
    	else
    		System.out.println("it is  not amstrong number");
    
}
}
