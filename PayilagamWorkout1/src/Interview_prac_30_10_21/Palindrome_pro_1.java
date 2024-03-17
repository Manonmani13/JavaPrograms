package Interview_prac_30_10_21;

import java.util.Scanner;

public class Palindrome_pro_1 {
public static void main(String[] args) {
	System.out.println("Enter String");
	Scanner sc=new Scanner(System.in);
	 String name=sc.nextLine();
	 boolean pand=true;
	 int i=0,j=name.length()-1;
	 while(i<j)
	 {
		 if(name.charAt(i)!=name.charAt(j))
		 {
			 System.out.println("Not palindrome");
			 pand=false;
			 break;
		 }
		 i++;
		 j--;
	 }
	 if(pand)
	 {
		 System.out.println("panlindrome");
	 }
	
}
}
/*
Enter String
mano
Not palindrome
*/