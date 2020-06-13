package C14;
import java.util.Scanner;
import java.util.*;
public class Perfectnumbersingivenrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start,end;
		int sum=0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the start number");
		start = scan.nextInt();
		
		System.out.println("enter the end number");
		end = scan.nextInt();
for(int i=start;i<=end;i++)
	{
		for(int j=1;j<i;j++)
		{
		sum = sum+j;
		}
		
	}
	if (sum==start)
	
		System.out.println(sum);
	
	
}
}
