package mocktest1;

public class PossibleFruitsCombinations
{	
	public static String getPossibleFruitsCombinations() {
		int b;
		int o;
		int a;
		String result="";
		
		for(b=1;b<=100;b++)
		{
			for(o =1;o<=100;o++)
			{
				for(a=1;a<=100;a++)
				{
					float cost =(b*0.5f)+(o*1)+(a*5);
					int combinations = a+b+o;
					
					if(cost==100&&combinations==100)
					{
						System.out.println("banas :"+b);
						System.out.println("oranges :"+a);

						System.out.println("apples :"+o);
						

					}
		
				
		
	}
			}
		}
		return result;
		}

	public static void main(String args[]){
		int b;
		int o ;
		int a;
		System.out.println(getPossibleFruitsCombinations());
		
	}
}