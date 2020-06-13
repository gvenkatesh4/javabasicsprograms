package interviewprograms;

public class Loops {

	public static void main(String[] args) {

		
		int a  = 20, b;
		//b = a++ + ++a + a++;
		//b = a++ + ++a;
		//b= --a + --a;
		//b = ++a + a++;

		b = ++a + a++ + ++a;
		System.out.println(b);
	}

}
