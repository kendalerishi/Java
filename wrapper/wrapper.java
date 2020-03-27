package wrapper;

public class wrapper {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Integer I1 = new Integer(200);
		int i1 = 100;
		String s1 = "300";
	//	Primitive to string and wrapper
		String s2 = String.valueOf(i1);
		//String s4 = i1.toString();
		//Integer I2 = Integer.valueOf(i1);
		Integer I2=i1;
		System.out.println(I2);
	// 	Wrapper to primitive and string
		//int i2 = I1.intValue();
		int i2=I1;
		System.out.println(i2);
		String s3 = I1.toString();
	//  String to primitive and wrapper	
		int i3 = Integer.parseInt(s1);
		Integer I3 = Integer.valueOf(s1);
		
	}

}
