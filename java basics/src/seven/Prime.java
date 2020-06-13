package seven;
import java.util.Scanner;
import java.util.*;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,i=2;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		num = scan.nextInt();
if(num%i!=0) {
	System.out.println("it is prime no");
}
else
{
	System.out.println("it is not prime no");
}
	}

}
