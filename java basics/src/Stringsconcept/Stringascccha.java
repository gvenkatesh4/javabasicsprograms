package Stringsconcept;
import java.util.Scanner;

public class Stringascccha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string");
		String str= scan.nextLine();
		askey(str);
	}
public static void askey(String str) {
	
	for(int i=0;i<str.length();i++)
	{
		System.out.print((char)(str.charAt(i)+1));
		
		
	}

	}
	
}

