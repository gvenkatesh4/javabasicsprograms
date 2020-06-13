

public class NthTermQSequence {

	public static void main(String[] args) {
		System.out.println(NthTermQSequence.getNthTerm(5));

	}

	public static int getNthTerm(int n) {
		if(n<=0)
		{
			return-1;
		}
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
			
		}
			
		return sum;
	
	}
	
	

}
