package arrayinterviewprepartion;

public class Removeduplicateselementsinastring {

	public static void main(String[] args) {
		
		String str= "hyd hyd india";  

	 String   ad[] = str.split(" ");
	 
	 for(int i=0;i<ad.length;i++) {
			int count=1;

		 for(int j = i+1;j<ad.length;j++)
		 {
        if (ad[i].equals(ad[j])) {
	 
               count++;
			 }
		 }
	
		if(count>1)
			System.out.println(ad[i]);		
		}

	}}


