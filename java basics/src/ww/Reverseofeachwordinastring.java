package ww;


public class Reverseofeachwordinastring {

	public static void main(String[]args) {
		
		String str = "java Concept of the day sprint";
		String word[] = str.split(" ");
		String s = " ";
		
		
		/*or(int i=0;i<word.length;i++) {
			
			System.out.println(word[i]);
		}*/
		for(int i = 0;i<word.length;i++) {
			
			String newword = word[i];
			
			//System.out.println(newword);
			
			for(int j = newword.length()-1;j>=0;j--) {
				s = s+newword.charAt(j);
				
			}

			
		}
System.out.println(s.trim());
}
}