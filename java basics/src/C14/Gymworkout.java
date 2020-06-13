package C14;
import java.util.Scanner;

public class Gymworkout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int n1=1,n2=2,n3=3,n4=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number of working days ");
		n = scan.nextInt();
		
		for(int i =4;i<=n;i++)
		{			
			n4 = n1+n2+n3;
		

			n1 = n2;
			n2 = n3;
			n3 = n4;

		}
		System.out.println("on"+n+"day work out report is" +n4+"mins");

	}

}
