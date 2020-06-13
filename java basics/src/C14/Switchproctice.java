package C14;
import java.util.Scanner;

public class Switchproctice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		int price;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the price");
		price = scan.nextInt();
		System.out.println("enter the option");
		ch = scan.nextInt();
swi(ch,price);
	}
public static void swi(int ch,int price) {
		int discout;
		int sellingprice;
	
	
	switch(ch)
	{
	case 1:
		if(price>=10000&&price<20000)
		{
			discout = price*10/100;
			sellingprice = price-discout;
			System.out.println("final amount is"+sellingprice);
		}
	case 2:
	   if(price>100000&&price<200000)
	   {
		   discout = price*95/100;
		   sellingprice = price-discout;
		   System.out.println("final amount is"+sellingprice);
	   }
	   default:
		   
		
		System.out.println("you are not eligibe for discount");
	
		   
	   }
	}
	
	

}
