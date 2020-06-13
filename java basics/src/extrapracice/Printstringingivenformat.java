package extrapracice;

public class Printstringingivenformat {

	public static void main(String[]args) {
		
		int  a [] = {10,20,30,50};
		
		int b[] = {10,25,35,50};
		
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					System.out.println(a[j]);
				}
			}
		}
		
	}
}
