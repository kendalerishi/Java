package codility;

import java.util.Scanner;

public class CyclicRotation 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner((System.in));
		System.out.println("Enter the array size");
		int n = sc.nextInt();
		System.out.println("Enter the array : ");
		int data[] = new int[n];
		for (int i=0;i<n;i++)
		{
		data[i] = sc.nextInt();
		}
		System.out.println("Enter the rotation : ");
		int k = sc.nextInt();
		int[] finalArray = solution(data,k);
		for(int i:finalArray)
		{
			System.out.println(i);
		}
		sc.close();
	
	}
	  public static int[] solution(int[] A, int K) 
	  {
	    int [] rotatedA = new int[A.length];
	   
	    for(int i=0; i<A.length; i++)
	    {
	      //rotated index needs to "wrap" around end of array
	      int rotatedIndex = (i + K) % A.length;

	      rotatedA[rotatedIndex] = A[i];
	    }
	    return rotatedA;
	  }
}