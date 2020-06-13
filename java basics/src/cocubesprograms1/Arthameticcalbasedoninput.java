package cocubesprograms1;

import java.util.Scanner;

public class Arthameticcalbasedoninput {
 public static void main(String[] args) {
	
	 
	 
	 Scanner scan = new Scanner(System.in);
	 System.out.println("enter the number1");
	 int n1 = scan.nextInt();
	 System.out.println("enter the number2");
	 int n2 = scan.nextInt();
	 
	 
	 System.out.println("enter the operation you want to perform");
	 System.out.println("choose 1 for addition");
	 System.out.println("choose 2 for substraction");
	 System.out.println("choose 3 for division");
	 System.out.println("choose 4 for multiplication");
	 
	 int ha = scan.nextInt();
	 
	 switch(ha) {
	 
	 case 1:
		 int add = n1+n2;
		 System.out.println(add);
		 break;
	 case 2:
		 int sub = n1-n2;
		 System.out.println(sub);
		 break;
	 case 3:
		 int div = n1/n2;
		 System.out.println(div);
		 break;
	 case 4:
		 int mul = n1*n2;
		 System.out.println(mul);
		 break;
	default:
		System.out.println("enter the correct option");
	 }

	 
 }
	
}
