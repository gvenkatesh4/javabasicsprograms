package array;
import java.util.Scanner;

public class Leftrotationofarray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int size = scan.nextInt();
		int a[] = new int [size];
		
		for(int i=0;i<size;i++)
		{
			
			a[i]=scan.nextInt();
			
			}
		rotation(a);
	}
	
	public static void rotation(int a[]) {
		for(int i =a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
	}
	
}

