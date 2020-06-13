package Stringsconcept;
import java.util.Scanner;

public class ReverseofeachwordinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string");
		String str = scan.nextLine();
		System.out.println(rev(str));
	}
public static String rev(String str) {
	
	String[]s=str.split(" ");
	String result=" ";
	for(int i=0;i<s.length;i++)
	{
		String newword=s[i];
		System.out.println(newword);
		for(int j=newword.length()-1;j>=0;j--)
		{
			result = result+newword.charAt(j)+"";
		}
		result = result+" ";
	}
	
	
	return result.trim();
}
}
