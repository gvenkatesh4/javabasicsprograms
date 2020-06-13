package Stringsconcept;

import java.util.Scanner;

public class Stringsubstring11 {

	public static void main(String[] args) {
		System.out.println("enter the string");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		spliting(str);
		
	}
private static void spliting(String str) {
	String[] s = str.split("a");
	for(int i=0;i<s.length;i++) {
		System.out.println(s[i]);
	}
}

}