package StringMethos_2;

public class ReplaceAll5 {
public static void main(String[] args) {
	String str = "Java";  
	System.out.println(str);  
	  
	String regex = "";  
	// adding a white space before and after every character of the input string.  
	str = str.replaceAll(regex, " ");  
	  
	System.out.println(str);  
}
}
/*
Java
 J a v a 
*/