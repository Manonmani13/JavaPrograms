package Oct_17_10_2021;

public class LErrorDemo {
	
	    public static void main(String[] args)
	    {
	        int num = 789;
	        int reversednum = 0;
	        int remainder;
	  
	        while (num != 0) {
	  
	            // to obtain modulus % sign should
	            // have been used instead of /
	            remainder = num / 10;
	            reversednum
	                = reversednum * 10
	                  + remainder;
	            num /= 10;
	        }
	        System.out.println("Reversed number is "
	                           + reversednum);
	    }
	} 
