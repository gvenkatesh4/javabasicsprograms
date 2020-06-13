package prepinstacoding;

public class Replaceall0swithonesinagivennumber {

	public static void main(String[] args) {
		
		int num=1000;
		String str=Integer.toString(num);
		int h = str.length();
		String str1 = " ";
		for(int i=0;i<h;i++) {
		  if(str.charAt(i)=='0') 
			  str1 = str1+'1';
			  else
				  str1 = str1+str.charAt(i);
		  
		}
		System.out.println(str1.trim());
		
	}

}
