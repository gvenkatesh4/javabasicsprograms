//package Extracoding;

public class ECC_28_ListFactors {
    public static void main(String[] args) {
        int num = 284;
        System.out.println(getFactors(num));
    }
	public static String getFactors(int num) {
		String result = " ";
		if(num<0)
			return "-1";
		if(num==0)
			return "-2";
		for(int i =1;i<=num;i++)
		{
			if(num%i==0)
				System.out.print(i+" ");
		}
		
		return result;
		
	}
}
