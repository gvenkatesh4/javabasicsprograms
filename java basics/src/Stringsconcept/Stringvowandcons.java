package Stringsconcept;
import java.util.Scanner;
public class Stringvowandcons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the string");
		String str = scan.nextLine();
		vowandcons(str);

	}
public static void vowandcons(String str) {
	String str1=str.toLowerCase();	
System.out.println(str1);
	int digitcount = 0;
	int vowelcount=0;
	int conscount=0;
	for(int i=0;i<str1.length();i++)
	{   
	char c = str.charAt(i);
		if(Character.isAlphabetic(c)) {
			
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			vowelcount++;
		else
			conscount++;
	}else if(Character.isDigit(c))
		digitcount++;
		
}
		
		
	System.out.println(vowelcount);
	System.out.println(conscount);
	System.out.println(digitcount);
	
	String result="";
	for(int i=0;i<str1.length();i++)
	{
		char c = str1.charAt(i);
		int ascii = (int)c;
		ascii++;
		result +=(char)ascii;
	}
	
}
}

