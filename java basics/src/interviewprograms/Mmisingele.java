package interviewprograms;

public class Mmisingele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,5,6};
		int sum1=0;

		int n=a.length+1;
		int sum=n*(n+1)/2;
		for(int i=0;i<a.length;i++)
		{
			//sum1=sum1+a[i];
			sum=sum-a[i];

		}
		System.out.println(sum);
		//System.out.println(sum-sum1);

		

	}

}
