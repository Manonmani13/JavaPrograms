package Practice_24_10_21;

import java.util.Scanner;

public class Palindrome_Numbers_for {
	public static void main(String[] args) {
	    Scanner inp= new Scanner(System.in);
	    System.out.print("Enter the number: ");
	    int num= inp.nextInt();
	  
	    int reverse=0, element, remainder; 
	    element = num;
	  
	    for( ;num!=0;num/=10){
	      remainder= num % 10;
	      reverse = (reverse * 10) + remainder;
	    }
	  
	    if (element == reverse){
	      System.out.println("Yes, it is palindrome");
	    }
	    else{
	      System.out.println("No, it is not palindrome");
	    }
}
}
/*
 Enter the number: 232
Yes, it is palindrome
Enter the number: 321
No, it is not palindrome

 
 */
