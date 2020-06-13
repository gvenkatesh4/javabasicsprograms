package arrayc14;
import java.util.Scanner;
public class ArrayruntimeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter the row size");
		System.out.println("enter the coloum size");
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int size1 = scan.nextInt();
		int size2 = scan.nextInt();
		int size3 = scan.nextInt();
		
		int[][] a = new int[size][size1];
		int[][] b = new int [size2][size3];
		int i;
		int j;
		int h;
		int k;
		for(i=0;i<size;i++)
		{
			for(j=0;j<size1;j++)
			{
				for(h=0;h<size2;h++)
				{
					for(k=0;k<size3;k++)
					{
						a[i][j] = scan.nextInt();
						b[h][k]= scan.nextInt();
						
					}
				}

			}
			int c[][] = new int[size][size1];
			int d[][] = new int[size2][size3];

			for(i = 0;i<size;i++)
			{
				for(j=0;j<size1;j++)
				{
					for(h=0;h<size2;h++)
					{
						for(k=0;k<size3;k++)
						{
							c[i][j]=a[i][j]*b[i][j];
							d[h][k]=a[h][k]*b[h]j];
							System.out.print(c[i][j]+" ");
							System.out.print(d[h][k]+" ");


					
}
						}
				}
			}
		}
	}
}

					