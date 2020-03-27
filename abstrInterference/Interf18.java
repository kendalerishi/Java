package abstrInterference;

interface x 
{
	default void a1()
	{
		System.out.println("def-a1-x");
	}
	
	static void a2()
	{
		System.out.println("stat-a2");
	}
	public static void m1(){}
}
interface y 
{
	default void a1()
	{
		System.out.println("def-a1-y");
	}
	
	static void a2()
	{
		System.out.println("stat-a2");
	}
}

public class Interf18 implements x,y
{
	
	public void a1()
	{
		a1();
		Interf18 i1 = new Interf18();
		i1.a1();
		x.super.a1();
		x.a2();
		x.super.a1();
		y.super.a1();
	}
	public void m1(){}
	public static void main(String[] args)
	{
		Interf18 i1 = new Interf18();
		i1.a1();
		x.a2();
		y.a2();
	
	}
}

class Z implements x
{
	public void a1()
	{
		
	}
	void a4()
	{
		x x1 = new x(){};
		
	}
}
class DF
{
	void d()
	{
		x x1 = new x(){};
		x1.a1();
	}
	public static void main(String[] args)
	{
		// x o1 = new x();				// Cannot instantiate the type x
		DF d1 = new DF();
		x.a2();
		x x1 = new x(){};
		x1.a1();
	}
}