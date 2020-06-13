package cocubesprograms1;

public class Perdentagediffbwpositiveandnegativenumbers {
	
	public static void main(String[] args) {
		
		int sum = 0;
		int sec = 0;
		int a[] = {3,2,4,5,0,-1,-4,-67};
		for(int i =0;i<a.length;i++) {
			
		
		
int d = a[i];	
	if(d>0) {
		
		sum = sum+a[i];
	}
	else
		sec = sec+a[i];

	
		}
		System.out.println(sum);
		System.out.println(sec);
		int s = 0-sec;
		System.out.println(s);
		System.out.println((s-sum)*100/72);
	}
}
