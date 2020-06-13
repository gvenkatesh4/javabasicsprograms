package C14;
import java.util.Scanner;
import java.util.*;

public class Agetovote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your age");
		age = scan.nextInt();
	age(age);	
	}
	public static void age(int age) {
		if(age>=18)
		{
			System.out.println("you are eligible to vote");
		}
		else
		{
			System.out.println("you are not eligible to vote");
		}
	}

}
