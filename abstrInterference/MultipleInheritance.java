package abstrInterference;

interface Left
{
	default void m1()
	{
		System.out.println("Left : m1()");
	}
}

interface Right
{
	default void m1()
	{
		System.out.println("Right : m1()");
	}
}

public class MultipleInheritance implements Left,Right
{
	public void m1()
	{
		System.out.println("MultipleInheritance : m1()");
	}
	
	public void m2()
	{
		m1();
		MultipleInheritance MI1 = new MultipleInheritance();
		Left l1 = new MultipleInheritance();
		Right r1 = new MultipleInheritance();
		Left l2 = new Left(){};
		Right r2 = new Right(){};
		MI1.m1();
		MI1.m2();
		l1.m1();
		// l1.m2();    // CE
		r1.m1();
		//r1.m2();       // CE
		l2.m1();
		r2.m1();
		Left.super.m1();
		Right.super.m1();
	
	
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// m1();            // CE
		MultipleInheritance MI1 = new MultipleInheritance();
		Left l1 = new MultipleInheritance();
		Right r1 = new MultipleInheritance();
		Left l2 = new Left(){};
		Right r2 = new Right(){};
		MI1.m1();
		MI1.m2();
		l1.m1();
		// l1.m2();    // CE
		r1.m1();
		//r1.m2();       // CE
		l2.m1();
		r2.m1();

	}

}
