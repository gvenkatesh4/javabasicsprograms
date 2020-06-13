package Extracoding;

public class ECC_02_DigitChecker {
    public static void main(String[] args) {
        int num = 83;
        System.out.println(getDiffOfDigits(num));
    } 
    public static int getDiffOfDigits(int num) {
    	if(num<0)
    		return -3;
    	if(num>99)
    		return -2;
    	if(num>=0&&num<=9)
    		return -1;
    	int di = 0;
    	int d = 0;
    	int val = num%10;
    	int res = num/10;
		return num=res-val;
    }
}