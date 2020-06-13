package C14;
import java.util.Scanner;
import java.util.*;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		int cnt;
Scanner scan = new Scanner(System.in);
System.out.println("enter the year");
year = scan.nextInt();
cnt = scan.nextInt();
leapyear(year,cnt);

	}
public static void leapyear(int year,int cnt) {
	if(year%4==0&&cnt%400==0)
	{
		System.out.println("it is leap year and cnt year");
	}
	else if(year%4==0||cnt%400!=0)
	{
		System.out.println("it is leap year and not century year");
	}
	else if(year%4!=0&&cnt%400==0)
{
	System.out.println("it is not leap year .it is cnt year");
}
	else
	{
		System.out.println("it is not leap year");
	}
		
	
}
}
