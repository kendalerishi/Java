package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo
{
	public static void main(String[] args) 
	{
		List<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(5);
		al.add(40);
		al.add(13);
		Collections.sort(al);
		System.out.println(al);
		Collections.sort(al,new MyComparator());
		System.out.println(al);
	}
}

class MyComparator implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		Integer i1 = (Integer)obj1;
		Integer i2 = (Integer)obj2;
		return -i1.compareTo(i2);
	}
}
