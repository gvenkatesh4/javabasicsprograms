package p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
public class Findingdplicatenumbersinarraylist {





	public static void main(String[] args) {
		
		
		
		ArrayList<Integer>dulp = new ArrayList<Integer>();
		dulp.add(1);
		dulp.add(10);
		dulp.add(1);
		dulp.add(12);
		dulp.add(10);
		dulp.add(15);
		dulp.add(15);

		
		
		System.out.println(dulp);
		System.out.println("---------------");
		
		for(Integer str:dulp) {
			
			
			System.out.println(str);
		}
		
		
		System.out.println("---------------");
		HashSet<Integer>dulpp = new HashSet<Integer>(dulp);
		
		
		for(Integer str1:dulpp) {
			//System.out.println(str1);
		System.out.println(	Collections.frequency(dulp, str1)+"=" + str1);
		
		//System.out.println(str1);
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
