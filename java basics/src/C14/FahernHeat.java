package C14;
import java.util.Scanner;
import java.util.*;

public class FahernHeat {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float fahern,celsius;
		int ch;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the fahern heat & celsius");
		fahern = scan.nextFloat();
		celsius = scan.nextFloat();
		
		ch = scan.nextInt();
heatcon(fahern,celsius,ch);
	}
public static void heatcon(float fahern,float celsius,int ch) {
	
	
	switch(ch) {
	case 0:
		celsius = (float) ((fahern-32)/1.8);
		System.out.println("convert fahern heat to celsius"+celsius);
		break;
	
		case 1:
			fahern = (float) ((celsius*1.8)+32);
			System.out.println("convert celsius to fahern heat"+fahern);
			break;
		
			
		

	}
	
	
	 
	
}
}
