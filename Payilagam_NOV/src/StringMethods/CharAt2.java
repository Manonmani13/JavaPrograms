package StringMethods;

public class CharAt2 {
public static void main(String[] args) {
	String name="manonmani";
	System.out.println(name.charAt(9));
}
}
/*
if the value is more than given string 
Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 9
	at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:47)
	at java.base/java.lang.String.charAt(String.java:693)
	at StringMethods.CharAt2.main(CharAt2.java:6)

*/