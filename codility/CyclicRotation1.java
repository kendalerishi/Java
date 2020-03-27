package codility;

import java.util.Scanner;

public class CyclicRotation1 
{
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner((System.in));
		System.out.println("Enter the array size");
		int n = sc.nextInt();
		System.out.println("Enter the array : ");
		int data[] = new int[n];
		for (int i=0;i<n;i++)
		{
		data[i] = sc.nextInt();
		}
		int[] finalArray = cyclicRotation(data);
		for(int i:finalArray)
		{
			System.out.println(i);
		}

	}
	
	public static int[] cyclicRotation(int[] data)
	{
		Scanner sc = new Scanner((System.in));
		System.out.println("Enter the rotation : ");
		int k = sc.nextInt();
		for(int j=0; j<=k;j++)
		{
			for(int i=0;i<data.length;i++)
			{
				if(i == data.length-1)
				{
					data[data.length-1]=data[0];
				}
				else
				{
					int x= data[i+1];
					data[i+1]=data[i];
				}
			}
		}
		return data;
	}
}