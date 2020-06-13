package eight.nov;
import java.util.Scanner;
import java.util.*;

public class Speddconversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int distance,hours,minutes,seconds;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the distance");
		distance = scan.nextInt();
		System.out.println("enter the hours");
		hours = scan.nextInt();
		System.out.println("enter the minutes");
		minutes = scan.nextInt();
		System.out.println("seconds");
		seconds = scan.nextInt();
		int timeinseconds =(conversion(hours,minutes,seconds));
		float speed =getmeterpersecond(distance,timeinseconds);
		
		System.out.println("meter per second"+speed);
		int timeinhours=gettimeinhours(hours,minutes,seconds);
		double speedinkmph=speed*3.6;
		System.out.println("speedinkmph"+speedinkmph+timeinhours);
	/	double speedinmph = speed*2.237;
		System.out.println("Speedinmph"+speedinmph+timeinhours);
		
	
	}
public static int conversion(int hours,int minutes,int seconds) {
	
	int totalseconds= (hours*3600)+(minutes*60)+seconds;
	
	
return totalseconds;
	
}
public static float getmeterpersecond(float distance,int time) {
	float speed = distance/time;
	return speed;
	

}
public static int gettimeinhours(int hours,int minutes,int seconds) {
	int totalhours = (seconds/3600)+(minutes/60)+(seconds);
		return totalhours;
}
}



