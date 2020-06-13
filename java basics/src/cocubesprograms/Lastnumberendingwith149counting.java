package cocubesprograms;

public class Lastnumberendingwith149counting {

  public static void main(String[] args) {
	  
	  int count=0;
	  for(int i =100;i<200;i++) {
		  int n = i;
		  
		  int unitdigit=n%10;
		  System.out.println("unitplace"+unitdigit);
		  int ten = n/10;
		  int tendigit = ten%10;
		  System.out.println("tenplace"+tendigit);
		  int ha = ten%10;
		  System.out.println("hundredplace"+ha);
		  if((unitdigit==0||unitdigit==1||unitdigit==4)&&(tendigit==0||tendigit==1||tendigit==4)&&
				  (ha==0||ha==1||ha==4))
			  count++;
		  //System.out.println(count);
	  }
	  System.out.println(count);
	  
  }
		
	}
	

