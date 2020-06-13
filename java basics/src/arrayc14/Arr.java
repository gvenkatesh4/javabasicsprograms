package arrayc14;

import java.util.Scanner;

public class Arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a[] = {10,12,13};
		//System.out.println(a[0]);
		//System.out.println(a[2]);

		//System.out.println(a[1]);
		
		int a[] = new int[5];
		
Scanner scan = new Scanner(System.in);
System.out.println("enter the elements");

a[0]= scan.nextInt();
a[1]= scan.nextInt();
a[2]= scan.nextInt();
a[3]= scan.nextInt();
a[4]= scan.nextInt();

System.out.println("array elements are");
System.out.println("a1[0]"+a[0]);
System.out.println("a1[1]"+a[1]);
System.out.println("a[2]"+a[2]);
System.out.println("a1[3]"+a[3]);
System.out.println("a1[4]"+a[4]);
//System.out.println(a[5]);




	}

}
