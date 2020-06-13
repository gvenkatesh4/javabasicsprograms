package arraypractice;

public class Multidiemensialarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[][]= {{1,2,3},{3,4,5,},{6,7,8},{9,10,11}};
		
		for(int i=0;i<3;i++) {
			for(int j = 0;j<3;j++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
			
	}

}
