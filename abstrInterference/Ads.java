package abstrInterference;

import java.io.FileReader;
import java.util.*;

public class Ads 
{
	public static ArrayList<String> data()
	{
		int[] array = new int[4];
		String s1=("12, Ram, Eng, 1200");
		String s2=("08, Sita, Test, 800");
		String s3=("11, Shyam, Eng, 1900");
		String s4=("05, Gita, Test, 350");
		ArrayList<String> inputData = new ArrayList<String>();
		inputData.add(s1);
		inputData.add(s2);
		inputData.add(s3);
		inputData.add(s4);
		return inputData;
	}

	public static void main (String[] args) 
	{
	        
		processData1(Ads.data());
	        
	   
	}
	  public static Map<String,Integer> processData(ArrayList<String> array)
	  {
		
		ArrayList<String> al = data();
		List<String> alId = new ArrayList<String>();
		for(int i=0;i<al.size();i++)
		{
			alId.add(i,(((al.get(i)).split(",")))[0]);
			
		}
		for(int i=0;i<alId.size();i++)
		{
			System.out.println(alId.get(i));
		}
		
		
		  
		HashMap<String,Integer> retVal = new HashMap<String,Integer>();
		return retVal;
	  }
	

	  public static void processData1(ArrayList<String> array)
	  {
		
		ArrayList<String> al = data();
		List<String> alId = new ArrayList<String>();
		for(int i=0;i<al.size();i++)
		{
			alId.add(i,(((al.get(i)).split(",")))[0]);
			
		}
		
		List<String> alDept = new ArrayList<String>();
		for(int i=0;i<al.size();i++)
		{
			alDept.add(i,(((al.get(i)).split(",")))[2]);
			
		}
		
		List<String> alSal = new ArrayList<String>();
		for(int i=0;i<al.size();i++)
		{
			alSal.add(i,(((al.get(i)).split(",")))[3]);
			
		}
		
		for(int i=0;i<alId.size();i++)
		{
			System.out.println(alId.get(i)+"\t"+alDept.get(i)+"\t\t"+alSal.get(i));
		}
		
		HashMap<Integer,String> hmSal = new HashMap<Integer,String>();
		//int MaxSal=Integer.parseInt(alSal.get(0));
		for(int i=0;i<alId.size();i++)
		{	
			hmSal.put(Integer.valueOf(alId.get(i)), alSal.get(i));
		}
		Set s = hmSal.keySet();
		System.out.println(s);
		TreeSet ts = new TreeSet();
		for(int i=0;i<s.size();i++)
		{
			ts.add(s);
		}
		System.out.println("TreeSet  " + ts);
		Collection c = hmSal.values();
		System.out.println(c);
		
		
		
	  }
}
