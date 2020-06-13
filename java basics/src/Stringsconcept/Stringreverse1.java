package Stringsconcept;
import java.util.Scanner;
public class Stringreverse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string");
		String str=scan.nextLine();
stringrev(str);
	}
public static void stringrev(String s) {
	String word = s;
	int l= s.length();
	String sum="";
	for(int i=l-1;i>=0;i--)
	{
		sum=sum+s.charAt(i);
	}
	if(word.equals(sum))
		System.out.println("it is palindrome:"+word+"\n"+sum);
	else
		System.out.println("it is not palindrome:"+word+sum);
	
	
}
}
