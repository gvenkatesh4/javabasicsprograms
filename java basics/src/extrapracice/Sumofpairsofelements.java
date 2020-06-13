package extrapracice;

import java.util.Scanner;

public class Sumofpairsofelements {

	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the number");
		int num = scan.nextInt();
		int a[]  = {12,13,40,15,8,10,-15};
		
		for(int i = 0;i<a.length;i++) {
			for(int j = i+1;j<a.length;j++) {
				
				if(a[i]+a[j]==num) {
					System.out.println(a[i]+" +"+a[j]+"= "+num);
				}
			}
		}

	}
}
