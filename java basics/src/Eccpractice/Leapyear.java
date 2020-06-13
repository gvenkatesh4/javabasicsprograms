package Eccpractice;
import java.util.Scanner;
import java.util.*;
public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the year");
		year = scan.nextInt();
		System.out.println(year(year));
	}

	public static int  year(int year) {
		if(year%4==0)
		{
			System.out.println("it is  leap year ");
			
		}
		else if (year%400==0)
		{
			System.out.println("it is centurry year");
		}
		else
		{
			System.out.println("it is not leap year");
		}
		return year;
	}
		
	
}
