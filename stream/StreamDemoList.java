package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(15);
		al.add(25);
		al.add(35);
		List<Integer> alOdd = al.stream().filter(I->I%2!=0).collect(Collectors.toList());  // adds only those objects which fulfil condition
		System.out.println(alOdd);
		al.forEach(x->System.out.println(x));
		List<Integer> alsquare = al.stream().map(I->I*I).collect(Collectors.toList()); // add all objects after calculation
		System.out.println(alsquare);
//		List<Integer> al2Elements = al.stream().flatMap(I->Stream.of(I*I,I*I*I)).collect(Collectors.toList());
		
	}

}
