public class Box {
	public static void main(String[] args) {
		System.out.println(createBoxPattern(4, 5));
	}

	public static String createBoxPattern(int rows, int cols) {
		
		String result = " ";
		if(rows<0||cols<0)
			return "-1";
		if(rows==0||cols==0)
			return "-2";
		
		for(int i = 1; i <= rows; i++)
		{
			for(int j = 1; j <= cols; j++)
			{
				if(i == 1 || i == rows || j == 1 || j == cols)
				{
					System.out.print("*"); 
				}
				else
				{
					System.out.print(" "); 
				}
			}
			System.out.print("\n"); 
		
	}
		return result;
}
}