package StringMyt;

public class Ex11 {
public static void main(String[] args) {
	String s="    Gowtham   ";
	String v="Gowth";
	
	System.out.println(s.stripTrailing());
	System.out.println(s.substring(6));
	System.out.println(s.substring(5, 7));
	System.out.println(s.toCharArray());
	System.out.println(s.toLowerCase());
	System.out.println(s.toString());
	System.out.println(s.toUpperCase());
	System.out.println(s.trim());
	System.out.println(v.codePoints());

}
}
/*
    Gowtham
wtham   
ow
    Gowtham   
    gowtham   
    Gowtham   
    GOWTHAM   
Gowtham
java.util.stream.IntPipeline$Head@3cd1a2f1


*/