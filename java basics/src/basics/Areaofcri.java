package basics;
import java.util.Scanner;
import java.util.*;


public class Areaofcri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float area,pie = (float) 3.14,r;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the radius");
		r = scan.nextFloat();
		
System.out.println("Area of circle is"+cri(pie,r));
	}
public static float cri(float pie ,float r) {
	float area = pie*r*r;
	return (float) area;
	
}
}
