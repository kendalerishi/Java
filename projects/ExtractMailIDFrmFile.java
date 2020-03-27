package projects;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractMailIDFrmFile {

	public static void main(String[] args) throws IOException{
		mobileNo(new File("Data.txt"));
		mailID(new File("Data.txt"));
		
	}
	
	public static void mobileNo(File f){
		try{
//			File f = new File("Mobile.txt");	
//			f.createNewFile();
//			System.out.println(f.exists());
			PrintWriter out = new PrintWriter("Mobile.txt");
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
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
//						System.out.println(m.group());
					}
					line=br.readLine();
				}
//				System.out.print("Total mobile numbers found : "+count);
				out.print("Total mobile numbers found : "+count);
				out.flush();
				br.close();
			}
			catch(IOException ie){
				ie.printStackTrace();
			}		
	}	
	
	public static void mailID(File f){
		try{
//			File f = new File("Mobile.txt");	
//			f.createNewFile();
//			System.out.println(f.exists());
			PrintWriter out = new PrintWriter("MailID.txt");
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			int count=0;
			Pattern p = Pattern.compile("[a-zA-Z][a-zA-Z0-9.-]{4}@[a-zA-Z0-9]+.[a-zA-Z]*{15}");
			String line = br.readLine();
				while(line!=null)
				{
					Matcher m = p.matcher(line);
					while(m.find())
					{
						count++;
						out.println(m.group());
//						System.out.println(m.group());
					}
					line=br.readLine();
				}
//				System.out.print("Total mail IDs found : "+count);
				out.print("Total mail IDs found : "+count);
				out.flush();
				br.close();
			}
			catch(IOException ie){
				ie.printStackTrace();
			}		
	}	
}