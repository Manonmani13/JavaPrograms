package Practice_24_10_21;

import java.util.Scanner;

public class Palindrome_String_1 {
	public static void main(String args[])
    {
        String x, y = "";
       Scanner a = new Scanner(System.in);
      System.out.print("Enter  string you want to check:");
     x = a.nextLine();
        int l = x.length();
       for(int k = l - 1; k >= 0; k--)
     {
          y = y + x.charAt(k);
      }
      if(x.equalsIgnoreCase(y))
        {
            System.out.println("The string is palindrome.");
        }
        else
        {
            System. out.println("The string is not a palindrome.");
        }
    }
}
/*
 * Enter  string you want to check:malayalam
The string is palindrome.
Enter  string you want to check:jai
The string is not a palindrome.

 */

