package predicate;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int x = sc.nextInt();
		System.out.println("Enter the number to compare : ");
		int y = sc.nextInt();
		Predicate<Integer> P = (I) -> (I>x);
		System.out.println(P.test(y));
		
	}

}
