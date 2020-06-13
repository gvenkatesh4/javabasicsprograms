package prepinstacoding;
import java.util.Scanner;
public class Currencynotecalculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the amoumt");
		int amount;
		amount = scan.nextInt();
		if(amount==2000) { 
			int count2000 = amount/2000;
		//amount = amount%2000;
		int am = 2000*count2000;
		System.out.println("collect your cash:"+am);
		
		
		}
		else if(amount==500) {
			int count500 = amount/500;
			amount = amount%500;
			int amountt =500*count500;
			//System.out.println("500 *"+count500+"="+500*count500);
			System.out.println("collect your cash="+amountt);
		}
		
		else
			System.out.println("enter amount in 2000s and 500 s ");
		}
		}	
		
		
	


