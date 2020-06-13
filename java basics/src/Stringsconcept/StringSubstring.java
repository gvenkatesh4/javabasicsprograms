package Stringsconcept;
import java.util.Scanner;
public class StringSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string");
		String str = scan.nextLine();
subst(str);
	}
public static void subst(String str) {
	
	   System.out.println(str.substring(2,4)); 


}
}
