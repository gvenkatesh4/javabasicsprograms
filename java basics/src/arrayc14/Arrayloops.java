package arrayc14;
import java.util.Scanner;
public class Arrayloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size");
		
		int size = scan.nextInt();

		int a[] = new int[size];
		
		System.out.println("enter the avg of elements");
		for(int i =0;i<size;i++)
		{
			a[i]=scan.nextInt();
			
			
		}
		
System.out.println("avg of array elements"+sum(a));
	}
public static int sum(int a[]) {
	int sum=0;
	for(int i=0;i<a.length;i++)
	{
		sum = sum+a[i];
		
		
	}
	return sum/a.length;
}

}

