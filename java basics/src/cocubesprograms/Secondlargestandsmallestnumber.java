package cocubesprograms;

import java.util.Arrays;

public class Secondlargestandsmallestnumber {

	public static void main(String[] args) {

		int a[] = {10,20,50,40,60};
		Arrays.sort(a);
		
		for(int number:a) {
		//	System.out.println(number);
		}
		System.out.println(a[a.length-2]);
	}

}
