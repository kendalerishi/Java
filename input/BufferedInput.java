package input;

//import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedInput
{
	public static void main(String[] args) throws IOException
	{
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		System.out.println("Enter values :");
		String name = br.readLine();
		int x = br.read();
		
		System.out.println(x);
		System.out.println(name);
	}
		

}
