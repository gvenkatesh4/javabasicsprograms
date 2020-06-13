package p;

public class Pri {
public static void main(String[] args) {
	
	int num=10;
	int start = 1;
	int end = 10;
	for(int i = start;i<end;i++) {
		int count = 0;

	
	for(int n = 2;n<i;n++) {
		if(i%n==0) 
			count++;
		
	}
	
	if(count==0) 
		System.out.println(i);
}
}
}
