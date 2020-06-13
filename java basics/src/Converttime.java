import java.util.Scanner;

import java.util.*;

import java.util.*;
public class Converttime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hours,minutes,seconds,add;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the hours");
		hours = scan.nextInt();
		System.out.println("Enter the minutes");
		minutes = scan.nextInt();
		
		System.out.println("enter the seconds");
		seconds = scan.nextInt();
		
		System.out.println("enter the add sec");
		add = scan.nextInt();
		
time(hours,minutes,seconds,add);
	}


private static void time(int hours, int minutes, int secondes,int add) {
	int time=(hours*60)+minutes+(secondes+add)/60;
int	hours1=time/60;
int	minutes1=time-(hours1*60);
int	secondes1=(time%60)-(minutes1);
System.out.println(hours1+"hours"+minutes1+"minutes"+secondes1+"secondes");
	
	//return 0;
}
}