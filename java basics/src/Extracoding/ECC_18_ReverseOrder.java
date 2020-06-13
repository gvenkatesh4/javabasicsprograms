package Extracoding;

public class ECC_18_ReverseOrder {

	public static void main(String[] arg) {
		int start_val = 10;
		int end_val = 1;
		System.out.println(getNumbersInRange(start_val, end_val));
	}

    public static String getNumbersInRange(int s_val, int e_val) {
    	if(s_val<0||e_val<0)
    		return "-1";
    	if(s_val==e_val)
    		return "-2";
    	if(s_val<e_val)
    		return "-3";
    	int value = s_val;
    	int result = e_val;
    	int sum = value-result;
    	if(sum==1)
    		return "-4";
    	for(int i =s_val;i>e_val;i--)
    	System.out.print(i+" ");
    	
		return null;
	}
}
