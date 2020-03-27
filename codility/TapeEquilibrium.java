package codility;

import java.util.Scanner;

public class TapeEquilibrium
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
		System.out.println("Minimal difference that can be achieved in given array is : "+new TapeEquilibrium().solution(A));
		
	}
	
	public int solution(int[] A) 
	{
		long sumAllElements =0;
		for(int i=0;i<A.length;i++)
		{
			sumAllElements = sumAllElements + A[i];
		}
		int currentDifference = Integer.MAX_VALUE;
		int minDifference = Integer.MAX_VALUE;
		long sumFirstPart=0;
		long sumSecondPart=0;
		for(int p=0;p<A.length;p++)
		{
			sumFirstPart = sumFirstPart+A[p];
			sumSecondPart = sumAllElements-sumFirstPart;
		    currentDifference = (int) Math.abs(sumFirstPart-sumSecondPart);
		    minDifference = Math.min(currentDifference, minDifference);
		}
		
		return minDifference;
		
	}

}
