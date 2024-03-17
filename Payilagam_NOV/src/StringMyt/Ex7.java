package StringMyt;

public class Ex7 {
public static void main(String[] args) {
	String o="yuvan";
	String i=" ";
	String s="";
	String i1="yuvan";
	System.out.println(o.intern());
	System.out.println(i.isBlank());
	System.out.println(s.isEmpty());
	System.out.println(o.lastIndexOf('n'));
	System.out.println(o.lastIndexOf(s));
	System.out.println(o.lastIndexOf(0, 3));
	System.out.println(o.lastIndexOf(o, 0));
	System.out.println(o.length());
	System.out.println(o.matches(i1));
}
}
/*
yuvan
true
true
4
5
-1
0
5
true

*/