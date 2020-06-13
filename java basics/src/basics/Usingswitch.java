package basics;
import java.util.Scanner;
import java.util.*;

public class Usingswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the required");
		month = scan.nextInt();
		System.out.println(year(month));

	}
		public static String year(int month) {
		String monthString="";
		switch(month)
		{
		case 1:monthString = "janurary";
		break;
		case 2:monthString = "feb";
		break;
		case 3:monthString = "march";
		break;
		case 4:monthString = "april";
		break;
		case 5:monthString = "may";
		break;	
		
	default: System.out.println("invalid choice\n please enter the correct choice");
	
		}
		return monthString;
		

	}

}

