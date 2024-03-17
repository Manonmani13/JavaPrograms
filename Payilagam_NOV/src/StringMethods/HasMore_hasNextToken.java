package StringMethods;

import java.util.StringTokenizer;

public class HasMore_hasNextToken {
public static void main(String[] args) {
	StringTokenizer  st=new StringTokenizer("my name is manonmani");
	while(st.hasMoreTokens())
	{
		System.out.println(st.nextToken());
	}
}
}
/*
my
name
is
manonmani
*/