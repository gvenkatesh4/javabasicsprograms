package eight.nov;
import java.util.Scanner;
import java.util.*;
public class Add1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number1");
		num1 = scan.nextInt();
		System.out.println("enter the number2");
		num2 = scan.nextInt();
		int add = getsum(num1,num2);
		int sub = getsum1(num1,num2);
		int mul = getsum2(num1,num2);
		double div = getsum3(num1,num2);
		System.out.println("add is"+add);
		System.out.println("sub is"+sub);
		System.out.println("mul is"+mul);
		System.out.println("div is"+div);
		System.out.println("sum  is"+getsum(num1,num2));

	}
public static int getsum(int num1,int num2) {
	int add = num1+num2;
	return add;
	
}
public static int getsum1(int num1,int num2) {
	int sub = num1-num2;
	return sub;
	
}
public static int getsum2(int num1,int num2) {
	int mul = num1*num2;
	return mul;
}
public static double getsum3(int num1,int num2) {
	double div = (double)num1/(double)num2;
	return div;
}
}