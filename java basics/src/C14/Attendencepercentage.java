package C14;
import java.util.Scanner;
import java.util.*;
public class Attendencepercentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float total,present;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the total classes and attented classes");
		total = scan.nextInt();
		present = scan.nextInt();
System.out.println("attendence percentage is"+att(total,present));
	}
public static float att(float total,float present) {
	float result = (present*100/total);
	//System.out.println("percentage is"+result);
	if(result>=75)
	{
		System.out.println("he is allowed to sit");
	}
	else 
	{
		System.out.println("he is not allowed to sit");
	}
	return result;
	
}
}
