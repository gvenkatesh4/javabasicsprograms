public class Armstrong01 {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 125;
        System.out.println(generateArmstrongNums(num1, num2));
    }
    
    public static String generateArmstrongNums(int start, int limit) {
        String result=" ";
        int num=start;
        if(num<=0)
        {
        	return "-1";
        }
        if(start>=limit)
        {
        	return "-2";
        }
        
        return result;
    }

    public static boolean isArmstrong(int num) {
        //ADD YOUR CODE HERE
    }

    public static int sumOfPowersOfDigits(int n) {
        

    }
    public static int[] getDigits(int n) {
    	
    	
    	String s =n+ " ";
        
        int[] a;
		int i;
		while(a[i]!=0)
        {
                int rem = a[i]%10;
                int sum=sum+rem*rem*rem;
                a[i]=a[i]/10;
         }
        return sum;
    	
    }

    public static int power(int d, int p) {
        
    	
    }
}