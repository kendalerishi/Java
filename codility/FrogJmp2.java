package codility;

//My Solution
public class FrogJmp2 
{
	public static void main(String[] args) 
	{
		int X = 3;
		int Y = 999111321;
		int D = 7;
		System.out.println(solution(X,Y,D));
		
	}

	public static int solution(int X, int Y, int D) 
	{
		int K=D;
		while(true)
		{
			D=D+K;
			if(X==Y)
				return 0;
			if(X+D>=Y)
				return D/K;
		}
	}
}
