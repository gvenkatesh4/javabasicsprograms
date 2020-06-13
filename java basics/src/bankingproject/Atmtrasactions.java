package bankingproject;
import java.util.Scanner;
public class Atmtrasactions {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double amount= 125000;
		
		while(true) 
		{
			
		case1:System.out.println(" press 1 to Withdraw amount");
		case2:System.out.println("press 2 to deposit amount");
		case3:System.out.println("press 3 to check balance");
		case4:System.out.println("press 4 to exit");
		
		int n = scan.nextInt();
		switch(n) {
		
		case 1:
			System.out.println("enter the amount to be withdraw");
			System.out.println("please enter multiples of hundereds");
			int whithdraw=scan.nextInt();
			
			if(whithdraw<amount)
			{
				amount = amount-whithdraw;
				System.out.println(amount);
			}
				else 
				{
				  System.out.println("insufficent balance ,enter the correct amount");
			     }
			break;
		case 2:
			System.out.println("enter the amount to deposit");
			int deposit = scan.nextInt();
			amount=amount+deposit;
			System.out.println(amount);
			break;
			
		case 3 :
			System.out.println("balance amount in the account"+amount);
			break;
			
		case 4:
			System.out.println("thank you");
			System.exit(0);
			}
		}
		
	}
	}

