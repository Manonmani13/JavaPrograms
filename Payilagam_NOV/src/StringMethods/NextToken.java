package StringMethods;

import java.util.StringTokenizer;

public class NextToken {
public static void main(String[] args) {
	StringTokenizer t=new StringTokenizer("Hello, my name is manonmani, hello, welcome");
	System.out.println(t.nextToken(","));
}
}
//Hello