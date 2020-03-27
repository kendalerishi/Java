package arrayMethods;

import java.util.Arrays;
import java.util.StringTokenizer;

public class commaSeparatedStringToArray
{
	public static void main(String[] args)
	{
		String csv = "Ram,Sita,Shyam,Geeta";
		String[] strArray = csv.split(",");
		System.out.println(csv);
		System.out.println(Arrays.toString(strArray));
		System.out.println(strArray[3]);
		String s1=" ram";
//		System.out.println(s1.trim());
		
		StringTokenizer st = new StringTokenizer(csv,",");
		while(st.hasMoreElements())
		{
			System.out.println(st.nextToken());
		}

	}
}
