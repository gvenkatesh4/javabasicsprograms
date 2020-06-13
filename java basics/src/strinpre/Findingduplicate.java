package strinpre;



public class Findingduplicate {
public static void main(String[]args) {
	
	String s = "abcdabc";
	
//int c = 0;
char ad[] = s.toCharArray();

for(int  i=0;i<s.length();i++) {
	for(int j = i+1;j<s.length();j++) {
		if(ad[i]==ad[j]) {
			System.out.println(ad[j]);
			//c++;
			//return;
		}
	}
}
	
	
}
}
	
