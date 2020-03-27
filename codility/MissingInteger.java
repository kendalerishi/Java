package codility;

import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;

public class MissingInteger 
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
		System.out.println(new MissingInteger().solution(A));
  }

  public int solution(int[] A) 
  {
    Set<Integer> testedSet = new TreeSet<Integer>();
    Set<Integer> perfectSet = new TreeSet<Integer>();
   
    for(int i=0; i<A.length; i++) 
    {
      testedSet.add(A[i]);   //convert array to set to get rid of duplicates, order int's
      perfectSet.add(i+1);  //create perfect set so can find missing int
    }
   
    for(int current : perfectSet) 
    {
      if(!testedSet.contains(current))
      {
        return current;
      }
    }

    if(perfectSet.size() == testedSet.size()) 
    {
      return perfectSet.size() + 1;  //e.g. {1, 2, 3} should return 4
    }
   
    return 1; //default - e.g. if A array has negative values or just a single positive value like 10
  }
}