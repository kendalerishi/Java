package immutable;

final class ImmutableDemo 
{	
	private final int age;
	
	ImmutableDemo(int age)
	{
		this.age=age;
	}
	
	public ImmutableDemo test(int age)
	{
		if(this.age==age)
			return this;
		else
			return (new ImmutableDemo(age));
	}
		
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		ImmutableDemo im1 = new ImmutableDemo(10);
		ImmutableDemo im2 = new ImmutableDemo(20);
		ImmutableDemo im3 = new ImmutableDemo(10);
		ImmutableDemo im4 = im1.test(10);
		System.out.println(im1==im2);
		System.out.println(im1==im3);
		System.out.println(im1==im4);
		System.out.println(im4.age);
		System.out.println(im1.age);
		System.out.println(im1==im4);
		System.out.println(im4.age);
	}

}
