package Extracoding;

public class ECC_13_RoundedSum {
    public static void main(String[] args) {
        int a = 24;
        sumOfRoundedValues(a);
    }

    public static void sumOfRoundedValues(int n1) {
    	int res;
    	
    	
        	int digit = n1%10;
        	int digit1 = n1/10;
        	if(digit<5)
        	
        		System.out.println(digit1*10);
        	if(digit>5)
        		
        			System.out.println((digit1+1)*10);
        	
    }
}
