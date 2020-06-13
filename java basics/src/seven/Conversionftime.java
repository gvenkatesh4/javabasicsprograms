package seven;
import java.util.Scanner;
import java.util.*;


public class Conversionftime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hours,minutes,seconds,extraseconds,totalseconds;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the hours");
		hours = scan.nextInt();
		System.out.println("enter the minutes");
		minutes = scan.nextInt();
		System.out.println("enter the seconds");
		seconds = scan.nextInt();
		System.out.println("enter the extra seconds");
		extraseconds = scan.nextInt();

		totalseconds= (hours*3600)+(minutes*60)+seconds+extraseconds;
	 hours = (totalseconds)/3600;
	int rem = (totalseconds%3600);
	 int minutes1 = (rem/60);
	 int remainder = (minutes1/60);
	 
	 seconds = remainder;
	 
	 System.out.println(totalseconds);
		System.out.println(+hours+"hours\t"+minutes1+"minutes\t"+seconds+"seconds);");
		
		
		
		
		
	}

}
