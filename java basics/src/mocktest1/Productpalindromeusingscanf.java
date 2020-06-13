package mocktest1;
import java.util.Scanner;


public class Productpalindromeusingscanf {

	public static void main(String[] args) {
		int start;
		int end;
		Scanner scan = new Scanner(System.in);
		start=scan.nextInt();
		end=scan.nextInt();
		int countpalindrome=0;
		for(int i=start;i<=end;i++)
		{
			for(int j = start;j<=end;j++)
			{
				int product = (i*j);
				
				int temp = product;
				
				int reverse=0;
				while(temp>0) {
					int value = temp%10;
					reverse=reverse*10+value;
					temp=temp/10;
					
				}
				if(product==reverse) {
					countpalindrome++;
				}
			}
		}
		System.out.println(countpalindrome);
	}

}
