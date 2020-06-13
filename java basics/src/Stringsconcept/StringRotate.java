package Stringsconcept;
import java.util.Scanner;
public class StringRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the string");
		System.out.println("enter the number");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int num= scan.nextInt();
		
		for(int i=num;i<str.length();i--)
		{
			System.out.println(i);
		}
	}

}
