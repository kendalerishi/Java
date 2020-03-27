package codility;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinaryGap 
{
public static void main(String [] args)
{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		int longestBinaryGap = solution(n);
		System.out.println("Longest binary gap is : "+longestBinaryGap);
}

  public static int solution(int N) 
{
    String binaryString = Integer.toBinaryString(N);
   
    int longestBinaryGap = 0;
    List<Integer> onesList = new ArrayList<Integer>();
   
    for(int i=0; i<binaryString.length(); i++) 
    {
      if(binaryString.charAt(i) == '0') 
    	  continue;
      onesList.add(i);    
    }

    for(int i=0; i<onesList.size() - 1; i++) 
    {
      //subtract 1 so that don't count 1's next to each other as having any gap
      int indicesDiff = onesList.get(i+1) - onesList.get(i) - 1;
     
      longestBinaryGap = Math.max(longestBinaryGap, indicesDiff);
    }
    return longestBinaryGap;
  }
}