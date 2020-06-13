package eight.nov;
import java.util.Scanner;
import java.util.*;

public class Avgofthreenumusingmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,num3;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number1");
		num1 = scan.nextInt();
		System.out.println("enter the number2");
		num2 = scan.nextInt();
		System.out.println("enter the number3");
		num3 = scan.nextInt();
		
		System.out.println("avg of three numbers is"+avg(num1,num2,num3));
		

	}
public static int avg(int num1,int num2,int num3) {
	int sum;
	sum = (num1+num2+num3)/3;
	return sum;
}
}
