package Eccpractice;

import java.util.Scanner;
import java.util.*;

public class Nextprimenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=15,check;
		
		for(;number>0;number++)

		{
		check= nextprime(number);
				if(check==2)
					break;
		}
		System.out.println(+number);
	}

public static int nextprime(int number) {;
int count = 0;
for(int i=1;i<=number;i++)
{
  
   while(number>0)
   {
   if(number%i==0)
   
   count++;
  
   } 
  
}

return count;
}
}