package StringMyt;

public class Ex12 {
public static void main(String[] args) {
	String h="Mano mano \n manonmani";
	 Ex12 b=new  Ex12();
	 char c[]={'m','a','n'};
	System.out.println(h.getClass());
	System.out.println(b.getClass());
	System.out.println(h.lines());
	//System.out.println(h.split("\n "));
	System.out.println(h.split("a", 1));
	System.out.println(h.subSequence(0, 3));
	System.out.println(h.split(h, 1));
	System.out.println(h.copyValueOf(c));
	System.out.println(h.copyValueOf(c, 0, 3));
	System.out.println(h.format("%s",h));
}
}
/*
class java.lang.String
class StringMyt.Ex12
java.util.stream.ReferencePipeline$Head@3764951d
[Ljava.lang.String;@4b1210ee
Man
[Ljava.lang.String;@3cd1a2f1
man
man
Mano mano 
 manonmani

*/