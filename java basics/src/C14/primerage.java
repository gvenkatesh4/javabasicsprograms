package C14;
import java.util.Scanner;
public class primerage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start,limit;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the start and end limit");
		start = scan.nextInt();
		limit = scan.nextInt();
		prime(start,limit);
	}
public static void prime(int start,int limit) {
	
	for(int num = start;num<=limit;num++)
	{
		
	
	int count=0;
	for(int i =2;i<num;i++)
	{
		if(num%i==0)
		{
			count++;
		}
	}
	if(count==0) {
		System.out.print(num + " ");
	}
}

 
}
}