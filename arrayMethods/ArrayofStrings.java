package arrayMethods;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayofStrings
{

	public static void main(String[] args)
	{
		String[] data = {"Ram,1,Pune,Eng,1000","Sita,2,Mumbai,Test,2000","Geeta,3,Latur,Eng,3000","Shyam,4,Goa,Test,4000",
				"Babita,5,Jammu,Eng,5000"};
		//System.out.println(data.length);
		solution(data);
	}
	
	public static void solution(String[] data)
	{
		String[] name=new String[data.length];
		int[] id=new int[data.length];
		String[] dept=new String[data.length];
		String[] city=new String[data.length];
		int[] sal=new int[data.length];
		for(int i=0;i<data.length;i++)
		{
		name[i] = (data[i].split(","))[0];
		id[i] = Integer.parseInt((data[i].split(","))[1]);
		city[i] = (data[i].split(","))[2];
		dept[i] = (data[i].split(","))[3];
		sal[i] = Integer.parseInt((data[i].split(","))[4]);
		}
		System.out.println("Name"+"\t"+"Id"+"\t"+"City"+"\t"+"Dept"+"\t"+"Sal");
		for(int i=0;i<data.length;i++)
		{
		System.out.println(name[i]+"\t"+id[i]+"\t"+city[i]+"\t"+dept[i]+"\t"+sal[i]);	
		}
		ArrayList alName = new ArrayList<String>(Arrays.asList(name));
//		for(String s:name)
//		{
//			System.out.println(s);
//		}
//		for(int s:id)
//		{
//			System.out.println(s);
//		}
//		for(String s:city)
//		{
//			System.out.println(s);
//		}
//		for(String s:dept)
//		{
//			System.out.println(s);
//		}
//		for(int s:sal)
//		{
//			System.out.println(s);
//		}
	}
}