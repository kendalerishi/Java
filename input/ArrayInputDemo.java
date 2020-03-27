package input;

import java.util.Scanner;

public class ArrayInputDemo 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter array size : ");
		int s = sc.nextInt();
		int[] age = new int[s];
		System.out.println("Please enter array elements : ");
		for(int i=0;i<age.length;i++)
		{
			age[i]=sc.nextInt();
		}
		sc.close();
			
	}

}
