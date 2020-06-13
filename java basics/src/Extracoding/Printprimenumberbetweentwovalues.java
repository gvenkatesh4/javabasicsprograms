package Extracoding;

public class Printprimenumberbetweentwovalues {

	public static void main(String[] args) {
		for(int num = 7;num<30;num++)
		{
		
		int count=0;
	for(int i = 2;i<num;i++)
	{
		if(num%i==0)
		{
			count++;
		}
	}
		if(count==0)
			System.out.println("prime number are "+num);
			
		
	}
}
}