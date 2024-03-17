package StringMyt;

public class Ex8 {
public static void main(String[] args) {
	String s="mano";
	System.out.println(s.offsetByCodePoints(0, 3));
	System.out.println(s.regionMatches(0, s, 0, 3));
	System.out.println(s.regionMatches(true, 1, s, 2, 3));
	System.out.println(s.repeat(3));
	System.out.println(s.replace('a', 'e'));
	
}
}
/*
3
true
false
manomanomano

*/