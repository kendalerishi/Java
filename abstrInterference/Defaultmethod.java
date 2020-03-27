package abstrInterference;

interface Addition
{
	default void add()
	{
		System.out.println("Interface addition method.");
	}

}

public class Defaultmethod implements Addition
{
	

	public void Dm1()
	{
//		Addition ad1 = new Addition(){};
//		ad1.add();
		Addition.super.add();
		add();
		Defaultmethod dmo1 = new Defaultmethod();
		dmo1.add();
		Addition dmo2 = new Defaultmethod();
		dmo2.add();		
	}
//	public void add()
//	{
//		System.out.println("Class addition method.");
//	}
		
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Addition ad1 = new Addition(){};
		ad1.add();
		
		
		
		Defaultmethod dmo = new Defaultmethod ();
		dmo.add();
		

	}

}

class  Defaultmethod2
{

	public void dm2()
	{
		Addition ad1 = new Addition(){};
		ad1.add();
		

	}
}
