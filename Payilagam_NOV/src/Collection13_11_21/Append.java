package Collection13_11_21;

public class Append {
public static void main(String[] args) {
String s1="manonmani";
s1.concat(s1);
System.out.println(s1);
String s2=s1.concat(s1);
System.out.println(s2);
String s3="hi";
System.out.println(s3.concat("hello"));
System.out.println(s3);
StringBuffer sb=new StringBuffer("mano");
sb.append(" hello");
System.out.println(sb);
}
}
/*
manonmani
manonmanimanonmani
hihello
hi
mano hello
*/