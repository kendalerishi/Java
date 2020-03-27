package regex;

import java.io.File;
import java.util.regex.*;

public class RegFileNames {

	public static void main(String[] args) {
		
		File f = new File("F:\\Eclipse\\PRACT");
		txtFinder(f);
		
	}
	
	public static void txtFinder(File f){
		int count=0;
		Pattern p = Pattern.compile("[a-zA-Z0-9-.$]+.txt");
		String[] listFile = f.list();
		for(String name:listFile)
		{
			Matcher m = p.matcher(name);
			while(m.find())
			{
				count++;
				System.out.println(name);
			}
//			if(m.find()&&m.group().equals(name))
//			{
//				count++;
//				System.out.println(name);
//			}
		}
		System.out.println("Number of text files is : "+count);
	}
}
