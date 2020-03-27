package validation;

import java.util.function.Predicate;

public class Validation {
	public static void main(String[] args)
	{
		long l = System.nanoTime();
		System.out.println();
		String data = "rishismile";
		Validation1 v1 = new Validation1();
		System.out.println(v1.usernamevalidator(data));
		System.out.println(System.nanoTime()-l);
	}
	
    public boolean usernamevalidator(String data)
	{
    	Predicate<String> p = data1 -> (data1.length() >=5 && data1.length() <=10);
    	p.test(data);
//		if(!(data.length() >=5 && data.length() <=10))
//		{
//			return false;
//		}
		
		for(int i=0;i<data.length();i++)
		{
			int asciivalue = data.charAt(i);
			
			if(i==0)
			{
				if(!(asciivalue >=65 && asciivalue <=90) && !(asciivalue >=97 && asciivalue <=122)) 	
				{
					return false;
				}
			}
			if(!(asciivalue >=65 && asciivalue <=90)  && !(asciivalue >=97 && asciivalue <=122) && !(asciivalue >=48 && asciivalue <=57) && (asciivalue!=46) && (asciivalue!=45) && (asciivalue!=95)) 
			{
				return false;
			}
		}
		return true;
	}
    public boolean emailvalidator(String data)
    {
        
        int atindex = data.indexOf("@"); 
        int dotindex= data.indexOf(".");

        if(atindex < 0 )
        {
            return false;
            //System.out.println("@ sign does not exist");
        }
                
        /*if(dotindex < atindex )
        {
            return false;
            //System.out.println("dot is before @ sign");
        }*/
        String com = data.substring(dotindex + 1);
        
        if(!(com.equals("com")))
        {
            //System.out.println("string not end with com=="+com);
             return false;
        }
        String username = data.substring(0, atindex);
        if(!(username.length() >=5 && username.length() <=10))
        {
            return false;
            //System.out.println("length in between 5 to 10  =>1");
        }
        for(int i=0;i< username.length() ; i++)
        {
            int asciivalue = username.charAt(i);
            if(i==0)
            {
                if(!(asciivalue >=97 && asciivalue <=122) && !(asciivalue >=65 && asciivalue <=90))     
                {
                    return false;
                    //System.out.println("first character must be alphabet 1");
                }
            }
	    else
            {
		if(!(asciivalue >=65 && asciivalue <=90)  && !(asciivalue >=97 && asciivalue <=122) && !(asciivalue >=48 && asciivalue <=57) && (asciivalue!=46) && (asciivalue!=45) && (asciivalue!=95)) 
		{
			return false;
			//System.out.println("incorrext condition");
		}
            } 
        }
        String domainname = data.substring(atindex+1, dotindex);

        if(!(domainname.length() >=5 && domainname.length() <=10))
        {
            return false;
            //System.out.println("length in between 5 to 10 = >2");
        }
        for(int i=0;i< domainname.length() ; i++)
        {
            int asciivalue = domainname.charAt(i);
            
            if(i==0)
            {
		if(!(asciivalue >=97 && asciivalue <=122) && !(asciivalue >=65 && asciivalue <=90))     
                {
                    return false;
                    //System.out.println("first character must be alphabet 1");
                }
            }
            else
            {
                if(!(asciivalue >=65 && asciivalue <=90)  && !(asciivalue >=97 && asciivalue <=122) && !(asciivalue >=48 && asciivalue <=57)) 
		{
			return false;
			//System.out.println("incorrext condition");
		}
            }
        }

        return true;
    }
   public boolean datevalidator(String data)
    {
	if(!(data.length() ==10))
	{
		return false;
	}
	for(int i=0;i<data.length();i++)
	{
		int asciivalue = data.charAt(i);
			//System.out.println(asciivalue+"====");
		if(i==2 || i==5)
		{	
                    int asciivalue2 = data.charAt(2);
                    if(!(asciivalue ==47 || asciivalue ==92 || asciivalue ==46 || asciivalue ==45)) 	
                    {
			//System.out.println("incorrect symbol");
                        return false;
                    }
                    else if( asciivalue2  != asciivalue && i==5)
                    {
			//System.out.println("not match 2nd symbol with 5th");
			return false;	
                    }
		}
		else if(!(asciivalue >=48 && asciivalue <=57))
		{
				//System.out.println("not number");	
				return false;
		}
			
	}
		return true;
    }
    public boolean passwordValidation(String password,String confirmPassword)
    {
        if(password.equals(confirmPassword))
        {
            return true;
        }
        return false;
    }
   
}
