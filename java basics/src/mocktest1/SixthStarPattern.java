package mocktest1;
import java.util.Scanner;
import java.util.*;


public class SixthStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int no;
		//int spaces  no;
		System.out.println("Enter the number");

		Scanner scan = new Scanner(System.in);
		
		int no = scan.nextInt();
		//char c = '*';
		//nt spaces = no;
		 //System.out.println("Enter the number");
		 //j = scan.nextInt();
                 for(int i = 1; i<=4;i++)
                 {
                	 for(int j = 1;j<=i;j++)
                	 {
                		 System.out.println("*");
                	 }
                	 System.out.println();
                 }
		 
	      for(int i=1;i<=4;i++)
	    		  {
	    	  for(int j=3;j>=i;j--)
	    	  {
	    		  System.out.println("*");
	    	  }
	    	 System.out.println();
	    	  
	    		  }
	}
}