package C14;
import java.util.Scanner;
import java.util.*;

public class Greatestofthreenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,num3;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the numbers");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
System.out.println("greatest of numbers"+grtofthree(num1,num2,num3));
	}
public static int grtofthree(int num1,int num2,int num3){
int max=num1;
	if(max<num2)
	{
		max=num2;
	}
	if(max<num3)
	{
		max = num3;
	}
	return max;
}
}
