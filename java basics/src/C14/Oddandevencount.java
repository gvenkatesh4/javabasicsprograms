package C14;
import java.util.Scanner;
public class Oddandevencount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		num = scan.nextInt();
		oddandeven(num);
	}
public static void oddandeven(int num) {
	int oddcount = 0;
	int evencount = 0;
	int count = 0;
	int digit;
	while(num>0)
	{
		digit = num%10;
		if(digit%2==0)
		evencount++;
		else

			oddcount++;
			num = num/10;
		}
		System.out.println("even count"+evencount);
		System.out.println("odd count"+oddcount);
	}
	
}

