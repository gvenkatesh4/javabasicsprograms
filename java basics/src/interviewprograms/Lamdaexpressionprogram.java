package interviewprograms;



interface lam{
	public void hy();
}

public class Lamdaexpressionprogram {
	public static void main(String[] args) {
		
		int a =  20;
		int b = 20;
		int c = a+b;
	
	lam h=()->{
		System.out.println(c);
	};
	h.hy();
}
}