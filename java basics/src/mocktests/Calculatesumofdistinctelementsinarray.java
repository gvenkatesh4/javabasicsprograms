package mocktests;

public class Calculatesumofdistinctelementsinarray
{
	public static void main(String[] args) {
         int a[] = {10,20,30,40,50,50,40,30,20,10};
  	   int sum = 0;

       for(int i =0;i<a.length;i++) 
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
        	 sum = sum+a[i];

         }
  	 System.out.println(sum);

}
}
	