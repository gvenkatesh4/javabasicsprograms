package C14;
import java.util.Scanner;

public class Fibanoociseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan = new  Scanner(System.in);
		System.out.println("enter the number");
		num = scan.nextInt();
		fibo(num);
	}
public static void fibo(int num) {
	int a=0;
	int b =1;
	int c;
	for(int i=0;i<num;i++)
	{
		
       
		c = (a+b);
		//System.out.println(c);
	

		a=b;
		b=c;
System.out.println(a);
		
	}
}
}
