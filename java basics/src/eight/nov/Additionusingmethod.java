package eight.nov;
import java.util.Scanner;
import java.util.*;

public class Additionusingmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		num1 = scan.nextInt();
		System.out.println("enter the number2");
		num2 = scan.nextInt();
int sum = getsum(num1,num2);
System.out.println("sum = "+sum);
	}
public static int getsum(int num1, int num2) {
	int sum = num1+num2;
	return sum;
}

}