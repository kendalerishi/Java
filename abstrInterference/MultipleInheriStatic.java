package abstrInterference;

interface Left1
{
	static void m1()
	{
		System.out.println("Left : m1()");
	}
}

interface Right1
{
	static void m1()
	{
		System.out.println("Right : m1()");
	}
}

public class MultipleInheriStatic
{

	public static void m1(){}
	public void a1()
	{
		Left1.m1();
		Right1.m1();
		
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

}
