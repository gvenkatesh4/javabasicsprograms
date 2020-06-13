package ww;

public class Noofwordsinastring {
	
	public static void main(String[] args) {
		
		String noofwords = "java talent sprint";
		
		String[]wordcount=noofwords.split(" ");
		int countt = 0;
		
		for(int i =0;i<noofwords.length();i++) {
			if(noofwords.charAt(i)!= ' ') {
				countt++;
				
			}
		}
		System.out.println(countt);
		System.out.println(wordcount.length);
	}

}
