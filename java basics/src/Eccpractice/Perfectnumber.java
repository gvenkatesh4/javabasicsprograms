package Eccpractice;
import java.util.Scanner;
import java.util.*;


public class Perfectnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner perfect = new Scanner(System.in);
		System.out.println("enter the number");
		num = perfect.nextInt();
	per(num);	

	}
public static void per(int num) {
	int sum = 0;
	for (int i=1; i<=num;i++)
	{
		if(num%i==0)
		{
			sum = sum+i;
		}
	}
		if(sum==num)
		{
			System.out.println("it is perfect number");
			
		}
		else
		{
			System.out.println("it is not perfect no");
		}
	
	
	
}
}
