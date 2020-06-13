package prepartion;

public class Roughpriminrange {
	
	public static void main(String[] args) {
		
		int end = 10;
		for(int u = 1;u<end;u++) {
		int count = 0;
		for(int i = 2;i<u;i++) {
			if(u%i==0) 
				count++;
		}
		
			if(count==0)
			System.out.println(u);
			
			}
		}
}


