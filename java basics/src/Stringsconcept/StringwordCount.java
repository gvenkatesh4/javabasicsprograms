package Stringsconcept;
import java.util.Scanner;

public class StringwordCount {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string");
		String str=scan.nextLine();
wordcount(str);
	}
public static void wordcount(String str) {
	
	String [] word = str.split(" ");
	System.out.println(word.length);
	}
}
