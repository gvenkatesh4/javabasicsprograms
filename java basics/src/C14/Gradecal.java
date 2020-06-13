package C14;
import java.util.Scanner;



import java.util.*;
public class Gradecal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the marks");
		marks = scan.nextInt();
		
	grade(marks);	
	}
public static void grade(int marks) {
	if(marks>=90)
	{
		System.out.println("A grade");
	}
	else if(marks>=70&&marks<90)
	{
		System.out.println("B grade");
	}
	else if(marks>=60&&marks<70)
	{
		System.out.println("C grade");
	}
	else if(marks>=40&&marks<60)
	{
		System.out.println("D Grade");
	}
	else
	{
		System.out.println("fail");
	}
	
		
		
}
}
