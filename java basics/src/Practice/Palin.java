package Practice;
import java.util.Scanner;


public class Palin {

	public static void main(String[] args) {
		int num;
		int limit=500;
		for(int i=100;i<=limit;i++)
		{
			int n =i;
			int reverse=0;
			int digit = 0;
			while(n>0)
			{
				digit = n%10;
				 reverse = reverse*10+digit;
				  n = n/10;
				
			}
			if(reverse==i) {
			System.out.println(i);
			}
			reverse = 0;
		}

	}

}
