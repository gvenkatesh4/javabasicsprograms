package Stringpracticeprograms;
import java.util.*;

public class Rotatethestringbasedongiveninput {
	
	    public static void main(String[] args) {
	    	System.out.println("enter the string");
	        Scanner sc=new Scanner(System.in);
	        String s=sc.nextLine();
	        int n=sc.nextInt();
	        int d=s.length()-n;
	        int l=s.length();
	        System.out.print(s.substring(d,l));
	        System.out.print(s.substring(0,d));
	    }

	

	}


