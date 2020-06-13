package prepartion;


public class Strinngduplicates {
	public static void main(String[] args) {
		
		String s = "hyd hyd";
		
		String as[] = s.split(" ");
		
		
		for(int i= 0;i<as.length;i++) 
		{
			int count = 1;
			for(int j = i+1;j<as.length;j++) 
			{

				if(as[i].equals(as[j])) {
					count++;
				}
			}
			if(count>1)
			
				System.out.print(as[i]);
		
		
		
	}

}
}
