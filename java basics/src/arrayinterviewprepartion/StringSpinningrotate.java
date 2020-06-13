package arrayinterviewprepartion;

public class StringSpinningrotate {

	public static void main(String[] args) {
		
		
		String abc = " just for change";
		String sum = " ";
		int a = abc.length();
		
for(int i = a-1;i>=0;i--)		
		{
	        sum=sum+abc.charAt(i);

		}
		
System.out.println(sum);

		
	}

}
