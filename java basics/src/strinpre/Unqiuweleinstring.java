package strinpre;

public class Unqiuweleinstring {
	public static void main(String[]args) {
		
		String a = "bbbaaafrht";
		
		char h[] = a.toCharArray();
		
		for(int i=0;i<a.length();i++)
		{
			int count =0;
			for(int j=0;j<a.length();j++)
			{
				if(h[i]==h[j])
				{
					count++;
				}
			}
			if(count==1)
				System.out.println(h[i]+" ");
			//return;

	}
		
	}
}
