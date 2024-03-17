package BasicPrograms_10_11_21;

public class Null_Ex {
public static void main(String[] args) {
	Null_Ex n=new Null_Ex();
	System.out.println(n.hashCode());
	n=null;
	System.out.println(n.hashCode());

}
}
/*
Exception in thread "main" java.lang.NullPointerException
	at BasicPrograms_10_11_21.Null_Ex.main(Null_Ex.java:8)
1878246837

*/