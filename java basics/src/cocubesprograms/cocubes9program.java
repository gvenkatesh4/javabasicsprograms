package cocubesprograms;

public class cocubes9program {
public static void main(String[] args) {
	
	
	int count=0;
	for(int i =100;i<200;i++) {
		int n =i;

	int u=n%10;
    int t=(n/10)%10;
    int h=(n/100)%10;
    if((u==0||u==1||u==4)&&(t==0||t==1||t==4)&&
			  (h==0||h==1||h==4))
		  count++;
	}
	System.out.println(count);
}
}