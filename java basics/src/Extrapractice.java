import java.util.Scanner;

public class Extrapractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner  scan = new Scanner(System.in);
		System.out.println("enter the number");
		num = scan.nextInt();
		
System.out.println("cube of a number is"+cube(num));
	}
public static int cube(int num) {
	int sum = num*num*num;
	return sum;
}
}
