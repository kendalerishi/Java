package codility;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter frog distance :");
		int x = sc.nextInt();
		System.out.println("Please enter array size :");
		int n = sc.nextInt();
		int[] A = new int[n];
		System.out.println("Please enter array :");
			for(int i=0;i<n;i++)
			{
				A[i]=sc.nextInt();
			}
			int y =solution(x,A); 
			if(y>=0)
				System.out.println(y);
			else
				System.out.println("Invalid Input");
	}

	public static int solution(int x, int[] A){
	
		Set perSet = new HashSet();
		Set reqSet = new HashSet();
		for(int i=1;i<=x;i++)
		{
			reqSet.add(i);
		}
		
		for(int p=0;p<A.length;p++)
		{
			perSet.add(A[p]);
			if(perSet.size()<reqSet.size())
				continue;
		
			if(perSet.containsAll(reqSet))
				return p;
		}
		return -1;
		
	}
	
}
