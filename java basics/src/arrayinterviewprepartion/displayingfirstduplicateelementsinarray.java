package arrayinterviewprepartion;

public class displayingfirstduplicateelementsinarray {

	public static void main(String[] args) {
		int a[]= {11,23,66,2,22,22,20,20};
		
		
		int b=a.length;
		
		for(int i=0;i<b;i++) {
			for(int j=i+1;j<b;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]);
					return;
				}
				
			}
		}
	}

}
