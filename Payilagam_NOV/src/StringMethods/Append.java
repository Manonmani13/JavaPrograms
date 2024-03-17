package StringMethods;

public class Append {
    public static void main(String[] args){  
        StringBuilder builder=new StringBuilder("hello");  
        builder.append("java");  
        System.out.println(builder);  
        StringBuffer buffer=new StringBuffer("hello");  
        buffer.append("java");  
        System.out.println(buffer);  
    }  
}
/*
hellojava
hellojava

*/