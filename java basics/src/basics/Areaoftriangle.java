package basics;
import java.util.Scanner;
import java.util.*;

public class Areaoftriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int area,height,breadth;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the height");
		height = scan.nextInt();
		System.out.println("enter the breadth");
		breadth = scan.nextInt();
		
		System.out.println("Area of triangle is"+triangle(height,breadth));
		
	

	}
public static int triangle(int height,int breadth ) {
	int area = (height*breadth)/2;
	return area;
	
}
}
