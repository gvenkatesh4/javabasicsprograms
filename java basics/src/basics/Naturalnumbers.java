package basics;

import java.util.Scanner;
import java.util.*;

public class Naturalnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		num = scan.nextInt();
System.out.println("natural number is"+nat(num));
	}
public static int nat(int num) {
	int i,sum = 0;
	for(i=1;i<=num;i++)
	{
		sum =sum+i;
	}
	return sum;
    }
}
