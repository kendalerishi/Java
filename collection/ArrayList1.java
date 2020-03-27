package collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayList1 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(4);
		al.add(7);
		al.add(2);
		al.add(3);
		ArrayList<Integer> all = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		ArrayList al1 = new ArrayList();
		al1.add(10);
		al1.add(0);
		al1.add(0);
		al1.add(1);
		//al1.addAll(1,al);
		//System.out.println(al.removeAll(al1));
		//al.clear();
		//al.retainAll(al1);
//		System.out.println(al);
		System.out.println(al1);
//		System.out.println(al.contains(1));
//		System.out.println(al1.size());
//		//object[] objects = al.toArray();
//		
		Integer[] al2 = al.toArray(new Integer[al.size()]);
		for(int i=0;i<al2.length;i++)
		{
			System.out.print(al2[i]);
		}
//		int[] al3 = new int[al2.length];
////		System.out.println( );
////		System.out.println("al3 is :"+Arrays.toString(al2));
//		for(int i=0;i<al2.length;i++)
//		{
//			al3[i]=al2[i].intValue();
//		}
//		System.out.println( );
//		System.out.println("al3 is :");
//		for(int i=0;i<al2.length;i++)
//		{
//			System.out.print(al3[i]);
//		}
//		
//		Object[] al4 = al1.toArray();
//		System.out.println();
//		System.out.println("Elements of al4 as Array: "+ Arrays.toString(al4)); 
		
		Integer[] i1 = new Integer[al.size()];
		i1=al.toArray(i1);
		for(int i=0;i<i1.length;i++)
		{
			System.out.println(i1[i]);
		}
//		System.out.println(al);
		Collections.copy(al,all);
		System.out.println(al);
		System.out.println(al1);
		System.out.println(Collections.max(al));
		Collections.replaceAll(al,20, 200);
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);
		Collections.reverseOrder();
		System.out.println(al);
//		Collections.sort(al,Collections.reverseOrder());
//		System.out.println(al);
		Comparator comp =Collections.reverseOrder(null);
		Collections.sort(al,comp);
		System.out.println(al);
	}
	
	
}
