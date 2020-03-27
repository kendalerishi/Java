package vararg;

import java.util.ArrayList;

public class HeapPollution 
{
	@SafeVarargs
	public static void display(ArrayList<String>...pr)
	{
		for(ArrayList<String> x:pr)
		{
		System.out.println(x);
		}
	}
	
	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("Raj");
		al.add("Rama");
		display(al);
	}

}
