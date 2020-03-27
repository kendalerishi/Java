package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
//import java.util.*;
import java.util.Set;
import java.lang.*;

public class HashMapDemo
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "Ram");
		hm.put(2, "Sita");
		hm.put(3, "Shyam");
		hm.put(4, "Geeta");

		System.out.println(hm);
		
		hm.put(1, "Rama");
		
		System.out.println(hm);
		System.out.println(hm.get(3));
		
		Set s = hm.keySet();
		System.out.println(s);
		
		Collection c = hm.values();
		System.out.println(c);
		
		Set se = hm.entrySet();
		System.out.println(se);
		
		Iterator itr = se.iterator();
		//Entry me;
		while(itr.hasNext())
		{
			Map.Entry me = (Map.Entry)itr.next();
		//	me = (Entry)itr.next();
			System.out.println(me.getKey() + "........."+me.getValue());
				if(me.getKey().equals("1"))
					{
					  me.setValue("Ram");
					}
		}
		System.out.println(hm);
	}

}