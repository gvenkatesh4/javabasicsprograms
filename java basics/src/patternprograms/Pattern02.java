package patternprograms;
import java.util.Scanner;
import java.util.*;

public class Pattern02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number of rows");
		rows = scan.nextInt();
		for(int i =rows;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+ " ");
			}
			System.out.println();
		}

	}

}
