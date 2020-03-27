package singleton;

// Another way of creating singleton class
public class Singleton2 
{
	private static Singleton2 s2 = new Singleton2();
	private Singleton2()
	{}
	
	public static Singleton2 getSingleton2()
	{
		return s2;
	}

}