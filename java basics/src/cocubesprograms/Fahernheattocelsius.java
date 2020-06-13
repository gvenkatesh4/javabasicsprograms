package cocubesprograms;
import java.util.Scanner;
public class Fahernheattocelsius {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the tempature in  fahrenheat");
	double temperature=scan.nextInt();
	
	float cel = scan.nextFloat();
	
	Float f = cel*(9f/5)+32;
	temperature = ((temperature-32)*5)/9;
	System.out.println(f);
	System.out.println(temperature);
}
}
