package codility;

import java.util.Arrays;
import java.util.Scanner;

class MissingInteger1 
{
	public static void main(String[] args)
	{
//		Scanner sc = new Scanner(System.in);
//	    System.out.println("Please enter length of String array");
//	    int length = sc.nextInt();
//
//	    // create a String array to save user input
//	    String[] input = new String[length];
//
//	    // loop over array to save user input
//	    System.out.println("Please enter array elements");
//	    for (int i = 0; i < length; i++) 
//	    {
//	      String userInput = sc.next();
//	      input[i] = userInput;
//	    }
	    
	    int[] A = {1,1,2};
		
		MissingInteger1 mi = new MissingInteger1();
		System.out.println(mi.solution(A));
	}
	
    public int solution(int[] A) 
    {
        Arrays.sort(A);
        int res = 1;
        if(A.length == 1 && A[0] != 1) return 1;
        if(A.length == 1 && A[0] == 1) return 2;
        if(A.length > 1 && A[0] > 1) return 1;
        
        for(int i=0; i < A.length; i++)
        {
            if(A[i] > 0 && A[i] < 100001)
            {
                if(i < A.length-1 && A[i+1]-A[i] == 0)
                {
                    res = A[i] + 1;
                } else if(i < A.length-1 && A[i+1]-A[i] == 1)
                {
                    res = A[i+1] + 1;
                } else if(i < A.length-1 && A[i+1]-A[i] > 1)
                {
                    return A[i] + 1;
                }
            }
        }
        return res;
    }
}