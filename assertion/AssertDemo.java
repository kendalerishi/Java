package assertion;

public class AssertDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1 = new Test();
		int x = 10;
		assert(x>20);
		System.out.println(x);
		assert(t1.add(10,20)==40);
		System.out.println(t1.add(10,20));
		
	}
}

class Test{
	public int add(int a, int b){
		return a+b;
	}
}
