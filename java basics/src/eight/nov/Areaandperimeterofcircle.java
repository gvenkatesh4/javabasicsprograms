package eight.nov;
import java.util.Scanner;
import java.util.*;

public class Areaandperimeterofcircle {

	private static double radius;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double area = 0,r,p;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the radius");
		r = scan.nextDouble();
		
		
	
		System.out.println("area of circle"+circle(area,r));
		System.out.println("perimeter of circle"+peri(r));
		
	}
public static double circle(double area,double r) {
	float pie = (float) 3.14;

	area = pie*r*r;
	return area;
}
public static double peri(double r) {
float pie1 = (float) 3.14;

double perimeter = 2*pie1*r;
return perimeter;

}
}