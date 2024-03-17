package Practice_24_10_21;

public class Neon_num2 {
	static boolean isNeon(int num)   
	{   
	int sq = num * num;    
	int sumOfdigits = 0;    
	while (sq != 0)   
	{      
	sumOfdigits = sumOfdigits + sq % 10;   
	sq = sq / 10;   
	}     
	return (sumOfdigits == num);   
	}    
	public static void main(String args[])  
	{   
	System.out.print("Neon Numbers between the given range are: ");      
	for (int i = 0; i <= 10; i++)    
	if (isNeon(i))   
	System.out.print(i+" ");           
	}   

}
