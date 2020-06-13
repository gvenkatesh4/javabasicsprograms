package C14;
import java.util.Scanner;
import java.util.*;
public class SubjectCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sub1,sub2,sub3;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the subject 1 & 2 &3 marks");
		sub1 = scan.nextInt();
		sub2 = scan.nextInt();
		sub3 = scan.nextInt();
		System.out.println("percenatge is"+markscal(sub1,sub2,sub3));

	}
public static int markscal(int sub1,int sub2,int sub3) {
	int marks;
	int percentage;
	marks = (sub1+sub2+sub3);
	percentage = marks*100/300;
	if(percentage>=90)
	
		System.out.println("A grade");
		
	else if(percentage>=70&&percentage<90) 
	
		System.out.println("B grade");
	
	else if(percentage>=50&&percentage<70)
	
		System.out.println("C grade");
	
	else if(percentage<50)
	{
		System.out.println("F grade");
	}
	return percentage;
}
}
