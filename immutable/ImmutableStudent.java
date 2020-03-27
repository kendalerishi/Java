package immutable;

public final class ImmutableStudent 
{
    private final int id;
    private final String name;
    public ImmutableStudent(int id, String name) 
    {
        this.name = name;
        this.id = id;
    }
    public int getId() 
    {
        return id;
    }
    public String getName() 
    {
        return name;
    }
    
    public static void main(String[] args) 
	{
    	ImmutableStudent is1 = new ImmutableStudent(10,"Ram");
    	ImmutableStudent is2 = new ImmutableStudent(11,"sita");
    	ImmutableStudent is3 = new ImmutableStudent(10,"Ram");
//    	is1.id=50;    	
    	ImmutableStudent is4 =is1;
    	System.out.println(is1==is2);
    	System.out.println(is1==is3);
    	System.out.println(is1.equals(is2));
    	System.out.println(is1.equals(is3));
    	System.out.println(is1==is4);
    	System.out.println(is1.equals(is4));
    	
	}
}
