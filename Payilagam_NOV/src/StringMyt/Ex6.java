package StringMyt;

public class Ex6 {
public static void main(String[] args) {
	String n="manonmani";
	String n1="MANONMANI";
	String n2=new String("MANONMANI");
	System.out.println(n.equalsIgnoreCase(n1));
	System.out.println(n.hashCode());
	System.out.println(n2.hashCode());
	System.out.println(n.indexOf('i'));
	System.out.println(n1.indexOf(n2));
	System.out.println(n.indexOf('m', 6));
	System.out.println(n.indexOf(n2, 0));
}
}
/*
true
-66206072
-1574578584
8
0
-1
-1

*/