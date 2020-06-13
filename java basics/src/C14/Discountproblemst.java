package C14;
import java.util.Scanner;
import java.util.*;
public class Discountproblemst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float price;
		float sellingprice = 0;
		float discount=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the price");
		price = scan.nextFloat();
		System.out.println("final amount is"+dis(price,sellingprice,discount));
	}
public static float dis(float price,float sellingprice,float discount) {
	
	if(price>=0&&price<=10000)
	{
		discount = (price*10)/100;
		sellingprice = price-discount; 
		System.out.println("discount is"+discount);
		
	}
	else if(price>10000&&price<=20000)
	{
		discount = (price*20)/100;
		sellingprice = price-discount;
		System.out.println("discount is"+discount);
	}
	else if(price>20000)
	{
		discount = (price*25)/100;
		sellingprice = price-discount;
		System.out.println("discount is"+discount);
	}
	
		
	return sellingprice;
}
}
