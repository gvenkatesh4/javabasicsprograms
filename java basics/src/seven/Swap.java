package seven;
import java.util.Scanner;
import java.util.*;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,temp;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number1");
		num1 = scan.nextInt();
		System.out.println("enter the number");
		num2 = scan.nextInt();
		System.out.println("before swaping");
		System.out.println("n1 :"+num1);
		System.out.println("n2 :"+num2);
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("after swapping");
		System.out.println("n1 :"+num1);
		System.out.println("n2 :"+num2);
		
		
	}

}
