package projects;

import java.io.*;
import java.util.regex.*;

public class ExtractMobFrmFile {

	public static void main(String[] args) {
		
		try{
		FileReader fr = new FileReader("Data.txt");
		BufferedReader br = new BufferedReader(fr);
		File f = new File("Mobile.txt");	
		f.createNewFile();
		//System.out.println(f.exists());
		PrintWriter out = new PrintWriter(f);
		int count=0;
		Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}");
		String line = br.readLine();
			while(line!=null)
			{
				Matcher m = p.matcher(line);
				while(m.find())
				{
					count++;
					out.println(m.group());
//					System.out.println(m.group());
				}
				line=br.readLine();
			}
//			System.out.print("Total mobile numbers found : "+count);
			out.print("Total mobile numbers found : "+count);
			out.flush();
			br.close();
		}
		catch(IOException ie){
			ie.printStackTrace();
		}
	}
	
	

}
