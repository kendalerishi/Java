package arrayMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PairSearch {
	
	public int x;
	public int y;
		 
	     @Override
	     public String toString() {
	     return "[x = " + x + ", y=" + y + "]";
	     }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {4, 9, 0, 34, 7, 22, 3, 10, 1, 5, 12, 55, 89, 32, 53, 62};
	    int target = 111;
//	    Integer[] a1 = 
	    
	    PairSearch result = new PairSearch();
	    Set<Integer> set = new HashSet<>();
	    List al = new ArrayList(Arrays.asList(a));
	    Set s1 = new HashSet(Arrays.asList(a));
	    for(int i=0;i<a.length;i++)
	    {
	    	set.add(Integer.valueOf(a[i]));
	    }
	    System.out.println(set);
	    System.out.println(s1);
	    System.out.println(al);
	    Iterator ir = s1.iterator();
	    while(ir.hasNext())
	    {
	    	System.out.println(ir.next());
	    }
	    
	    for(int i=0;i<set.size();i++)
	    {	
//	    if(set.contains(target-a[i]))
//	    	{
//	    		result.x = target-a[i];
//	    		result.y = a[i];
//	    		break;
//	    	}
//	    }
	    if(s1.contains(target-a[i]))
    	{
    		result.x = target-a[i];
    		result.y = a[i];
    		break;
    	}
    }
//	    List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());
System.out.println(result);	
	}
}
