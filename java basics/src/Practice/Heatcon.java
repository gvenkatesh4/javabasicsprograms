package Practice;
import java.util.Scanner;

public class Heatcon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float fahern,celsius;
		int ch;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the fahernheat and celsius");
		fahern = scan.nextFloat();
		celsius = scan.nextFloat();
		ch = scan.nextInt();
		heatconversion(fahern,celsius,ch);
	}
public static void heatconversion(float fahern,float celsius,int ch) {
	
	switch(ch) {
	
	case 1:
		
		celsius = (float) ((fahern-32)/1.8);
		System.out.println("fahern heat to celsius"+celsius);
		
	case 2:
		fahern = (float) ((celsius*1.8)+32);
		System.out.println("celsius to fahern heat"+fahern);
	
	
	}
	
	
}
}
