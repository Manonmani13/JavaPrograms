package StringMethos_2;

public class IsBlank {
public static void main(String[] args) {
	String s="mano";
	String s3=" ";
	String s4="";
	System.out.println(s.isBlank());
	System.out.println(s.isEmpty());
	System.out.println(s3.isEmpty());
	System.out.println(s4.isEmpty());
	System.out.println(s4.isBlank());
	System.out.println(s3.isBlank());//
	System.out.println(s.matches(s4));
}
}
/*
false
false
false
true
*/