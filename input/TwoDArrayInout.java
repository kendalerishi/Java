package input;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrayInout 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number of rows and columns : ");
		int rows = sc.nextInt();
		int columns = sc.nextInt();
		int[][] age = new int[rows][columns];
		System.out.println("Please enter array elements : ");
	for(int i=0;i<rows;i++)
	  {	
		for(int j=0;j<columns;j++)
		{
			age[i][j]=sc.nextInt();
		}
	  }	
	// print the array
	for (int i = 0; i < age.length; i++) 
        // Loop through all elements of current row 
        for (int j = 0; j < age[i].length; j++) 
            System.out.print(age[i][j] + " "); 
	}
}
