package Extracoding;

public class ECC_12_SumOfMul10 {
    public static void main(String[] args) {
        int a = 23, b = 30, c = 69;
        System.out.println(sumOfMultiples(a, b, c));
    }

    public static int sumOfMultiples(int a, int b, int c) {
    	if(a<=0||b<=0||c<=0)
    		return -1;
    	
    	int value = ((a/10)+1)*10;
    	int value1 = ((b/10)+1)*10;
    	int value2 = ((c/10)+1)*10;
		return value+value1+value2;
    }
}
