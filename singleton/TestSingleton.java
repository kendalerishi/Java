package singleton;

public class TestSingleton 
{
	public static void main(String[] args) 
	{
		Singleton t = Singleton.getSingleton();
		Singleton t1 = Singleton.getSingleton();
		System.out.println(t.equals(t1));
		System.out.println(t==t1);
		t.output();
		t1.output();
		System.out.println(t.hashCode());
		System.out.println(t1.hashCode());
	}

}
