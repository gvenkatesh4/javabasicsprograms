package arrayc14;
import java.util.Scanner;
public class Arrayaddinginrumtime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the size");

		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		
		System.out.println("enter the elements");
		int a[] = new int[size];

		int i;
		for(i=0;i<size;i++)
		{
			a[i] = scan.nextInt();
		}
		int sum=0;
		for(i=0;i<a.length;i++)
		{
			sum = sum+a[i];
		}
		int value=sum/size;
		
		System.out.println("sum of elements"+sum);
		System.out.println("avg of elements"+value);
	}

}
