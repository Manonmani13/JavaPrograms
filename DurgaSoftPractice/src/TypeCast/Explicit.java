package TypeCast;

public class Explicit {
public static void main(String[] args) {
	int x=130;
	byte b=(byte) x;
	System.out.println(b);//bigger type to smaller type
	int x1=150;
	short s=(short) x1;
	System.out.println(s);
	byte b1=(byte)x1;
	System.out.println(b1);
	
}
}
