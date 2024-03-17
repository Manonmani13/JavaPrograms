package StringMyt;

public class Ex10 {
public static void main(String[] args) {
	String s="             manonnmani        ";
	String v="";
	String f=" m a n o ";
	System.out.println(s.isEmpty());
	System.out.println(v.isEmpty());
	System.out.println(s.strip());
	System.out.println(f.strip());
	System.out.println(s.stripLeading());
}
}
/*
false
true
manonnmani
m a n o
manonnmani        

*/