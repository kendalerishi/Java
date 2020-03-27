package arrayMethods;

import java.util.Arrays;

public class ContainsInArray 
{
	public static void main(String[] args) 
	{
		Integer[] array = {1,2,3,4,6,7};
		int key = 7;
		String[] array2= {"ab","cd","ef"};
		String key2 = "ab";
		System.out.println(Arrays.asList(array).contains(key));
		System.out.println(Arrays.asList(array2).contains(key2));
	}
}