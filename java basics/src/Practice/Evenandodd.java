package Practice;
import java.util.Scanner;
public class Evenandodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		num = scan.nextInt();
		
		evenodd(num);
	}
public static void evenodd(int num) {
	int oddcount=0;
	int evencount=0;
	while(num>0)
	{
	  int digit = num%10;
	if(num%2==0)
	evencount++;
	else
		oddcount++;
  num = num/10;
	}
	System.out.println("even numbers"+evencount);
	System.out.println("oddnumbers"+oddcount);
}
}