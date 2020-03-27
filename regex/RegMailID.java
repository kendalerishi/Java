package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegMailID {

	public static void main(String[] args) {
		String x = "rishi@gmail.com";
		System.out.println(x.length());
		validator(x);
	}

	public static void validator(String x){
		Pattern p = Pattern.compile("[a-zA-Z][a-zA-Z0-9.-]{4..}@[a-zA-Z0-9]+.[a-zA-Z]*{15}");
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
