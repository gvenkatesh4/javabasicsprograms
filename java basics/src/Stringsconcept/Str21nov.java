package Stringsconcept;
import java.util.Scanner;
public class Str21nov {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string");
		String str = scan.nextLine();
		
	System.out.println("chat conversion"+conversion(str));
	}
public static String conversion(String str) {
	
	 String r="";
	
	for(int i=0;i<str.length();i++)
	{
			char ch=str.charAt(i);
			if(Character.isLowerCase(ch))
				r+=Character.toUpperCase(ch);
			else
				r+=Character.toLowerCase(ch);
	
	}
	
return r;	
}
}