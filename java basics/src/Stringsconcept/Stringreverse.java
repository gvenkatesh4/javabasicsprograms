package Stringsconcept;
import java.util.Scanner;
public class Stringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the string");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println(getreverse(str));
		
	}
public static String getreverse(String s) {
	int l = s.length();
	String s1="";
	for(int i=l-1;i>=0;i--)
	{
		s1 +=s.charAt(i);
	}
	return s1;
}
}
