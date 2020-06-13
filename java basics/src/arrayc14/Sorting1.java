package arrayc14;
import java.util.Scanner;
public class Sorting1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Array size :");
		
        int size = scan.nextInt();
		
		int a[] = new int[size];
		
		System.out.print("Enter Array Elements "+" :"+" ");
		for(int i =0;i<size;i++){
			a[i] =scan.nextInt();
		}
		getsort(a);

	}
	 public static void getsort(int a[]){

	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]<a[j]) {
				
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		System.out.println(a[i]);
	}
	
	
	
}
	 
	}

