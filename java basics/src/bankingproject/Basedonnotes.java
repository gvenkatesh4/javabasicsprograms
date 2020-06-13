package bankingproject;
import java.io.*;

public class Basedonnotes {

	
	public class Withdraw
	{
	  {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    int n;
		try {
			n = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    if(n>15000)
	    {
	      System.out.println("ATM Cash Limit exceeds.");
	    }
	    else
	    {
	      if(n<500)
	      {
	        System.out.println(n/100+" Hundreds");
	      }
	      else
	      {
	        int h=5;
	        int f=(n-500)/500;
	        //System.out.println(n-500+" "+(n-500)/500+" "+(n-500)%500);
	        h += ((n-500)%500)/100;
	        if(h>5)
	        {
	          f=f+1;
	          h=h-5;
	        }
	        System.out.println(f+" Five Hundreds and "+h+" Hundreds");
	      }
	    }
	  }
	}

}
