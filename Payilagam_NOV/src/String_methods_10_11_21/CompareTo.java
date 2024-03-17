package String_methods_10_11_21;

public class CompareTo {
public static void main(String[] args) {
	String s="mano";
	String n="mano";
	System.out.println(s.compareTo(n));
	String s1="jai";
	System.out.println(s.compareTo(s1));
	System.out.println(s1.compareTo(s));
}
}
/*
0
3
-3
*/