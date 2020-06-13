package seven;

import java.util.Scanner;

public class Conmintoyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int minutes;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the minutes");
		minutes = scan.nextInt();
		
		long years = minutes/(365*24*60);
		int rem = minutes%(365*24*60);
		 long days = rem/(24*60);
		 
		int rem2 = rem%(24*60);
		long hours = rem2/60;
		 int rem3 = rem2%60;
		 long minut = rem3%60;
		 long rem4 = minut/60;
		 
		 System.out.println("years: "+years);
		 System.out.println("days:"+days);
		 System.out.println("hours"+hours);
		 System.out.println("minutes"+minut);
		 System.out.println("seconds"+rem4);
		// System.out.println("seconds"+);
		
		
	
		
	}

}
