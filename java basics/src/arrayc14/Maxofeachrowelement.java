package arrayc14;
import java.util.Scanner;
public class Maxofeachrowelement {

	public static void main(String[] args) {
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

//int max =0;
int max = a[0][0];

for(int i=0;i<rowsize;i++)
	{
		for(int j=0;j<colsize;j++)
		{
			if(a[i][j]>max) {
				max=a[i][j];
			}
			//System.out.println("row max ele"+max);

		}
		System.out.println("row max ele"+max);

System.out.println();
}

}

}
