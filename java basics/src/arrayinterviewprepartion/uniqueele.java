package arrayinterviewprepartion;

public class uniqueele {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,1,2};
		int b =a.length;
		for(int i=0;i<b;i++) {
			for(int j =i+1;j<b;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]);
			}
		}}


}
}