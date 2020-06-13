package Eccpractice;
import java.util.Scanner;
import java.util.*;

public class Factor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner fac = new Scanner(System.in);
		System.out.println("enter the number");
		num = fac.nextInt();
 System.out.println("sum of factors is"+calfac(num));
	}

	public static int calfac(int num) {
		int i,sum = 0;
		for(i=1;i<=num;i++)
		{
		    if(num%i==0)
		    {
		    	sum = sum+i;
		    	System.out.println(i);
		    }
		}    
		    return sum;
		    }
}
