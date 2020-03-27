package abstrInterference;

import java.io.FileReader;
import java.util.*;

public class Ads2 
{
	public static void main (String[] args) 
	{
		HashMap<String,Integer> retVal = (HashMap)processData(data1());
		for(Map.Entry<String,Integer> e: retVal.entrySet())
        System.out.println(e.getKey() + ": " + e.getValue());
		
		//processData2(data1());
	}
	public static ArrayList<String> data1()
	{
		int[] array = new int[4];
		String s1=("129, Ram, Eng, 1200");
		String s2=("080, Sita, Test, 800");
		String s3=("12, Shyam, Eng, 1900");
		String s4=("15, Gita, Test, 350");
		ArrayList<String> inputData1 = new ArrayList<String>();
		inputData1.add(s1);
		inputData1.add(s2);
		inputData1.add(s3);
		inputData1.add(s4);
		return inputData1;
	}

	  public static Map<String,Integer> processData(ArrayList<String> array)
	  {  
		  ArrayList<String> al = data1();
		  List<String> alAl = new ArrayList<String>();
			
			for(int i=0;i<al.size();i++)
			{	
				alAl.addAll(Arrays.asList((al.get(i)).split(",")));
			}
			
			System.out.println(alAl);
			
			List<String> alAll = new ArrayList<String>();
			for(int i=0;i<alAl.size();i++)
			{
				alAll.add(alAl.get(i).trim());
			}
			alAl=null;
			System.out.println(alAll);
		
		int maxEngId=0;			//(int)Integer.parseInt(alAll.get(0));
		int maxTestId=0;
		int maxEngSal=0;
		int maxTestSal=0;
		String dept1=null;
		String dept2=null;
		
		
		for(int i=0;i<alAll.size();i=i+4)              // 15 elements Hence size+1
		{
			if(((alAll.get(i+2)).equals("Eng"))&&(Integer.parseInt(alAll.get(i))>maxEngId))
			{
				maxEngId=Integer.parseInt(alAll.get(i));
				dept1=alAll.get(i+2);
				maxEngSal=Integer.parseInt(alAll.get(i+3));
			}	
			
			if(((alAll.get(i+2)).equals("Test"))&&(Integer.parseInt(alAll.get(i))>maxTestId))
			{
				maxTestId=Integer.parseInt(alAll.get(i));
				dept2=alAll.get(i+2);
				maxTestSal=Integer.parseInt(alAll.get(i+3));
			}	
		}
		System.out.println("Dept"+"\t"+"Id"+"\t"+"Salary");
		System.out.println(dept1 + "\t" + maxEngId+"\t"+maxEngSal);
		System.out.println(dept2 + "\t" + maxTestId+"\t"+maxTestSal);
			
		
		HashMap<String,Integer> retVal = new HashMap<String,Integer>();
		retVal.put(dept1, maxEngSal);
		retVal.put(dept2, maxTestSal);
		return retVal;
				
	  }
	  
	  public static void processData2(ArrayList<String> array)
	  {
		  	ArrayList<String> al = data1();
			List<String> alAl = new ArrayList<String>();
			/* This adds last array of ArrayList al to s */
//			String[] s=new String[al.get(0).length()];;
//			for(int i=0;i<al.size();i++)
//			{
//				s =al.get(i).split(","); 
//			}
//			for(String i:s)
//			{System.out.println(i);}
			
			for(int i=0;i<al.size();i++)
			{	
				alAl.addAll(Arrays.asList((al.get(i)).split(",")));
			}
			System.out.println(alAl);
			
			List<String> alAll = new ArrayList<String>();
			for(int i=0;i<alAl.size();i++)
			{
				alAll.add(alAl.get(i).trim());
			}
			alAl=null;
			System.out.println(alAll);
		//	System.out.println(alAll.size());    //16
		//	System.out.println(alAll.get(15));                           // 0 to 15 elements
		int maxEngId=0;			//(int)Integer.parseInt(alAll.get(0));
		int maxTestId=0;
		int maxEngSal=0;
		int maxTestSal=0;
		String dept1=null;
		String dept2=null;
		
		//for(int j=0;j<alAll.size()/4;j+=4)
		//System.out.println(alAll.get(2));
		for(int i=0;i<alAll.size();i=i+4)              // 15 elements Hence size+1
		{
			//System.out.println(i);
			if(((alAll.get(i+2)).equals("Eng"))&&(Integer.parseInt(alAll.get(i))>maxEngId))
			{
				maxEngId=Integer.parseInt(alAll.get(i));
				dept1=alAll.get(i+2);
				maxEngSal=Integer.parseInt(alAll.get(i+3));
			}	
			
			if(((alAll.get(i+2)).equals("Test"))&&(Integer.parseInt(alAll.get(i))>maxTestId))
			{
				maxTestId=Integer.parseInt(alAll.get(i));
				dept2=alAll.get(i+2);
				maxTestSal=Integer.parseInt(alAll.get(i+3));
			}	
		}
		System.out.println("Dept"+"\t"+"Id"+"\t"+"Salary");
		System.out.println(dept1 + "\t" + maxEngId+"\t"+maxEngSal);
		System.out.println(dept2 + "\t" + maxTestId+"\t"+maxTestSal);
		//System.out.println(maxEngId);
		//System.out.println(maxTestId);
		
//		int maxEngSal = (int)Integer.parseInt(alAll.get(3));
//		int maxTestSal = (int)Integer.parseInt(alAll.get(3));
//	  
//		for(int i=2;i<alAll.size()/4;i+=4)
//		{
//			for(int j=3;j<alAll.size()/4;j+=4)
//			{	
//				if(alAll.get(i).equals("Eng"))
//				maxId=((int)Integer.parseInt(alAll.get(i)));
//			}
//		}
	  
	  }
	  
}
