package p;

public class Vowelsandconsonentscountprogram {
	public static void main(String[]args) {
		
		
		String voco= "aeioutgh";
		
		char a[] = voco.toCharArray();
		int cons = 0;
		int  vow = 0;
		
		for(int i = 0;i<a.length;i++) {
			if(a[i]=='a'||a[i]=='e'||a[i]=='o'||a[i]=='u'||a[i]=='i') {
				vow++;
			}
			else
				cons++;
		}
		System.out.println("vowels are"+vow);
		System.out.println("cons are"+cons);
	}

}
