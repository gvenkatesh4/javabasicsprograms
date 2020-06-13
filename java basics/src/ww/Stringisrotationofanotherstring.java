package ww;

public class Stringisrotationofanotherstring {
	
	public static void main(String[] args) {
		
		String str = "javaava";
		
		String str1 = "avajava";
		
		if(str.length()!=str1.length()){
			System.out.println("it is not string rotation");
			
		}
		else {
			
		
		String str2 = str+str;
		System.out.println(str2);
		
		if(str2.contains(str1)) {
			System.out.println("it is string rotation");
		}
		else {
			System.out.println("it is not string rotation");
		}
		
	}

}
}