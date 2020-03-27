package singleton;

public class Singleton 
{
	private static Singleton s = null;
	private Singleton(){};
	
	public static Singleton getSingleton()
	{
		// this is a factory method
	if(s==null)
	{
		s=new Singleton();
	}
	return s;	
	}
	
	public void output()
	{
		System.out.println("Hi");
	}
}
