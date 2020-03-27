package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String[] s1 = {"Ram", "Sita", "Shyam"};
		//String s1[] = new String[] {"Ram", "Sita", "Shyam"};
		List<String> list = Arrays.asList(s1);
		System.out.println("This list is : "+ list);
		
		// we are not creating List object. We are just viewing Array in List format.
		s1[2]="Lakhan";
		System.out.println("This list is : "+ list);
		list.set(2, "Rajesh");
		System.out.println("This list is : "+ list);
		
		//ArrayList<String> al = new ArrayList<String>();
		String[] sa = {"ram","sham","babita"};
		ArrayList<String> al=new ArrayList<String>(Arrays.asList(sa));
		System.out.println(al);
//		String j = Arrays.toString(sa);
//		System.out.println("New string j = "+j);
//		System.out.println(j.charAt(10));
//		for(int i=sa.length-1;i>=0;i--)
//		{
//			System.out.println(sa[i]);
//		}
//		for(int i=j.length()-1;i>=0;i--)
//		{
//			System.out.print(j.charAt(i));
//		}
//		System.out.println("");
		int[] ar = {1,2,3,4,5};
		int[] arr = {1,2,3,4,5,6};
		System.out.println(Arrays.toString(Arrays.copyOf(ar,15)));
		
		
	
	}
}
