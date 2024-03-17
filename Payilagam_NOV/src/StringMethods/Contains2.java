package StringMethods;

public class Contains2 {
    public static void main(String[] args) {  
        String str = "Hello Java readers";  
        boolean isContains = str.contains("Java");  
        System.out.println(isContains);  
        // Case Sensitive  
        System.out.println(str.contains("java")); // false  
    }
}
/*
true
false
*/