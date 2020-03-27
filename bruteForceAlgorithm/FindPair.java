package bruteForceAlgorithm;

import java.util.HashSet;
import java.util.Set;

public class FindPair 
{
	private static class Pair {
        public int x;
        public int y;
 
        @Override
        public String toString() {
            return "[x = " + x + ", y=" + y + "]";
        }
    }
	public static void main(String[] args) {
		 
	    int[] a = {4, 9, 0, 34, 7, 22, 3, 10, 1, 5, 12, 55, 89, 32, 53, 62};
	    int target = 111;
	    Pair result = new Pair();
	    Set<Integer> set = new HashSet<Integer>();
	 
	    for (int i = 0; i < a.length; i++) {
	 
	        if (set.contains(target - a[i])) {
	            result.x = target - a[i];
	            result.y = a[i];
	            break;
	        }
	        set.add(a[i]);
	 
	    }
	 
	    System.out.println("pair = [" + result + "]");
	}

}
