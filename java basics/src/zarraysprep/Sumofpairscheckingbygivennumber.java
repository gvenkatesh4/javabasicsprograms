package zarraysprep;

import java.util.Scanner;

public class Sumofpairscheckingbygivennumber {
	
	public static void main(String[]args) {
		
		System.out.println("enter the number");
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int abcd[] = {4, 6, 5, -10, 8, 5, 20};
		
		
		for(int i =0;i<abcd.length;i++) {
			for(int j = i+1;j<abcd.length;j++) {
				
				if(abcd[i]+abcd[j]==num) {
					System.out.println(abcd[i]+"+"+abcd[j]+"="+ num);
					
				}
				
			}
		}
		
			
		
	}

}
