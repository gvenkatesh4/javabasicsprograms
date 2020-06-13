package arrayinterviewprepartion;

public class Multiplyoftwomatrics {

	public static void main(String[] args) {
		int a[][] = {{1,2},{1,2}};
		int b[][] = {{1,2},{1,2}};
		int[][] c = new int[2][2];
		
		
		for(int i =0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++) {
			   c[i][j]=a[i][j]*b[i][j];
				System.out.print(c[i][j]+" ");

			}
			System.out.println();

		}
	}

}
