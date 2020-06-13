package mocktest1;
import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.*;

public class SumOfArrayDistinctElements {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 50};
       // System.out.println(getSumOfDistinctElements(arr));
//    }
    
    //return the sum of distinct elements of an given array
    //public static void getSumOfDistinctElements(int[] arr) {
        // ADD YOUR CODE HERE
    	int sum = 0;
    	int length0fArray = arr.length;
    	int lengthofArray = 0;
		for(int i = 0; i<lengthofArray; i++) {	
sum = sum+arr[i];

System.out.println("sum is"+sum);
				
    	}
    	
    	
    }

    // return true if the val exist more than once in the array
    //public static boolean isDublicate(int[] arr, int val) {
        // ADD YOUR CODE HERE
    }
//}