package mocktests;
import java.util.HashMap;
import java.util.Map;
public class Majorityofele {
	

	
		public static int majorityElement(int[] A)
		{
			Map<Integer, Integer> map = new HashMap<>();

			for (int i: A)
			{
				map.putIfAbsent(i, 0);
				map.put(i, map.get(i) + 1);
			}

			for (Map.Entry<Integer,Integer> entry: map.entrySet())
			{
				if (entry.getValue() > A.length/2) {
					return entry.getKey();
				}
			}

			return -1;
		}

		public static void main(String[] args)
		{
			int arr[] = {11,23,66,2,22,22};

			int res = majorityElement(arr);
			if (res != -1) {
				System.out.println("Majority element is " + res);
			} else {
				System.out.println("Majority element does not exist");
			}
		}
	}

