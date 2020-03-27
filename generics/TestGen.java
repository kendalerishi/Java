package generics;

class MyGen<T>{
	T obj;
	static int count;
	{
		count++;
	}
	void add(T obj)
	    {
			this.obj=obj;
		}
	T get(){
		return obj;
	}
}
public class TestGen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyGen<Integer> mg = new MyGen<Integer>();
//		mg.add(10);
//		System.out.println(mg.obj);
//		mg.add(20);
//		System.out.println(mg.obj);
		mg.add(30);
//		mg.add("Ram");
		System.out.println(mg.obj);
		System.out.println(mg.get());
		MyGen<String> mg1 = new MyGen<String>();
		mg1.add("Ram");
		System.out.println(mg1.obj);
		System.out.println("No. of objects created : "+ mg.count);
		
		
	}

}
