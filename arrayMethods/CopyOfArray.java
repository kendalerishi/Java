package arrayMethods;

import java.util.Arrays;

public class CopyOfArray
{
	public static void main(String[] args) 
	{
		int[] array1 = {1,2,3,4,5};
		System.out.println(Arrays.copyOf(array1,10));
		System.out.println(Arrays.toString(Arrays.copyOf(array1, 10)));
		System.out.println(Arrays.toString(Arrays.copyOf(array1, 3)));
		int[] x = Arrays.copyOf(array1, 5);
		System.out.println(Arrays.toString(x));
	}

}
