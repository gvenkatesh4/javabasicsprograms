package basics;
import java.util.Scanner;
import java.util.*;
public class MarksSystemusinfifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int marks;
Scanner scan = new Scanner(System.in);
System.out.println("Enter the marks");
marks = scan.nextInt();

if(marks>=75)
{
	System.out.println("First class marks");
}
else if(marks<=74&&marks>=60)
{
	System.out.println("Second class marks");
	
}
else if(marks<=59&&marks>=40)
{
	System.out.println("Third class marks");
	
}
else 
{
	System.out.println("Fail");
}
	}

}
