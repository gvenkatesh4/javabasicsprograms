package Eccpractice;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		int n, k;
		Scanner cc = new Scanner(System.in);

		System.out.println("enter the number of rows");
		n = cc.nextInt();
		System.out.println("Enter the number of cloums");
		k = cc.nextInt();
		int arra[][] = new int[n][k];
		System.out.println("Enter the matrix elements");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < k; j++)
				arra[i][j] = cc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < k; j++) {
				System.out.print(arra[i][j] + " ");
			}
			System.out.println();
		}
		max(arra, n, k);

	}

	public static void max(int arra[][], int n, int k) {
		int max;
		for (int i = 0; i < n; i++) {
			max = 0;

			for (int j = 0; j < k; j++) {
				max = arra[i][j];
			}
			System.out.println("The max of row " + (i + 1) + "is " + max);
		}
	}

}