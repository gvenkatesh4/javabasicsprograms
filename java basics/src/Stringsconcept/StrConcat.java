package Stringsconcept;
import java.util.Scanner;

public class StrConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string1");
		String str1 = scan.nextLine();
		System.out.println("enter the string2");
		String str2 = scan.nextLine();
conacting(str1,str2);
	}
public static void conacting(String str1,String str2) {
	
	str1 = str1.concat(str2);
	System.out.println(str1);
	
	
}
}
