package StringMethods;

public class Hashcode {
public static void main(String[] args) {
    System.out.println("Hashcode test of String:");  
    String str="java";  
    System.out.println(str.hashCode());  
    str=str+"tpoint";  
    System.out.println(str.hashCode());  

    System.out.println("Hashcode test of StringBuffer:");  
    StringBuffer sb=new StringBuffer("java");  
    System.out.println(sb.hashCode());  
    sb.append("tpoint");  
    System.out.println(sb.hashCode());  
}
}
/*
Hashcode test of String:
3254818
229541438
Hashcode test of StringBuffer:
1878246837
1878246837

*/