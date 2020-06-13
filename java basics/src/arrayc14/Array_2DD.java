package arrayc14;

public class Array_2DD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		
		for(int r=0;r<3;r++)
		{
			int sum =0;
			for(int c=0;c<3;c++)
			{
				System.out.print(a[r][c]+" ");
				sum = sum+a[r][c];
			}
			System.out.println(sum+ "\n");
		}
		

	}

}
