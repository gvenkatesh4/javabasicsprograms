package Practice;
import java.util.Scanner;

public class Evenoddd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		num = scan.nextInt();
	even(num);	
	}
public static void even(int num) {
	
	if(num%2==0)
	
		System.out.println("it is even number");
		else
			System.out.println("it is odd number");
	
		
}
}
