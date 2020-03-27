package codility;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PermutationMissingElement1
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
		System.out.println(new PermutationMissingElement().solution(A));
  }
	
  public int solution(int[] A)
  {
    int max = A.length + 1;
   
    Arrays.sort(A);
    for(int i=1; i<max+1; i++) 
    {
      if(Arrays.binarySearch(A, i)<0)
      {
        return (i);
      }
    }
    throw new RuntimeException("shouldn't reach here");
  }
}