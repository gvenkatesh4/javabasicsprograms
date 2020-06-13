package arrayc14;
import java.util.Scanner;
public class SumofArrayRuntime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("enter the row size");
		 int rowsize = scan.nextInt();
		 System.out.println("enter the col size");
		 int colsize = scan.nextInt();
		 System.out.println("enter the array elements");
         int[][] a = new int [rowsize][colsize];

         for(int i=0;i<rowsize;i++)
         {
        	 for(int j=0;j<colsize;j++)
        	 {
        		 a[i][j]= scan.nextInt();
        		 //System.out.println(a[i][j]);
        	 }
        	 
         }
         
         for(int i=0;i<rowsize;i++)
 		{
 			int sum =0;
 			for(int j=0;j<colsize;j++)
 			{
 				System.out.print(a[i][j]+" ");
 			
 				sum = sum+a[i][j];
 			}
                System.out.print(sum+ "\n");
//System.out.println();
	    }

}
}
