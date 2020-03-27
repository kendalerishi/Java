package abstrInterference;

abstract class Abstract1 
{
	Abstract1(){System.out.println("DEF");};
	private static String a1()
	{return "Hi a1";}
	
	abstract void a2();
	/*{
		
	}
	*/
	public static String goa(){System.out.println("Goa1");return "goa";}
	
}

public class AB extends Abstract1 
{
	AB(){super.goa();
		 this.goa();
		}
	
	public static String goa(){System.out.println("Goa2");return "jik";}
	void a2(){}
	//public void a3(){ System.out.println("Hji");}
	
	public static void main(String[] args)
	{
		AB ab = new AB();
		
		//goa();
		//System.out.println(goa());
		
	}	
}