package cocubesprograms;

import java.util.HashMap;
import java.util.Map;

public class Calculatingbill {
	public static void main(String[] args) {
		
		Map<Integer,Integer>productbill = new HashMap<>();
		
		int b[] = {2,4,3,2,1};
		int bill = 0;
		productbill.put(401,350);
		productbill.put(402,430);
		productbill.put(403,560);
		productbill.put(404,320);
		productbill.put(405,150);
		
		for(int i=0;i<b.length;i++) {
			bill+=productbill.get(402+i)*b[i];
			System.out.println(bill);
			break;

		}

	}

}
