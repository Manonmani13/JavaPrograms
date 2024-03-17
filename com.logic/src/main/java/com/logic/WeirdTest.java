package com.logic;

import java.util.Scanner;

public class WeirdTest {
public static void main(String args[]) {
	    // Write C code here
	    int n;
	    Scanner sc=new Scanner(System.in);
	    n=sc.nextInt();
	    if(n%2==1)
	    	System.out.print("weird");
	    else{
	        if(n>=2&&n<=5)
	        System.out.print("not  weird");
	        else if(n>=6&&n<=20)
	        	System.out.print("weird");
	        else
	        	System.out.print("not weird");
	        }

	  
	}
}
