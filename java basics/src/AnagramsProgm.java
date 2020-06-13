import java.util.Arrays;

public class AnagramsProgm {
    

	public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "Slient";
        if (validateStrings(str1, str2) == 1) {
            System.out.println(isAnagrams(str1, str2));
        }
    }

    public static int validateStrings(String str1, String str2) {
  
    	
    	str1=str1.toLowerCase();
    	str2=str2.toLowerCase();
    	

    	
      
        return 0;
    }

    public static boolean isAnagrams(String str1, String str2) {
		//Boolean result=Arrays.equals(str1,str2);
    	char a[] = str1.toCharArray();
        
    	char b[] = str2.toCharArray();
    	
    
		Arrays.sort(a);
		Arrays.sort(b);

    	
    	Boolean result=Arrays.equals(a,b);
		if(result==true)
		return true;
		else
	    return false;
    }
}