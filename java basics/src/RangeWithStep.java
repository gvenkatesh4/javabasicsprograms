public class RangeWithStep {
	public static void main(String[] args) {
	        int n1 = 1;
	        int n2 = 20;
	        int step = 23;
	        System.out.println(getNumbersInRange(n1,n2, step)); 
	    }
		public static String getNumbersInRange(int num1, int num2,int step) {
			if( num1<0) {
			 return"-1";
			}
			else if(num2<0)
			{
				return "-1";
			}
		else if(num1==num2)
			{
				return"-2";
			}
		else if(num1>num2)
		{
			return"-3";
		}
			for( num1 = 1;num1<=num2;num1++)
			{
				System.out.println(num1);
			}
			System.out.println(step);
			String result="";
			return result;
		
		
			
		   
		}
	}
