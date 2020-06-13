package basics;
import java.util.Scanner;
import java.util.*;

public class Usingternaryop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num;
Scanner scan = new Scanner(System.in);
System.out.println("Enter the number");
num = scan.nextInt();

String output = (num%2==0)?"it is even":"it is odd";

System.out.println("number is:="+num+output);
	}

}
