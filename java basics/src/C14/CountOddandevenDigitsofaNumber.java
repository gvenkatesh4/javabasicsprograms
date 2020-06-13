package C14;
import java.util.Scanner;
import java.util.*;

public class CountOddandevenDigitsofaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		num = scan.nextInt();
		evenandoddcount(num);
	}
public static void evenandoddcount(int num) {
	int  oddcount = 0;
	int  digit;
	int evencount = 0;
	while(num>0)
	{
		digit = num%10;
		if(digit%2==0) //digit%2==1
		evencount++;
		else
	oddcount++;
		num = num/10;
		
	}
	System.out.println("oddnumbers are"+oddcount);
	System.out.println("even numbers are"+evencount);

}
}
