package arrayMethods;

public class ArrayPrintingDemo 
{

	public static void main(String[] args) 
	{
	
	}
	
	public static void regPrint(int[] data)
	{
		for(int i=0;i<data.length;i++)
		{
			System.out.println(data[i]);
		}
	}
	
	public static void enhancedPrint(int[] data)
	{
		for(int i : data)
		{
			System.out.println(i);
		}
	}
}
