package String_28_10_21;

public class Length_4_whitespace {
public static void main(String[] args) {
	String str = " Welcome To manonmani world ";  
	int sizeWithWhiteSpaces = str.length();  
	System.out.println(sizeWithWhiteSpaces);
	System.out.println("In the string: " + "'" + str + "'");  
	str = str.replace(" ", "");  
	int sizeWithoutWhiteSpaces = str.length();   
	int noOfWhieSpaces = sizeWithWhiteSpaces - sizeWithoutWhiteSpaces;  
	  
	System.out.print("Total number of whitespaces present are: " + noOfWhieSpaces);  
}
}
/*
28
In the string: ' Welcome To manonmani world '
Total number of whitespaces present are: 5
*/