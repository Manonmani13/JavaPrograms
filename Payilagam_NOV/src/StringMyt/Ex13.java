package StringMyt;

public class Ex13 {
public static void main(String[] args) {
	String y="yuvan ";
	boolean b=true;
	int i=90;
	byte j=90;
	//System.out.println(y.copyValueOf(null));
	System.out.println(y.join(y, "j"));
	System.out.println(y.join(y, "jk"));
	System.out.println(y.valueOf(b));
	System.out.println(y.valueOf(i));
	System.out.println(y.CASE_INSENSITIVE_ORDER);
	//System.out.println(y.getChars(i, j, null, i));
}
}
