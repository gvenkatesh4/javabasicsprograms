package cocubesprograms1;

public class Highestfrequencycharacters {
	
	public static void main (String[] args) {
		 String ste = "abcdaabcaba";
		 int num1 = 0;
		 int num2 = 0;
		 int num3 = 0;
		 int num4 = 0;
		 for(int i=0;i<ste.length();i++) {
			 
			 char c = ste.charAt(i);
			 if(c == 'a') {
				 num1++;
			 }
			 if(c == 'b') {
				 num2++;
			 }
			 if(c == 'c') {
				 num3++;
			 }
				 if(c == 'd') {
					 num4++;
				 }
				 
	}
		 
		 if(num1>num2&&num1>num3&&num1>num4) {
			 System.out.println("greatest is a"+num1);
		 }
		 if(num2>num1&&num2>num3&&num2>num4) {
			 System.out.println("greatest is b"+num2);
		 } if(num3>num1&&num3>num2&&num3>num4) {
			 System.out.println("greatest is c"+num3);
		 }
		 if(num4>num1&&num4>num2&&num4>num3) {
			 System.out.println("greatest is d"+num4);
		 }
}
}