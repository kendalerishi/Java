package java8;

import java.util.ArrayList;
import java.util.List;

public class ForEach 
{
	public static void main(String[] args) 
	{
		List<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
//	for(int i:al)
//	{
//		System.out.println(i);
//	}
	al.forEach(i->System.out.println(i));
	al.forEach(System.out::println);
	al.forEach(ForEach::doubleIt);
	}
	
	public static void doubleIt(int i)
	{
		System.out.println(i*i);
	}
}
