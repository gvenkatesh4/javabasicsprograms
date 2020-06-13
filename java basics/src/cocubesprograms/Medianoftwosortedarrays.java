package cocubesprograms;

import java.util.Arrays;


public class Medianoftwosortedarrays {
public static void main(String[] args) {
	
	int a[] = {10,20,30,40,100};
	Arrays.	sort(a);

	for(int i =0;i<a.length;i++) {
		//System.out.println(a[i]);
	}
		int median = a.length;
		if(median%2!=0) {
		int length = median/2;
		System.out.println(a[length]);
		}
		else
		{
			int mid = a.length/2;
			int midnext = mid+1;
			
			float add = a[mid-1]+a[midnext-1];
			float h = add/2;
			System.out.println(h);
	
		}
		//System.out.println(length);
	
	
}
}
