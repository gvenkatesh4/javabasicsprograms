package seven;
import java.util.Scanner;
import java.util.*;

public class Reverseanumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		num = scan.nextInt();
		System.out.println("reversed number is"+reverse(num));
	}
public static int reverse(int num) {
	int rem=0;
	
	int reverse = 0;
	while(num>0) {
		
		rem = num%10;
		reverse = reverse*10+rem;
		num = num/10;
	
	}


return reverse;
		
		
}
}
