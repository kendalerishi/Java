package arrayMethods;

import java.util.Arrays;

public class ArraySortDEmo
{

	public static void main(String[] args)
	{
		int [] arr = {21,54,1,65,15,8,9,78,13,0};
		int [] arr2 = {21,54,1,65,15,8,9,78,13,0};
		System.out.println(arr.length);
		Arrays.sort(arr);
		System.out.println("Sorted array is :" + Arrays.toString(arr));
		Arrays.sort(arr2,1,5);
		System.out.println("Sorted array from index 1 to 6 ie. 54 to 8 is : " + Arrays.toString(arr2));
	}

}
