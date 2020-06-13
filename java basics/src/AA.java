public class AA {
    public static void main(String[] args) {
        int num = 878;
        System.out.println(isPalindrome(num));
    }

    public static int isPalindrome(int num) {
        //ADD YnOUR CODE HERE
    	if(num<100||num>999)
    		return -1;
    	
    	 
    	if (num%10==num/100)
    		 return 1;
    	else 
    		return 0;
    		
    	}
}