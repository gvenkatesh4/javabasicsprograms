package array;

public class Addmatrix3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {{1,2},{3,4},{5,6}};
		int b[][] = {{1,1},{1,1},{1,1}};
		
		

		int c[][] = new int[3][2];
		
		for(int i = 0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}