package abstrInterference;

abstract class C 
{
	abstract int a1();
	abstract int a3();
	void a4()
	{}
}

abstract class A extends C
{
	abstract int a2();
	int a1()
	{
		return 10;
	}
	
	int a3()
	{
		return 10;
	}
	
	abstract void a4();
}

class Abstract2 extends A
{
	
int a2()
{
	System.out.println("Hi");
	return 0;}
void a4()
{}

/*void a1()
{}*/

public static void main(String[] args)
{
	Abstract2 b1 = new Abstract2();
	b1.a3();
}

}
