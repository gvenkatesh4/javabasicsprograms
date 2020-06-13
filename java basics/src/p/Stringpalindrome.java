package p;
import java.util.Scanner;
public class Stringpalindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string");
		String p = scan.nextLine();
		
		String word = p;
		int length = word.length();
		
		String s = "";
		for(int i = length-1;i>=0;i--) {
			s = s+p.charAt(i);
				
			
		}
		if(word.equals(s)) 
			System.out.println("it is palindrome");
			else
				System.out.println("it is not palindrome");
		}
	}

