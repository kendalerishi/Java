package classProperties;

import java.lang.reflect.Field;
class Test
{
	int age =0;
	String name = "Ram"; 
//	int age;
//	String name;
}

public class ClassFields extends Test
{
	public static void main(String[] args) throws ClassNotFoundException , NoSuchFieldException
	{
		//Test t = new Test();
		System.out.println("Hello");
	    Class cls = Class.forName("Test");
	    Field field1 = cls.getField("age");
	    System.out.println(field1);
	    Field[] field = cls.getFields();
	    for(Field f:field)
	    {
	    	System.out.println("Hi");
	    	System.out.println(f);
	    }
	}

}
