package singleton;

import java.util.Date;

public class RuntimeFactoryMethod 
{
	public static void main(String[] args) 
	{
		Runtime r = Runtime.getRuntime();
		System.out.println("Total  "+ r.totalMemory());
		System.out.println("Free   "+r.freeMemory());
		for(int i=0;i<10000;i++)
		{
			Date d = new Date();
			d=null;
		}
		System.out.println("New Free 1  "+r.freeMemory());
		r.gc();
		System.out.println("New Free   "+r.freeMemory());
	}
	

}
