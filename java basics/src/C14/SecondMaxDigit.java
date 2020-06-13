package C14;
import java.util.Scanner;

public class SecondMaxDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		num = scan.nextInt();
		
System.out.println("second max digit is"+secmax(num));
	}
public static int secmax(int num) {
	int secondmax = 0;
	int max = 0;
	while(num>0) {
		int digit = num%10;
		if(digit>max) {
		secondmax= max;
		max = digit;
	                  }
	else if(digit < max && digit > secondmax)
	secondmax = digit;
	num = num/10;
	
		
		
		
	}
	System.out.println("max digit"+max);
	return secondmax;
}

}