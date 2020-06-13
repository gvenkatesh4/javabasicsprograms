package Eccpractice;
import java.util.Scanner;
import java.util.*;

public class Discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the price");
		price = scan.nextInt();
		double discount=discount(price);
		System.out.println("discount price"+discount);
	}
public static double discount(int price) {
	int discount = 0,sellingprice;
	if(price>0&&price<10000)
	{
		discount = (price*10)/100;
		sellingprice = price-discount;
	}
	else if(price>10000&&price<20000)
	{
		discount = (price*20)/100;
		sellingprice = price-discount;
	}
	else if(price>20000&&price<50000)
		
	{
		discount = (price*30)/100;
	}	sellingprice = price-discount;
	

		System.out.println("you are elligible for discount");
	
	return discount;
	
}
}
