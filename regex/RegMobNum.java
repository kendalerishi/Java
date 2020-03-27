package regex;

import java.util.regex.*;

public class RegMobNum {

	public static void main(String[] args) {
	
		validator("919850767571");
		validator("6850767571");
		validator("08507675712");
	}

	public static void validator(String x){
		Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}");
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
