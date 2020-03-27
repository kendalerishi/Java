package arrayMethods;

import java.util.Arrays;

public class BinarySearch
{
	public static void main(String[] args) 
	{
		int[] array = {1,2,3,4,6,7};
		int key = 7;
		byte[] array1 = {10,20,30,40,60,70};
		byte key1 = 45;
		System.out.println(Arrays.binarySearch(array,key));
		System.out.println(Arrays.binarySearch(array1,key1));
	}
}
