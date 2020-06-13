package Extracoding;

public class ECC_19_RangeWithStep {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 20;
        int step = 2;
        System.out.println(getNumbersInRange(n1, n2, step)); 
    }
	public static String getNumbersInRange(int num1, int num2, int step) {
		
		if(num1<0||num2<0||step<0)
			return "-1";
		if(num1==num2||num1==step||num2==step)
			return "-2";
		if(num1>num2)
			return "-3";
	int sum = num1+num1;
	while(sum<num2) {
	int temp= sum+step;
		System.out.println(sum+" "+temp);
	}
		return null;

	}
}
