package extrapracice;

public class WAPinputstringisnumberornot {
	
	public static void main(String[]args) {
		
		String s = "1256";
		
int ha = s.length();

int i =0;
while(i!=ha) {
	if(s.charAt(i)>='0'&&s.charAt(i)<='9') {
		i++;
		
	}
	else
	{
		System.out.println("it was not containing integers");
		System.exit(0);
	}
}
	System.out.println("it was containing integers");




	}
	

}
