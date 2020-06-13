package assesmentsinscoremore;

public class ECC_30_EvenNumberTester {
		public static String getEvenNumbers(int num1, int num2) {

			if (num1 < 0 || num2 < 0)
				return "-1";
			if (num1 == 0 || num2 == 0 || num1 == num2)
				return "-2";

			if (num1 > num2) {
				num1 = num1 + num2;
				num2 = num1 - num2;
				num1 = num1 - num2;
			}
			String result = "";
			for (int i = num1; i <= num2; i++) {
				if (i % 2 == 0) {
					
					result = result+i+" ";
				
				}
			}
			return result;
		}
		
		public static void main(String[] args) {
			int num1 = 20;
			int num2 = 10;
			System.out.println(getEvenNumbers(num1, num2));
		}
	
}