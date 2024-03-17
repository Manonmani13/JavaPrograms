package StringMethods;

import java.util.StringTokenizer;

public class CountToken {
public static void main(String[] args) {
	StringTokenizer st = new StringTokenizer("Hello Everyone Have a nice day manonmani"," ");    
    /* Prints the number of tokens present in the String */  
    System.out.println("Total number of Tokens: "+st.countTokens());    

}
}
//Total number of Tokens: 7