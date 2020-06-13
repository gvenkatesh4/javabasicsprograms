 package interviewprograms;
import java.util.Arrays;
import java.util.Scanner;
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string");
		String a=scan.nextLine();
		String b=scan.nextLine();
		
		a=a.toLowerCase();
		b=b.toLowerCase();
		//a.replace(" ","");
		//b.replace(" ", "");
		
		char c[]=a.toCharArray();
		char d[]=b.toCharArray();
		
		
		Arrays.sort(c);
		Arrays.sort(d);
		
		
		Boolean result = Arrays.equals(c, d);
		if(result=true)
		System.out.println("it is anagram");
		else
			System.out.println("it is not anagram");
		

	}

}
