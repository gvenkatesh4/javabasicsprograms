package Practice;
import java.util.Scanner;

public class Primeinrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start;
		int end;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the  start number & end numner");
		start = scan.nextInt();
		end = scan.nextInt();
	pri(start,end);	

	}
public static void pri(int start,int end) {
	for(int num = start;num<end;num++)
	{
	
	int count=0;
for(int i = 2;i<num;i++)
{
	if(num%i==0)
	{
		count++;
	}
}
	if(count==0)
		System.out.println("prime number are "+num);
		
	
}
}
}
