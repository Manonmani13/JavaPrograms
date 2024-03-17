package Oct_17_10_2021;

public class Equals_method3 {
public static void main(String[] args) {
	String str = "a";  
	String str1 = "123";  
	String str2 = "45.89";  
	String str3 = "false";  
	//String c="a";
	Character c = new Character('a');  
	Integer i = new Integer(123);  
	Float f = new Float(45.89);  
	Boolean b = new Boolean(false);  

System.out.println(str.equals(c));
System.out.println(str1.equals(i));
System.out.println(str2.equals(f));
System.out.println(str3.equals(b));
System.out.println(str.equals(c.toString()));
}
}
