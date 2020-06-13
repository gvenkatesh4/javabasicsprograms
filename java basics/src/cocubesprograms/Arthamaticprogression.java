package cocubesprograms;
import java.util.Scanner;
public class Arthamaticprogression {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double numberofterms;
		numberofterms = scan.nextDouble();
		double firstterm;
		firstterm = scan.nextDouble();
		int commondifference;
		commondifference = scan.nextInt();
		
double sum = numberofterms*(2*firstterm+(numberofterms-1)*commondifference)/2;

for(int i=0;i<numberofterms;i++) {
	double term = firstterm+i*commondifference;
	System.out.println(term);

}

System.out.println(sum);
		
		
	}

}
