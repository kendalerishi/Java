package collection;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch 
{
	public static void main(String[] args) 
	{  
        //Create list         
          ArrayList<Integer> arrlist = new ArrayList<Integer>();  
          arrlist.add(10);  
          arrlist.add(-20);  
          arrlist.add(30);  
          arrlist.add(-40);  
          arrlist.add(50);  
          //Print List  
          System.out.println("Provided List are: "+arrlist);  
          //Search the list for key '-20'
//          Collections.sort(arrlist,Collections.reverseOrder());
//          System.out.println(arrlist);
          int index = Collections.binarySearch(arrlist, -20,  Collections.reverseOrder());       
          System.out.println("Index '-20' is available at position: "+index); 
	}
}
