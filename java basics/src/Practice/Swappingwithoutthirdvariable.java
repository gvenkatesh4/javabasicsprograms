package Practice;
import java.util.Scanner;
public class Swappingwithoutthirdvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 50;
		System.out.println("before swapping"+a+" "+b); 
		
		
		a = a+b;
		b = a-b;
		a =a-b;
		System.out.println("After swapping"+a+" "+b);
		
		System.out.println("using third variable");
		int c = a;
		a = b;
		b = c;
		System.out.println("After swapping"+a+" "+b);

		
		
		
	}

}
