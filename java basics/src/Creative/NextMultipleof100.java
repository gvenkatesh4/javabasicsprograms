package Creative;
import java.util.Scanner;

public class NextMultipleof100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		num = scan.nextInt();
		System.out.println("next of multipleno of "+multiple(num));
	}
public static int multiple(int num) {

	
	
	num=((num/100)+1) * 100;
	return num ;
}
}
