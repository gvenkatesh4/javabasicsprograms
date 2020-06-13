package C14;
import java.util.Scanner;
import java.util.*;

public class DigitsOfGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		num = scan.nextInt();
dogn(num);
	}
public static void dogn(int num) {
	
	while(num>0) {
		
		 int digit = num%10;
		 System.out.print(digit);
		 num = num/10;
	}
	
	
}
}
