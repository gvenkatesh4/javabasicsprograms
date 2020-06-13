package findingyear;
import java.util.Scanner;
import java.util.*;
public class Leapornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		System.out.println("Enter the num");
		Scanner scan = new Scanner(System.in);
year = scan.nextInt();
if (year!=0)
{
if(year % 400 == 0)

	System.out.println("it is leap year");
else if(year % 100 == 0)
	System.out.println("it is not a leap year");
else if(year % 4 == 0)
	System.out.println("It is a leap year");
else
	System.out.println("it is not leap year");


}
else 
{
	System.out.println("YEAR does not exist");
}
}
}