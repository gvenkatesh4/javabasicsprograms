package prepartion;
import java.util.Scanner;
public class Leapyear {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enetr the number");
		int year = scan.nextInt();
		
		if(((year%4==0)&&(year%100!=0))||(year%400==0) )
			System.out.println("it is leap year");
			else
				System.out.println("it is not leap year");
		}
		
	}


