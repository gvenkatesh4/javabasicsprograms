package Stringsconcept;
import java.util.Scanner;
public class Quadraticroots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int num = scan.nextInt();
		if(num<=0)
		{
			System.out.println();
		}
		
		int sum = 0;
		String r="";
		for(int i=1;i<=num;i++)
		{
			sum = sum+i;
			System.out.println(sum);
			r=sum+" ";
			//System.out.print(r.substring(0,r.length()));

		}

	}

}
