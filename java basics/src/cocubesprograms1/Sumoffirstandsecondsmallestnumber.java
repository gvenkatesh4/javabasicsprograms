package cocubesprograms1;

import java.util.Arrays;

public class Sumoffirstandsecondsmallestnumber {
	
	public static void main(String[] args) {
		int arr[] = { 1,10,20,5,6,7,50,48};
		
		
		Arrays.sort(arr);
		
		for(int i = 0;i<arr.length;i++) {
		//System.out.print(arr[i]);
		}
		
		int firstsmall = arr[0];
		int secsmall = arr[1];
		

System.out.println(firstsmall+secsmall);		
	}

}
