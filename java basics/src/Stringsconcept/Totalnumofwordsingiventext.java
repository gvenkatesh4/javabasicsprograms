package Stringsconcept;
import java.util.Scanner;
public class Totalnumofwordsingiventext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		String str = scan.nextLine();
System.out.println("total word count:"+totalwordcount(str));
	}
public static int totalwordcount(String str) {
	
	String[] word = str.split(" ");
	return word.length;
	
	}
}
