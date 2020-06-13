package arrayc14;

public class Uniqueelementsofarray {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int a[] = {4,5,6,7,4,2};
		
		for(int i=0;i<a.length;i++)
		{
			int count=0;

			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count==1)
				System.out.println(a[i]);
		}

	}

}
