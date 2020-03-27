package factorymethods;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableCollection 
{
	public static void m1()
	{
		List<String> l1 = new ArrayList<String>();
		l1.add("Ram");
		l1.add("Sita");
		l1.add("Shyam");
		l1.add("Geeta");
		List<String> l2 = Collections.unmodifiableList(l1);
		System.out.println(l2);
		System.out.println(String.class.getClass());
		System.out.println(Connection.class.getClass());
		System.out.println(ArrayList.class.getClass());
//	code in Java-9
//	List<list> l12 = List.of("ab","cd","ef","gh");
	}
	public static void main(String[] args) 
	{
		m1();
	}
}
