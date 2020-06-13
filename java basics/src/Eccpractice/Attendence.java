package Eccpractice;
import java.util.Scanner;
import java.util.*;
public class Attendence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double total,present;
		Scanner atten = new Scanner(System.in);
		System.out.println("enter the total classes");
		total = atten.nextDouble();
		System.out.println("enter the present classes");
		present = atten.nextDouble();

	att(total,present);
	}
	public static int att(double total,double present) {
		int result;
		result = (int) ((present/total)*100);
		System.out.println("percentage is"+result);
		if(result>75) {
			System.out.println("he is allowed to sit");
		}
		else
		{
			System.out.println("he is not allowed to sit");
		}
		return result;
	}

}
