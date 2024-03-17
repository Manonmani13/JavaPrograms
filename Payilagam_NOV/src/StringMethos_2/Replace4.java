package StringMethos_2;

public class Replace4 {
	public static void main(String argvs[])  
	{  
	  
	String str = "For learning Java, JavaTpoint is a very good site.";  
	int size = str.length();  
	  
	System.out.println(str);  
	String target = null;  
	  
	// replacing null with JavaTpoint. Hence, the NullPointerException is raised.  
	str = str.replace(target, "JavaTpoint ");  
	  
	System.out.println(str);  
	  
	}  
}
/*
For learning Java, JavaTpoint is a very good site.
Exception in thread "main" java.lang.NullPointerException
	at java.base/java.lang.String.replace(String.java:2142)
	at StringMethos_2.Replace4.main(Replace4.java:14)

*/