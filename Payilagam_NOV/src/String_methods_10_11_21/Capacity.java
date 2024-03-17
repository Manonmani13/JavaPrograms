package String_methods_10_11_21;

public class Capacity {
public static void main(String[] args) {
	StringBuffer b=new StringBuffer();
	System.out.println(b.capacity());
	b.append("manonmani");
	System.out.println(b.capacity());
	//b.append("hello world welome to java and java language");
	b.append("hello world welome to java");
	System.out.println(b.capacity());
}
}
/*
16
16
35

*/