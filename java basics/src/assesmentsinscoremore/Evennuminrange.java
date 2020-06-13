package assesmentsinscoremore;

public class Evennuminrange {

	public static void main(String[] args) {
		int num = 1;
		int num1 = 10;
		if(num>num1) {
			num = num+num1;
			num1 = num-num1;
			num = num-num1;
		}
		for(int i = num;i<=num1;i++)
		{
			if(i%2==0)
				System.out.println(i);
		}
		
	}

}
