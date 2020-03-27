package immutableVsFinal;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

public class ImmutableVsFinal {

	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add(10);
		al.add("Raj");
		al.add(20);
		al.add("Ravi");
		System.out.println(al);
		//ArrayList al1 = Collections.unmodifiableList(al);
		
		
	}

}
