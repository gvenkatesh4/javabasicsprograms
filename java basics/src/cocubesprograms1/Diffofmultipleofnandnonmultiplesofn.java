package cocubesprograms1;

public class Diffofmultipleofnandnonmultiplesofn {

	public static void main(String[] args) {
		int n = 3;
		int m = 10;
		int sum = 0;
		int sum1 = 0; 
		int sum2 = 0;
		
		for(int i =n;i<=m;i++) {
			if(i%3==0) {
				sum = sum+i;
			}

	}
for(int j = 1;j<=m;j++) {
	if(j%3==0) {
		sum1 = sum1+j;
	}
	else
		sum2 = sum2+j;
}
System.out.println(sum2-sum);
	}
}
