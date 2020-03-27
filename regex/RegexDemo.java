package regex;
import java.util.Scanner;
import java.util.regex.*;

public class RegexDemo 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the mobile number : ");
//		String smob = sc.nextLine();
//		System.out.println("Enter the pattern to find : ");
//		String spat = sc.nextLine();
//		Pattern p = Pattern.compile(spat);
//		Matcher m = p.matcher(smob);
//		Matcher m = p.matcher("a0B9b@Xr#_7kT%");
//		Matcher m = p.matcher("abcdefghijklmnopqrstuvwxyzabcdrfjklmn");
//		
//		int count=0;
//		System.out.println("start"+"\t"+"ends"+"\t"+"Group");
//		while(m.find())
//		{
//			count++;
//			System.out.println(m.start() +"\t"+m.end()+"\t"+m.group());
//		}
//		System.out.println("No. of occurrence : "+ count);
		System.out.println(Pattern.matches("[amn]+", "aa"));
		System.out.println(Pattern.matches("[amn]?", "a"));//true (a or m or n comes one time)  
		System.out.println(Pattern.matches("[amn]?", "aaa"));//false (a comes more than one time)  
		//System.out.println(p.pattern());
	}

}
