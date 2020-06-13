package C14;
import java.util.Scanner;
import java.util.*;
public class Switchcalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch,a,b;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the values of a & b");
		a = scan.nextInt();
		b = scan.nextInt();
		ch = scan.nextInt();
		switch(ch) {
		
		case 1: 
			System.out.println("sum of"+(a+b));
			break;
		case 2:
			System.out.println("mul of"+(a*b));
			break;
		case 3:
			System.out.println("sub of"+(a-b));
			break;
		case 4:
			System.out.println("div of"+(a/b));
			break;
			default:
				System.out.println("invalid enter correct  number");
			}
	}
		

	}


