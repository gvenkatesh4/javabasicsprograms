package Practice;
import java.util.Scanner;

public class Palindromenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		num = scan.nextInt();
palin(num);
	}
public static void palin(int num) {

int temp = num;
	int reverse = 0;
	int digit = 0;
		while(num>0)
	{
		digit = num%10;
		reverse = reverse*10+digit;
		num = num/10;
	}
		System.out.println(reverse);
	if(reverse == temp) 
		System.out.println("it is palindrome");
	else
			System.out.println("it is not palindrome");
		
	}
		
}
