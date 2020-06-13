package arrayc14;
import java.util.Scanner;


public class findingdulipcateelementsinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size");
		size = scan.nextInt();
		int a[] = new int [size];
		
		System.out.println("Enter the array elements");
		for(int i=0;i<a.length;i++)
		{
			size = scan.nextInt();
		}
		duplicateele(a);
	}
		public static  void duplicateele(int a[]) {
			for(int i = 0; i < a.length; i++) {  
	            for(int j = i+1; j < a.length; j++) {  
	                if(a[i] == a[j])  
	                    System.out.println(a[i]);  
	            }  
	        }  
	    }  
	}  

