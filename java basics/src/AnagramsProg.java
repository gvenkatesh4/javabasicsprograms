import java.util.Arrays;

public class AnagramsProg {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "Slient";
        if (validateStrings(str1, str2) == 1) {
            System.out.println(isAnagrams(str1, str2));
        }
    }

    public static int validateStrings(String str1, String str2) {
    	//String result = " ";
    	if(str1.isEmpty()||str2.isEmpty()) 
    		return -1;
    		else if(str1.contains(" ")||str2.contains(" "))
    			return -2;
    		else
    			return 0;
    	}
    		
    

    public static boolean isAnagrams(String str1, String str2) {
    	if(str1.length()!=str2.length()) {
    		return false;
    	}
    	else
       
        return true;
    }
}
