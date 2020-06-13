package Stringsconcept;
import java.util.Scanner;

public class StringcountCha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string");
		String str = scan.nextLine();
		stringcoucha(str);

	}
public static void stringcoucha(String str) {
	int count =0;
	for(int i=0;i<str.length();i++)
	{
		count++;
	}
	System.out.println("no of chacters are"+count);
}
}
