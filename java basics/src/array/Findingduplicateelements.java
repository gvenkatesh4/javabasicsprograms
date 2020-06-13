package array;
import java.util.Scanner;
public class Findingduplicateelements {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size");
		int size =scan.nextInt();
		int a[]=new int [size] ;
		
		for(int i=0;i<size;i++)
		{
			a[i]=scan.nextInt();
			System.out.println(a[i]);
		}
		dupele(a);
	}		


		public static void dupele(int a[]) {
			System.out.println("------------");
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i] == a[j])
					System.out.println("-------------");
System.out.println(a[j]);
				
				
			}
		}
	}

	}
