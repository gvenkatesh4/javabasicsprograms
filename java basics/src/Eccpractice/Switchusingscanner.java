package Eccpractice;
import java.util.Scanner;
import java.util.*;

public class Switchusingscanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch,num1,num2;
		Scanner swi = new Scanner(System.in);
		System.out.println("enter the choice");
		ch = swi.nextInt();
		System.out.println("enter the number1");
		num1 = swi.nextInt();
		System.out.println("enter the number2");
		num2 = swi.nextInt();
		calc(ch,num1,num2);

	}
public static void calc(int ch,int num1,int num2) {


switch(ch) {
case 1:System.out.println("sum of tw is"+(num1+num2));
break;
case 2: System.out.println("sub of two is"+(num1-num2));
break;
case 3 :System.out.println("mul of two is"+(num1*num2));
break;
case 4:System.out.println("div of two is"+(num1/num2));
	break;
default:
	System.out.println("invalid choice\n enter correct choice");
}
}
}
