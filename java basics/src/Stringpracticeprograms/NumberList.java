package Stringpracticeprograms;

public class NumberList {

	
	public static String getNumberList(String input) {
		input = "1,2,3,4,6";
		int num = Integer.parseInt(input);
		long n[] = num;
		
		int noofele = input.length()+1;
		int totalele = noofele*(noofele+1)/2;
		int sum = 0;
		for(int i =0;i<input.length();i++) {
			sum = sum+n[i];
		}
		
		int ret = totalele-sum;
		
		return ret;
	}
	
	public static void main(String[] args) {
		// TEST YOUR CODE HERE
	}

}
