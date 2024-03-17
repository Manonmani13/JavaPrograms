package String_methods_10_11_21;

public class Join {
public static void main(String[] args) {

    String s1 = new String("Hello");     
    String s2 = new String(" World");
    String s3=String.join("#", s1,s2);
    System.out.println(s3);
    Join b=new Join();
    		System.out.println();
}
}
//Hello# World