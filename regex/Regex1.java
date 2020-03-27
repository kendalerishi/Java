package regex;

import java.util.regex.*;

public class Regex1 {

	public static void main(String[] args) {
//		
//		String x = "ab";
//		String y = "ababdfabbbab";
		String s1 = "I love India";
		validate("ab", "ababbdaabab");	
		
		String[] s = s1.split("\\s");
		for(String x:s)
		{	System.out.println(x);}
	}
	
	public static void validate(String x , String y) {
		
		Pattern p = Pattern.compile(x);
		Matcher m = p.matcher(y);
		while(m.find()){
			System.out.println(m.start()+ " " + m.group());
			}
	}

	
}
