package C14;
import java.util.Scanner;

public class Calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number1");
		//num1 = scan.nextInt();
		num1 = (int) scan.nextFloat();
		
		System.out.println("enter the number2");
		num2 = (int) scan.nextFloat();

		//num2 = scan.nextInt();
		
		operations(num1,num2);
	}
public static  void operations(int num1,int num2) {
	String result = "";
	

	boolean cont;
	do {
		
	
	System.out.println("menu:\n1.Addition\n2.substraction\n3.multiplication\n4.division\n5.remainder\n6.power");
	int option;
	System.out.println("enter the optiom");
	Scanner scan = new Scanner(System.in);
	option = scan.nextInt();
	
	
	switch(option) {
	
	case 1:
		result = "addition of two numbers"+num1+ "," +num2+ "= "+(num1+num2);
		break;
		
	case 2:
		result = "substraction of two numbers"+num1+ "," +num2+"="+(num1-num2);
		break;
		
		
	case 3:
		result = "multiplication of two numbers"+num1+ "," +num2+"="+(num1*num2);
		break;
		
	case 4:
		float value = (float) num1 /(float)num2;
		result = "division of two numbers"+num1+ "," +num2+"="+(value);
		break;
		
	case 5:
		result = "remainder of two numbers"+num1+ "," +num2+"="+(num1%num2);
		break;
		
	case 6:
		result = result = "Power of   two numbers" + num1 + "," + num2 + " : " + Math.pow(num1, num2);
		break;
		
	default:
		System.out.println("invalid option");
	
	}
	System.out.println(result);
	
	System.out.println("do u want to continue (true/false");
	cont = scan.nextBoolean();
	
	
	}
	while(cont == true); 
	
	}
}
