package patternprograms;
import java.util.Scanner;
public class Printingnuminpatters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the nuber of rows");
		rows = scan.nextInt();
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+ " ");
				//System.out.println("*");
			}
			System.out.println();
		}
	}

}
