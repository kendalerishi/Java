package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ReadingArrayList 
{

	public static void main(String[] args) 
	{
		ArrayList data = new ArrayList();
		data.add(12);
		data.add("Ram");
		data.add(25);
		data.add(true);
		
		// Reading arraylist mathod --- 1
		System.out.println(data);
		
		// Reading arraylist mathod --- 2 -- separate elements
		for(int i=0;i<data.size();i++)
		{
			System.out.println(data.get(i));
		}
		
		System.out.println("Iterator -----");
		// Reading arraylist mathod --- 3 -- Iterator
		Iterator ir = data.iterator();
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}		
	}
}
