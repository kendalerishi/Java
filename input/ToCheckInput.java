package input;

import java.util.Scanner;

public class ToCheckInput 
{

	public static void main(String[] args) 
	{
		int num;
		Scanner sc = new Scanner(System.in);
	  while(true)
	  {  
		System.out.println("Please enter positive integer : ");
		num = sc.nextInt();
		if(num<0)
			System.out.println("Please enter positive number.");
		else
			break;
	  }
	  sc.close();
	}

}