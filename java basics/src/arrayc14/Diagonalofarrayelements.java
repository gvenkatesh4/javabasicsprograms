package arrayc14;
import java.util.Scanner;
public class Diagonalofarrayelements {

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
for(int i=0;i<rowsize;i++)
	{
		
		for(int j=i;j<=i;j++)
		{
			System.out.print(a[i][j]+" ");
		
			
		}
        
	}
System.out.println("right side elements");
System.out.println();
for(int  i1=0;i1<rowsize;i1++)
	{
		
		for(int j=0;j<colsize;j++)
		{
			if(i1+j==rowsize-1) {
				System.out.print(a[i1][j]+" ");

			}
				
			}
		}
		
			
}

}


