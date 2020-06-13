package C14;
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
	int temp = num;
	int rem;
	int a;
	int c =0;
	while(num>0)
	{
	rem = num%10;
	c = c+(rem*rem*rem);
	num = num/10;

	
	}
	
	if(temp==c)
	System.out.println("Amstrong number");
	else
		System.out.println("not amstrong number");
		
	
}
}
