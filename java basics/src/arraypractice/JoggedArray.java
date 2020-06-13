package arraypractice;

public class JoggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a1[] = {1,2,3};
		Integer a2[] = {1,2,3,4,6,7};
		Integer a3[] = {1,2,3,4,5};
		
		Integer a[][] = {a1,a2,a3};
		System.out.println("jagged array");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+"");
				
			}
			System.out.println();
		}
		
		
		

	}

}
