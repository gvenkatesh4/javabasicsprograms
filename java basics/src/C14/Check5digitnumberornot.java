package C14;
import java.util.Scanner;
import java.util.*;

public class Check5digitnumberornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		num = scan.nextInt();
		checkingdigit(num);

	}
public static void checkingdigit(int num) {
	
	
		if(num>9999&&num<=99999)
		{
			System.out.println("it is five digit number");
		}
		else
		{
			System.out.println("it is not five digit number");
		}
}
}
