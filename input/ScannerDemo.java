package input;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//System.out.println("Enter number and name : ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name and number: ");
		String name = sc.nextLine();
		int num = sc.nextInt();
//		System.out.println("Enter name : ");
		System.out.println(name);
		System.out.println(num);
	}

}
