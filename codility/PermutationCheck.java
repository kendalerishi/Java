package codility;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PermutationCheck
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner((System.in));
		System.out.println("Enter the array size");
		int n = sc.nextInt();
		System.out.println("Enter the array : ");
		int A[] = new int[n];
		for (int i=0;i<n;i++)
		{
		A[i] = sc.nextInt();
		}
		System.out.println(new PermutationCheck().solution(A));
	}
	public int solution(int[] A)
	{
	    Set<Integer> testedSet = new HashSet<Integer>();
	    Set<Integer> perfectSet = new HashSet<Integer>();
	   
	    for(int i=0; i<A.length; i++)
	    {
	      testedSet.add(A[i]);
	      perfectSet.add(i+1); // create set with values start from 1 to A.length
	    }
	   
	    for(int current : perfectSet) 
	    {
	      //as soon as find 1 element missing return false
	      if(!testedSet.contains(current)) 
	    	  return 0;
	    }
	    return 1;
	}
}