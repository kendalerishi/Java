package abstrInterference;


interface Addition1
{
	static void add1()
	{
		System.out.println("Interface addition method.");
	}
	public default void m2()
	{
		
	}

}

public class StaticMethod implements Addition1
{

	public void Sm1()
	{
		//add1();		// CE
	Addition1.add1();
	StaticMethod st = new StaticMethod();
	//st.add1();   // CE
	Addition1 ad1 = new StaticMethod();
	//ad1.add1();   //CE
	//Addition1.super.add1();       // CE 
	Addition1 ad2 = new Addition1(){};
	// ad2.add1();    //CE
	}

	public void add1()
	{
		System.out.println("Class addition method.");
	}
		
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	//add1();		// CE
	Addition1.add1();
	StaticMethod st = new StaticMethod();
	//st.add1();   // CE
	Addition1 ad1 = new StaticMethod();
	//ad1.add1();   //CE
	//Addition1.super.add1();       // CE 
	Addition1 ad2 = new Addition1(){};
	//ad2.add1();    // CE
	}

}
 class B
 {
	 public void m()
	 {
	 Addition1 ad2 = new Addition1(){};
	 ad2.m2();
	 // ad2.add1();   // CE
	 Addition1.add1();
	 
	 }
	 
	 public static void main(String[] args)
		{
		 Addition1 ad2 = new Addition1(){};
		 ad2.m2();
		 Addition1.add1();
		}
}
	 
