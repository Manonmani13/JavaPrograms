package StringMyt;

public class Ex9 {
public static void main(String[] args) {
	String n="  manon mani";
	
	System.out.println(n.replaceAll(n, "hello"));
	System.out.println(n.replaceFirst(n, "man"));
	System.out.println(n.startsWith("m"));
	System.out.println(n.startsWith("a", 1));
	System.out.println(n.strip());
}
}
/*
hello
man
false
false
manon mani

*/