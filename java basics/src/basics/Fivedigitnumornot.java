package basics;
import java.util.Scanner;
import java.util.*;
public class Fivedigitnumornot {

	public static void main(String[] args) {
		
		int num;
		Scanner digit = new Scanner(System.in);
		System.out.println("Enter the number");
		num = digit.nextInt();
		
		if (num>9999 && num<100000)
		{
			System.out.println("It Is Five Digit Number");

	}
		else
		{
			System.out.println("It Is Not Five Digit Number");
		}
}

}