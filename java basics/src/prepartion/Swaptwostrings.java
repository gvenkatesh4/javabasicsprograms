package prepartion;

public class Swaptwostrings {

	public static void main(String[] args) {
		
		String s = "India ";
		String s1 = "hyd";
		
		
		String c = "";
		
		c = s;
		s = s1;
		s1 = c;
		
		String h = "sai";
		String h1 = "baba";
		
		 h = h + h1;  
	        h1 = h.substring(0, h.length() - h1.length()); 
	        h = h.substring(h1.length());
	        
		System.out.println(h+" "+h1);
		
		System.out.println(s +" "+ s1);
		
	}
}
