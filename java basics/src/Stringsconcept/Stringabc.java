package Stringsconcept;
import java.util.Scanner;
public class Stringabc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =  new Scanner(System.in);
		System.out.println("enter the string");
		String str = scan.nextLine();
		
		String result1 = " ";
		String result2 = " ";
		String result = " ";
		
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(Character.isAlphabetic(ch)!=Character.isDigit(ch)) {
				result1 =result1+ch;
			}
			if(Character.isAlphabetic(ch)==Character.isDigit(ch)) {
				 result2=result2+ch;
				 }
			}
		
		
System.out.println(result2.trim()+result1.trim());
	}

}
