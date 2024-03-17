package StringMethods;

public class Equal {
public static void main(String[] args) {
	String n="mano";
	String s="mano";
	int i=10;
	Integer k=new Integer(10);
	System.out.println(i==k);
	System.out.println(k.equals(i));
	String h=new String("mano");
	String j=new String("mano");
	//System.out.println(n==s);
	System.out.println(s==h);
	System.out.println(h==j);
	System.out.println(h.equals(j));
	
	System.out.println(s.equals(h));
	//System.out.println(h.equals(n));
	//System.out.println(n.equals(s));
}
}
