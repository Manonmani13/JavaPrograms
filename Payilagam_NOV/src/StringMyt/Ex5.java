package StringMyt;

public class Ex5 {
public static void main(String[] args) {
	String s="Manonmani";
	String s1="mano";
	String s2="Manonmani";
	String s3=new String("Manonmani");
	String s4=new String("manonmani");
	String s5=new String("Manonmani");
	System.out.println(s.equals(s));
	System.out.println(s.equals(s3));
	System.out.println(s.equals(s1));
	System.out.println(s.equals(s2));
	System.out.println(s3.equals(s5));
	System.out.println(s3.equals(s4));
	
}
}
/*
true
true
false
true
true
false

*/