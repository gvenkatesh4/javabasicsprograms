package cocubesprograms;

import java.util.Scanner;

public class Sumofarrayrowandcolumnelements {

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
		
		//System.out.println(a[i][j]);

	}
}

for(int i =0;i<rowsize;i++) {
	int sum = 0;

	for(int j =0;j<colsize;j++) {
		sum = sum+a[i][j];
	}
	System.out.println("sum of rows"+sum);
}
for(int j =0;j<colsize;j++) {
	int sum = 0;

	for(int i =0;i<rowsize;i++) {
		sum = sum+a[i][j];
	}
	System.out.println("sum of cols"+sum);
}




	}

}
