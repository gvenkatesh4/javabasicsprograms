package mocktests;

import java.util.HashMap;
import java.util.Map;

public class Maxrepeleinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {5,5,5,1,1,1,1};
		
			System.out.println(majorityele(arr));
		}
		
	
public static int majorityele(int arr[]) {
	Map<Integer,Integer>countmap = new HashMap();
	Integer result = null;
	for(int i = 0;i<arr.length;i++) {
	countmap.put(arr[i], countmap.getOrDefault(arr[i],0)+1);
	}
	int val = arr.length/2;
	for(Map.Entry<Integer,Integer>entry:countmap.entrySet()) {
		if(entry.getValue()>3) {
		result = entry.getKey();
		break;
		}
	}
	
	return result;
	
}
}
