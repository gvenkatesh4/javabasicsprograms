package arrayc14;
import java.util.Scanner;
public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		int a [] = new int[5];
		
		Scanner scan = new Scanner(System.in);
		int sum=0;
		System.out.println("enter the elements");
		a[0]=scan.nextInt();
		a[1]=scan.nextInt();
		a[2]=scan.nextInt();
		a[3]=scan.nextInt();
		a[4]=scan.nextInt();
		for(int i =0;i<a.length;i++)
		{
			sum = sum+i;
		}
		System.out.println("sum of array elements"+sum);
			}

}
