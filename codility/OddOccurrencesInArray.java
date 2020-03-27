package codility;

import java.util.Scanner;

public class OddOccurrencesInArray 
{
	//int num;

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
	
	// This method has the main logic and returns the required number
	public int solution(int[] A)
	{
		int num=0;
		for(int i=0;i<A.length;i++)
		{
			for(int j=0;j<A.length;j++)
			{
				if(A[i]==A[j])
				{
					num++;
				}
			}
			if(num%2!=0)
			{
				num = A[i];
				return num;
				//break;
			}
		}
		throw new RuntimeException("It may be an input which does not contain any unpaired value.");
	}
}