package StringMethos_2;

public class Equal {
public static void main(String[] args) {
	//String str = new String("Welcome to JavaTpoint.");   
	//String str1 = new String("Welcome to JavaTpoint");  
	//System.out.println(str1 == str);
	String str = new String("Welcome to JavaTpoint").intern(); // statement - 1  
	String str1 = new String("Welcome to JavaTpoint").intern(); // statement - 2  
	System.out.println(str1 == str); 
}
}
//false
//true