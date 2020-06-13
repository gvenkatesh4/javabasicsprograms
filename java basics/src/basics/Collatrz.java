package basics;
import java.util.Scanner;
import java.util.*;

public class Collatrz {

	   public static void main(String[] args) {
		    
		    int num = 0;
		    Scanner scan = new Scanner(System.in);
		    System.out.println("enter the number");
		    num = scan.nextInt();
		    
		    while(num != 0){
		    
		    if(num%2==0) {
		    	num = num/2;
		    System.out.println(num);
		    System.out.println();
		    }
		    else
		     {
		    	num = num*3+1;
		    	System.out.println(num);
		    	System.out.println();
		    	
		    }
		    
		    
		    
		    }
	   }}
