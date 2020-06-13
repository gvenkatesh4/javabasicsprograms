package Extracoding;

public class ECC_26_CheckArmStrong {
	
	public static void main(String[] arg) {
		int num = 1634;
		System.out.println(checkArmStrong(num));
	}

	public static String checkArmStrong(int num) {
		if(num<0)
			return "-1";
		if(num<1000||num>9999)
		return "-2";
		
		int sum=0;
		int temp = num;
		while(num>0)
		{
			int rem = (num%10);
			sum = sum+rem*rem*rem*rem;
			num = num/10;
			
		}
	
		if(temp==sum)
			return "ArmStrong Number";
		else
		return "Not ArmStrong Number";
	}
}
