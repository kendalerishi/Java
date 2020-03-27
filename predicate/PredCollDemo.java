package predicate;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class PredCollDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of arraylist: ");
		int x = sc.nextInt();
//		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList al = new ArrayList();
		System.out.println(al.size());
		System.out.println("Enter the arraylist elements: ");
		for(int i=0;i<x;i++)
		{
//			System.out.println("Hi1");
			int y = sc.nextInt();
			al.add(y);
//			System.out.println("Hi");
		}
//		System.out.println(al);
	
		Predicate<ArrayList> p = arl -> arl.isEmpty();
		System.out.println(p.test(al));
		
	}

}
