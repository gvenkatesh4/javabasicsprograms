package mocktests;

	public class SumOfArrayDistinctElements {
	    public static void main(String[] args) {
	        int[] arr = {10, 20, 30, 40, 50, 50};
	        System.out.println(getSumOfDistinctElements(arr));
	    }
	    
	    //return the sum of distinct elements of an given array
	    public static int getSumOfDistinctElements(int[] arr) {
	    	for(int i =0;i<arr.length;i++) {
	    		if(arr[i]<0)
	    			return -1;
	    		if(arr[i]==0)
	    			return -2;
	    	}
	    	
	    	int sum = 0;
for(int i =0;i<arr.length;i++) 
	        {        
	     	   int count=0;
	             for(int j=0;j<arr.length;j++) 
	     	   {
	     		   if(arr[i]==arr[j]) 
	     		   {
	     			   count++;
	     		   }
	     	   }
	        
	          if(count==1) 
	         	 sum = sum+arr[i];

	          }

	    	
			return sum;
	    }

	    // return true if the val exist more than once in the array
	    public static boolean isDublicate(int[] arr, int val) {
	    	val = 50;
	    	for(int i =0;i<arr.length;i++) {
	    		int count = 0;
	    			if(val==arr[i]) {
	    				count++;
	    		}
	    			
	    		
	    		if(count==1)
	    			return true;
	    	}
			return false;
	    	
	}

	}
