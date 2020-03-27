package codility;

import java.util.Scanner;

public class FrogJmp 
{
	public static void main(String[] args) 
	{
	long startTime=System.nanoTime();
	Scanner sc = new Scanner((System.in));
	System.out.println("Enter the current position : ");
	int X = sc.nextInt();
	System.out.println("Enter the position to reach : ");
	int Y = sc.nextInt();
	System.out.println("Enter the distance frog can travel in one jump  : ");
	int D = sc.nextInt();
	int jumpsRequired = new FrogJmp().solution(X, Y, D);
	System.out.println(jumpsRequired);
	} 
	
	public static int solution(int X, int Y, int D) 
	  {
	    int distanceToJump = Y - X;
	    int jumpsRequired = distanceToJump / D;
	    if(distanceToJump % D != 0) 
	    {
	      jumpsRequired++; //only add extra jump if remainder exists
	    }
	    return jumpsRequired;
	  }
}