package String_28_10_21;

import java.util.Scanner;

public class Palindrome_scanner {
public static void main(String[] args) {
	System.out.println("Enter Any String");
	Scanner sc=new Scanner(System.in);
	String name=sc.nextLine();
	
	boolean pand=true;
	int i=0,j=name.length()-1;
	while(i<j)
	{
		if(name.charAt(i)!=name.charAt(j))
		{
			System.out.println("Not Palindrome");
			pand=false;
			break;
		}
		i++;
		j--;
	}
	if(pand)//pand==true use can also give pand are equal
	{
		System.out.println("Palimdrome");
	}
	
}}
/*
Enter Any String
racecar
Palimdrome
*/