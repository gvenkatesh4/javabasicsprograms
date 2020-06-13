package cocubesprograms;

public class Sumofnumbersdivisibleby3and5 {

	public static void main(String[] args) {
		int i =1;
		int n =10;
		int sum =0;
		for(i=1;i<n;i++) {
			if(i%3==0||i%5==0) {
				sum = sum+i;

			}
		}
		System.out.println(sum);

	}

}
