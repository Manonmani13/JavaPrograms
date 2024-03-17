package Oct_17_10_2021;

public class Son extends Father{
public static void main(String[] args) {
	Son s=new Son();
	System.out.println(s.hashCode());
	int hashCode=Integer.hashCode(60);
	System.out.println(hashCode);
}
}
