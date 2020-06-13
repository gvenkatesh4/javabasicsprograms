package arrayc14;
import java.util.Scanner;
public class Diagonalelements11 {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("enter the size");
			System.out.println("enter the coloum size");
			Scanner scan = new Scanner(System.in);
			
			int rowsize = scan.nextInt();
			int colsize = scan.nextInt();
			
			int[][] a =  new int [rowsize][colsize];
	        
	for(int i =0;i<rowsize;i++)
	{
		for(int j=0;j<colsize;j++)
		{
			a[i][j] = scan.nextInt();
			

		}

	}
	

	for(int i=0;i<rowsize-1;i++)
		{
			for(int j=0;j<colsize+1;j++)
			{
				
			
				System.out.println(a[i][j]+" ");
			}
	    
	System.out.println();
	}

	}

}
