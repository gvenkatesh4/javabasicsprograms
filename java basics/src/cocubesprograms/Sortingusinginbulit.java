package cocubesprograms;

import java.util.Arrays;

public class Sortingusinginbulit {

	public static void main(String[] args) {
		int arr[] = {1,50,45,8,10};
		
	Arrays.sort(arr);
	
	for(int num:arr) {
		System.out.println(num);
	}
	System.out.println("second largest ele");
System.out.println(arr[arr.length-2]);		

	}

}
