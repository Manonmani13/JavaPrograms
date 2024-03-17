package StringMethods;

import java.util.StringTokenizer;

public class HashMoreElement {
public static void main(String[] args) {
	StringTokenizer s=new StringTokenizer("hi  manonmani welcome to this");
    while (s.hasMoreElements())   
    {    
        System.out.println(s.nextToken());    
    }  
}
}
/*
hi
manonmani
welcome
to
this
*/