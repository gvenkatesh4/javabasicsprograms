package array;
import java.util.Scanner;
public class Sotingele {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size");
		int size = scan.nextInt();
		
          System.out.println("enter the array elements");
          int a[]=new int [size];
          for(int i = 0;i<size;i++)
          {
        	  a[i]=scan.nextInt();
        	  System.out.println(a[i]);
          }
          System.out.println("-------------------");
          sorting(a);
	}

	
	public static void sorting(int a[]) {
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(a[i]);
		}
		
		
	}
	
}
