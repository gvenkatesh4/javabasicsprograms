

public class ReverseWords {

	public static void main(String[] args) {
		System.out.println(ReverseWords.reverse("talent sprint"));
	}

	public static String reverse(String str) {
	      
		String[]s=str.split(" ");
		String result=" ";

		
		for(int i=0;i<s.length;i++)
		{
			String newword=s[i];
			
			for(int j=newword.length()-1;j>=0;j--)
			{
				result = result+newword.charAt(j)+"";
			}

		result = result+" ";
		}	

		if(str == null || str.length()==0)	
		return null;
        else
	        return result.trim();

}
}