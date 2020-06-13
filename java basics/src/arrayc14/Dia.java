package arrayc14;

public class Dia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {{1,2,3},{2,4,5},{5,6,7}};
		int i;
		int j;
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		for(i=0;i<3;i++) {
			for(j=i;j<=3;j++)
			{
				System.out.print(a[i][j]);
			}
		}
	}
	
	

}
