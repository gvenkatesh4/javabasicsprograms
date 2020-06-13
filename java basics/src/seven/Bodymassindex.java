package seven;
import java.util.Scanner;
import java.util.*;

public class Bodymassindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float weight,height,bmi;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the height");
		height = scan.nextFloat();
		System.out.println("enter the weight");
		weight = scan.nextFloat();
		bmi = (float)(weight)*10000/(float)(height*height);
		System.out.println("bmi is"+bmi);

	}

	private static int weight(float f) {
		// TODO Auto-generated method stub
		return 0;
	}

}
