package Creative;
import java.math.*;
import java.util.Scanner;
public class Decimalroundingoff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the numbers in decimal");
		float num1=scan.nextFloat();
		float num2=scan.nextFloat();
        float num3=scan.nextFloat();
decimalrounding(num1,num2,num3);

	}
public static void decimalrounding(float num1,float num2,float num3) {
System.out.println(+num1+ "after roundong"+Math.round(num1));
System.out.println(+num2+ "after roundong"+Math.round(num2));
System.out.println(+num3+ "after roundong"+Math.round(num3));


}
}
