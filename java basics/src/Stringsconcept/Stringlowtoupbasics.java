package Stringsconcept;
import java.util.Scanner;


public class Stringlowtoupbasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string");
		String str = scan.nextLine();
		Vowandconcount(str);
	}
public static void Vowandconcount(String str) {
	

	System.out.println(str.toLowerCase());
	System.out.println(str.toUpperCase());
	System.out.println(str.length());
	System.out.println(str.indexOf('o'));
	System.out.println(str.charAt(5));
	System.out.println(str.substring(5));


	
	
	
	
}
}
