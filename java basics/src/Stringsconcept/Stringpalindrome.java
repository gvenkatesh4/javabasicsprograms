package Stringsconcept;
import java.util.Scanner;
public class Stringpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string");
		String s =scan.nextLine();
		
		getpalin(s);
	}
	public static  void getpalin(String s) {
		
		String word = s;
		int l = s.length();
		String s1="";
		for(int i=l-1;i>=0;i--)
		{
			//s1 +=s.charAt(i);
			s1 = s1+s.charAt(i);
			
		}
		//System.out.println(s1);
	if(word.equals(s1))
	
			System.out.println("it is palindrome");
			else
				System.out.println("it is not palindrome");
			
		
		
			
		
}
}