package vararg;

import java.util.ArrayList;

public class VarArg 
{
	public static void m1()
	{
		Integer i =100;
		String s1 = String.valueOf(i);
		
	}
	
	public static void sum(int... x)     // or sum(int[] x) anyone will work
	{
		int sum=0;
		for(int i=0;i<x.length;i++)
		{
			sum=sum+x[i];
		}
		System.out.println(sum);
	}

	public static void main(String[] args) 
	{
		sum();
		sum(10);
		sum(10,20);
		sum(10,20,30);
		sum(10,20,30,40);
	}
}
