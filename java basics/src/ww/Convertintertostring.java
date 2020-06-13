package ww;

public class Convertintertostring {

	public static void main(String[]args) {
		
	
	String str = "12345";
	
	int i = Integer.parseInt(str);
	int j = Integer.valueOf(str);
			
	
	System.out.println(i);
	System.out.println(j);
	System.out.println("---------");
	
	int a = 12345;
	
	String strr= Integer.toString(a);
	String strrr = String.valueOf(a);
	
	System.out.println(strr);
	System.out.println(strrr);
}
}