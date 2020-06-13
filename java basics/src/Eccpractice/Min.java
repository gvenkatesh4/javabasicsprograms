package Eccpractice;
import java.util.Scanner;

import com.sun.tools.classfile.StackMap_attribute.stack_map_frame;

import java.util.*;


public class Min {

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
System.out.println("minium value is"+minofthree(num1,num2,num3));
	}
public static int minofthree(int num1, int num2, int num3) {
	int min = num1;
	if(min>num2);
	{
		min = num2;
		
	}
	
	if(min>num3);
	{
		min = num1;
	}
	return min;
	
	
}
}
