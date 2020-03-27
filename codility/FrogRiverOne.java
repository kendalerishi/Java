package codility;

import java.util.HashSet;
import java.util.Scanner;

public class FrogRiverOne 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner((System.in));
		System.out.println("Enter frog distance : ");
		int X = sc.nextInt();
		System.out.println("Enter the array size");
		int n = sc.nextInt();
		System.out.println("Enter the array : ");
		int A[] = new int[n];
		for (int i=0;i<n;i++)
		{
		A[i] = sc.nextInt();
		}
		System.out.println(new FrogRiverOne().solution(X, A));
		
	}
	
	public int solution(int X, int[] A) 
	{
        HashSet set = new HashSet();
        for(int i=0; i < A.length; i++)
        {
            if(A[i] <= X) set.add(A[i]);
            if(set.size() == X) return i;
        }
        return -1;
    }
}
