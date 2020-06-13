package mocktest1;

public class Mcqev {

	public static void main(String[] args) {
		char[] aa= {'a','b','d','d'};
		char[] bb= {'a','b','d','d'};
		
		int count=0;
		
		for(int i=0;i<aa.length;i++) {
			for(int j=0;j<bb.length;j++) {
				if(i==j) {
					if(aa[i]==bb[j]) {
						count++;
					}
				}
			}
		}
		int value =count*2;
		System.out.println(value);
	}

}
