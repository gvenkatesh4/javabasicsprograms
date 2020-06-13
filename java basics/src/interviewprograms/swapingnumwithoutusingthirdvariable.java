package interviewprograms;
import java.util.Scanner;
import java.util.*;

 class swapingnumwithoutusingthirdvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the  numbers");
		a = scan.nextInt();
		b = scan.nextInt();

    System.out.println("before swapping numbers: "+a +" "+ b);  
    		a = a+b;
    		b = a-b;
    		a = a-b;
    System.out.println("after swapping numbers"+a+" "+b);
	
	}
 }





