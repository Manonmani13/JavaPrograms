package StringMethos_2;

public class ReplaceAll6 {
public static void main(String[] args) {
	String str = "Java";  
	System.out.println(str);  
	  
	String regex = null; // regular expression is null  
	  
	str = str.replaceAll(regex, " ");  
	  
	System.out.println(str);
}
}
/*
Java
Exception in thread "main" java.lang.NullPointerException
	at java.base/java.util.regex.Pattern.<init>(Pattern.java:1426)
	at java.base/java.util.regex.Pattern.compile(Pattern.java:1068)
	at java.base/java.lang.String.replaceAll(String.java:2126)
	at StringMethos_2.ReplaceAll6.main(ReplaceAll6.java:10)

*/