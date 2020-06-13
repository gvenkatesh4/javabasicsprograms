package Stringsconcept;
import java.util.Scanner;
public class String21nov {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string");
		String str=scan.nextLine();
		String[] word = str.split("-");
		System.out.print("- -");

		for(int i=0;i<word.length;i++)
		{
			
			System.out.print(word[i]);

		}

	}

}
