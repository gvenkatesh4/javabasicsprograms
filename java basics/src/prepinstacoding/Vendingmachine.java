package prepinstacoding;
import java.util.Scanner;
public class Vendingmachine {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		n = scan.nextInt();
		int a[] = {1,2,3};
		
		for(int i =0;i<a.length;i++) {
		   //System.out.println(a[i]);
		
	
		
		if(a[i]==n) {
			System.out.println("it is found");
		break;
		}
		else {
				System.out.println("it is not found");
		}
	}
	}
}
