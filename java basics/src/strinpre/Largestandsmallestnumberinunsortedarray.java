package strinpre;

import java.util.Arrays;

import basics.Array;

public class Largestandsmallestnumberinunsortedarray {
	public static void main(String[] args) {
		
		
		int arr[] = {10,20 ,50 ,5,80,1};
		
		    int max = arr[0];
		    int min = arr[0];
		    
		   // System.out.println(max);
		    //System.out.println(min);
		    
		    Arrays.sort(arr);
		    for(int i=0;i<arr.length;i++) {
		    	System.out.println(arr[i]);
		    }
		    
		    int a = arr.length-3;
		    System.out.println(arr[a]);
		    System.out.println("---------");
		    for(int i = 1; i < arr.length; i++) {
		        if(arr[i] > max) {
		            max = arr[i];
		        } else if(arr[i] < min) {
		            min = arr[i];
		        }
		    }
		    
		    System.out.println("Largest number : " + max);
		    System.out.println("Smallest number : " + min);
	
		}
		}