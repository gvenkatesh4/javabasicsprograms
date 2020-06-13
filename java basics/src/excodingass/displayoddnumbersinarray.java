package excodingass;

public class displayoddnumbersinarray {
	public static void main(String[] args) {
	int a[] = {1,2,3,4,5};
	int b = a.length;
	System.out.println(b);
	System.out.println("----");
	
	for(int i =0;i<a.length;i++) {
		if(a[i]%2==0)
			System.out.println(a[i]);
	}
	
	}
}
