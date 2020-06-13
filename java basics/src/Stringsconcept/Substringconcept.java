package Stringsconcept;
import java.util.Scanner;
public class Substringconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string");
		String str = scan.nextLine();
		
		//System.out.println(str.substring(0,3));
		System.out.print(str.substring(0,str.length()));

	}

}
