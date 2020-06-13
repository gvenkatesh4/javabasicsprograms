package Eccpractice;


import java.util.Scanner;
import java.util.*;

public class pri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,a,b,flag = 0,num1;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the num");
		n = scan.nextInt();
		System.out.println("enter the final nuber");
		num1 = scan.nextInt();
		for(a=n+1;a<=num1;a++)
		{
			flag = 0;
			for(b=2;b<a;b++)
			{
				if(a%b==0)
				{
					flag=1;
					break;
					
				}
			}
			if(flag==0)
			{
				System.out.println("next number is"+a);
			}
		}

	}

}
