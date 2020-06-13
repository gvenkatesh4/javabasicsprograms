package arrayc14;

import java.util.Scanner;

public class Arrayusingloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int [5];
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the values");
		
		a[0]=scan.nextInt();
		a[1]=scan.nextInt();
		a[2]=scan.nextInt();
		a[3]=scan.nextInt();
		a[4]=scan.nextInt();
		for(int i=0;i<a.length;i++)
		{
			
			System.out.println("a["+i+"]"+i);
		}
		
		

	}

}
