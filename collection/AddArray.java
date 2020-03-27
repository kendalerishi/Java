package collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class AddArray 
{
	public static void main(String[] args) 
	{
		Integer [] array= {1,2,3,4,5,6,7};
		Set<Integer> set = new HashSet<Integer>();
		Collections.addAll(set,array);
		System.out.println(set);
		Iterator ir = set.iterator();
		System.out.println(set);
		while(ir.hasNext())
		{
			System.out.print(ir.next());
		}
	}
}