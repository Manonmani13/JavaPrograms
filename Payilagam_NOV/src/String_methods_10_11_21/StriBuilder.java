package String_methods_10_11_21;

public class StriBuilder {
public static void main(String[] args) {
	 StringBuilder s1 = new StringBuilder("Hello");    //String 1  
     StringBuilder s2 = new StringBuilder(" World");    //String 2  
     StringBuilder s = s1.append(s2);   //String 3 to store the result  
         System.out.println(s);  //Displays result  
}
}
//Hello World