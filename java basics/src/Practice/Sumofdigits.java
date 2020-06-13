package Practice;
import java.util.Scanner;
public class Sumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the digit");
		num = scan.nextInt();
sumofdigi(num);
	}
public static void sumofdigi(int num) {
	
	int reverse=0;
	int rem=0;
	while(num>0)
	{
	 rem = num%10;
	reverse = reverse*10+rem;
	num = num/10;
   }
	System.out.println("sum of digit is"+reverse);
}
}