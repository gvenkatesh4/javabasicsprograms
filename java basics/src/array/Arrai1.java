package array;
import java.util.Scanner;
import java.util.*;

public class Arrai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,n1,n2; 
		//float avg;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		n =scan.nextInt();
		System.out.println("enter the number1");
		n1 =scan.nextInt();

		System.out.println("enter the number2");
		n2 =scan.nextInt();
int sums = arrays(n,n1,n2);

System.out.println("sum is"+sums);
//System.out.println("avg is"+avgs);
	}
public static int arrays(int n,int n1,int n2) {
	
int sum = n+n1+n2;
return sum;
}

}