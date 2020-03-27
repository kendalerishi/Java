package arrayMethods;

public class LinearSearch 
{

	public static void main(String[] args) 
	{
		int[] array = {1,2,3,4,6,7};
		int key = 7;
		int key1 = 14;
		System.out.println(solution(array, key));
		System.out.println(solution(array, key1));
	}
	
	public static String solution(int[] array, int key)
	{
		for(int i : array)
		{
			if(i==key)
			return ("Key found at : "+i);	
		}
		return ("Key not found.");
	}

}
