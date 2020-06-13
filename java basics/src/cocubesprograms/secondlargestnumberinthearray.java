package cocubesprograms;

public class secondlargestnumberinthearray {

	public static void main(String[] args) {

		int a[] = {10,20,30,5,40,50};
		int total = a.length;
		for(int i =0;i<a.length;i++) {
			for(int j = i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(a[total-2]);
		
		
	}

}
