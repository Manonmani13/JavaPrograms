package Array_23_10_2021;

public class Example1 {
public static void main(String[] args) {
	Byte d=20;
	Byte c=30;
	System.out.println("max values"+d.MAX_VALUE);
	//System.out.println(d.compareTo(d));
	System.out.println("min values"+d.MIN_VALUE);
	System.out.println(" double values"+d.doubleValue());
	System.out.println("equals "+d.equals(d));
	System.out.println("float values"+ d.floatValue());
	System.out.println(" hash code"+ d.hashCode());
	System.out.println("int values"+d.intValue());
	System.out.println("long values"+ d.longValue());
	System.out.println("to string method"+d.toString());
	System.out.println("Byte values "+d.BYTES);
	System.out.println("size "+d.SIZE);
	//System.out.println("values "+d.compare(d, d));
	System.out.println(d.byteValue());
	System.out.println(d.getClass());
	System.out.println(d.shortValue());
	System.out.println(d.compareUnsigned(d, c));//doubt
	System.out.println(d.toUnsignedInt(d));
	System.out.println(d.TYPE);
	
}
}
/*
max values127
min values-128
 double values20.0
equals true
float values20.0
 hash code20
int values20
long values20
to string method20
Byte values 1
size 8
20
class java.lang.Byte
20
-10
20
byte




*/