package interviewprograms;

public class Automorphicnumber {

	public static void main(String[] args) {
		int num = 5;
		
			int s = num%10;
		
		int square = s*s;
		int digit = square%10;
		if(digit == s)
			System.out.println("automorphic number");
		else
			System.out.println("not automorphic number");
	}

}
