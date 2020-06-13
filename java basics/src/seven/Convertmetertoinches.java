package seven;
import java.util.Scanner;
import java.util.*;

public class Convertmetertoinches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float inches;
		double meters;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter inches");
		inches = scan.nextFloat();
		
		
		meters = (float)inches*0.0254;
		System.out.println("inches is"+meters);
		

	}

}
