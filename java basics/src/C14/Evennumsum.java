package C14;
import java.util.Scanner;
import java.util.*;
public class Evennumsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the first number");
		num= scan.nextInt();
		System.out.println("\n"+evensum(num));

	}
public static int evensum(int num) {
	int sum =0;
	int i =1;
	System.out.println(" even number");
	while(i<=num) {
		if(i%2==0) ////(i%2!=0) for printing odd numbers
		{
			System.out.print(i+" ");
			sum  =  sum+i; ////sum+=i
		}
		i++;
	}
	return sum;
}
}
