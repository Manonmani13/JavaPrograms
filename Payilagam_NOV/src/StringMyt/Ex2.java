package StringMyt;

public class Ex2 {
public static void main(String[] args) {
	String s="manonmani";
	String s1="Pandukumar";//109-80=29
	String s2="MANONMANI";//108-77=1
	System.out.println();
	System.out.println(s.codePointCount(2, 7));
	System.out.println(s.compareTo(s1));
	System.out.println(s.compareToIgnoreCase(s2));
}
}
/*
	m   P
5->109-80=29
29  -> 108-77=1
0-> both string is equal
*/