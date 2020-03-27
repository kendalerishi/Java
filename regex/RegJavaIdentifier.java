package regex;

import java.util.regex.*;

public class RegJavaIdentifier {

	public static void main(String[] args) {
		validator("Ashok");
		validator("Ashok-");
		validator("=Ashok");
		validator("?Ashok");
	}

	public static void validator(String x){
		
		Pattern p = Pattern.compile("[a-zA-Z][a-zA-Z0-9-#]+");
		Matcher m = p.matcher(x);
		if(m.find()&&m.group().equals(x))
		{
			System.out.println("Valid");
		}
		else
		{
			System.out.println("Invalid");
		}
	}
	
}
