package codility;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class OddOccurrencesInArray1 
{
	public static void main(String[] args)
	{
		

		Scanner sc = new Scanner((System.in));
		System.out.println("Enter the array size");
		int n;
		/* Since we need only odd number of elements in array, if user enters an even number of elements,
		we will ask to re-enter again.*/
		while(true)
		{
			n = sc.nextInt();
			if(n%2!=0)
				break;
			else
				System.out.println("Please enter an odd size");
				continue;
		}
		System.out.println("Enter the array elements : ");
		int A[] = new int[n];
		for (int i=0;i<n;i++)
		{
			A[i] = sc.nextInt();
		}
		
		System.out.println(new OddOccurrencesInArray().solution(A));	

		
	}
	public static int solution(int[] A) {
	    HashMap <Integer, Integer> occurrencesMap = new HashMap<Integer, Integer>();
	   
	    for(int i=0; i<A.length; i++) {
	      if(occurrencesMap.containsKey(A[i])) {
	        int occurrences = occurrencesMap.get(A[i]);
	        occurrences++;
	        occurrencesMap.put(A[i], occurrences); //increment occurrence counter and store it
	      }
	      else {
	        occurrencesMap.put(A[i], 1); //1st occurrences of this value
	      }
	    }
	    
	    //System.out.println(occurrencesMap);
	    Set<Integer> keySet = occurrencesMap.keySet();
	    //System.out.println(keySet);
	    
	      for(int currentKey : keySet)
	      {
	      int occurrences = occurrencesMap.get(currentKey);
	    //System.out.println(occurrencesMap.get(currentKey));
	     
	    //if occurs odd number of times, we found the unpaired value - no need to continue checking
	      if(occurrences % 2 != 0) 
	    	return  currentKey;
	      }
	      
	    //should never get to here
	    throw new RuntimeException("It may be an input which does not contain any unpaired value.");
	  }
}