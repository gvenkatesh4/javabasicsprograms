package arrayc14;
import java.util.Scanner;
public class IdentityMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size");
		 int rowsize = scan.nextInt();
		 System.out.println("enter the col size");
		 int colsize = scan.nextInt();
		 System.out.println("enter the array elements");
        int[][] a = new int [rowsize][colsize];

        for(int r=0;r<rowsize;r++)
        {
       	 for(int c=0;c<colsize;c++)
       	 {
       		 a[r][c]= scan.nextInt();
       		 
       	 }
       	 
        }
        
		for(int r=0;r<rowsize;r++)
		{
			for(int c=0;c<colsize;c++)
			{
				if(r==c&&r!=1&&r!=c&&a[r][c]!=0) { 
				
					System.out.println("it is not identity");
				}else
						System.out.println("it is identity");
				}
			}

		}
		


	}