package Eccpractice;
import java.util.Scanner;
import java.util.*;
public class Sumofdivisibleby3and5 {
	public static void main(String[] args) {
int num;
Scanner scan = new Scanner(System.in);
System.out.println("enter the no");
num = scan.nextInt();
System.out.println("ans is"+sum(num));
}
	public static int sum(int num) {
		int sum =0 ;
		for(int i =1;i<=num;i++)
		{
			if(i%3==0||i%5==0)
			{
				sum = sum+i;
			}
		}
		
		return sum;
	}
}