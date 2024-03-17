package StringMethos_2;

public class ReplaceAll4 {
	public static void main(String argvs[])  
	{  
	  
	// input string  
	String str = "For learning Java, JavaTpoint is a very good site.";  
	  
	System.out.println(str);  
	  
	String regex = "\\"; // the regular expression is not valid.  
	  
	// invoking the replaceAll() method raises the PatternSyntaxException  
	str = str.replaceAll(regex, "JavaTpoint ");  
	  
	System.out.println(str);  
	  
	}  

}
/*
For learning Java, JavaTpoint is a very good site.
Exception in thread "main" java.util.regex.PatternSyntaxException: Unexpected internal error near index 1
\
	at java.base/java.util.regex.Pattern.error(Pattern.java:2027)
	at java.base/java.util.regex.Pattern.compile(Pattern.java:1788)
	at java.base/java.util.regex.Pattern.<init>(Pattern.java:1428)
	at java.base/java.util.regex.Pattern.compile(Pattern.java:1068)
	at java.base/java.lang.String.replaceAll(String.java:2126)
	at StringMethos_2.ReplaceAll4.main(ReplaceAll4.java:15)

*/