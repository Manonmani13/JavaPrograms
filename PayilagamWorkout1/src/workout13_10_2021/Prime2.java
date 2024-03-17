package workout13_10_2021;
import java.util.*;
public class Prime2 {
	public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        int a = 5;
        int b = 10;
        
        if(a<b && a>0 && b>0)
        {
            while(a<=b)
            {
                if(isPrime(a))
                {
                    System.out.println(a);   
                }
                a++;
            }
        }
        else
        {
            System.out.println("Provide valid input");
        }
    }
        public static boolean isPrime(int n)
        {
            if(n<=1)
            {
                return false;
            }
            for (int i =2; i<= Math.sqrt(n);i++)
            {
                if(n%i==0)
                {
                    return false;
                }
            }
            return true;
        }
}
