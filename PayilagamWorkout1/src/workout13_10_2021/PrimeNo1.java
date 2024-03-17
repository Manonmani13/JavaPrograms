package workout13_10_2021;

public class PrimeNo1 {
	
	public static int IsPrime (int N)
	{
	int Dividers = 0;
	int ReturnValue = 1;

		for (int i = 1; i < N; i++)
		{
			if (N % i == 0)
				Dividers ++; 
			
			if (Dividers > 1)     // Break from the loop as soon as possible!! 
			{
				ReturnValue = 0;
				break; 
			}
		}
		
		return ReturnValue; 
	}

	public static void main(String[] args) 
	{
		System.out.println (IsPrime (25));
	}
}
