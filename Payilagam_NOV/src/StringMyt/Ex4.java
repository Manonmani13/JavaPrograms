package StringMyt;

public class Ex4 {
public static void main(String[] args) {
	String d="kirthu";
	StringBuffer b=new StringBuffer(d);
	StringBuffer b1=new StringBuffer("hello");
	StringBuffer b2=new StringBuffer("kirthu");
	System.out.println(d.contentEquals(b));
	System.out.println(d.contentEquals(b1));
	System.out.println(d.contentEquals(b2));
	System.out.println(d.endsWith("u"));
	
}
}
/*
true
false
true
true
*/