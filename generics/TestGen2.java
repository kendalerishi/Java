package generics;


class MyGen1<T>{

	T obj;
//	MyGen1(){
//		this.obj = obj;			// not required
//	}
	MyGen1(T obj){this.obj = obj;}
	public T get(){
		return obj;
	}
}

public class TestGen2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyGen1<Integer> mg1 = new MyGen1<Integer>(10);
		System.out.println(mg1.get());
		
		
	}

}
