package C14;

import java.util.Scanner;

public class RightTriangle {

	public static void main(String[] args) {
		
	int num = 5;
		for(int i=1;i<=num;i++)
		{
			for(int j=num;j>i;j--) {
			System.out.println(" ");
			{
			
				for(int k=1;k<=i;k++)
				{
					System.out.print(" *");
				}
			       System.out.println();

			}
		}

	}


}}