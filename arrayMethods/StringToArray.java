package arrayMethods;


public class StringToArray 
{

	public static void main(String[] args)
	{
		String str = "Hello World";
		solution(str);
		System.out.println();
		solution(str);
	}
	
	public static void solution(String data)
	{
		char[] resArray = new char[data.length()];
		for(int i=0;i<data.length();i++)
		{
			resArray[i]=data.charAt(i);
		}
		//System.out.println(resArray);
		for(char c:resArray)
		{
			System.out.print(c);
		}
	}
	
	public static void solution2(String data)
	{
		char[] resArray = new char[data.length()];
		resArray = data.toCharArray();
		for(char c:resArray)
		{
			System.out.print(c);
		}
	}
}