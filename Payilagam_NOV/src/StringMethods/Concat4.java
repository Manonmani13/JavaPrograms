package StringMethods;

public class Concat4 {
public static void main(String[] args) {
	String s="manon";
	String s2="mani";
	String s3="Reader";
    String str4 = s.concat(" ").concat(s2).concat(" ").concat(s3);  
    System.out.println(str4);
    String str5 = s.concat("!!!");  
    System.out.println(str5);  
    String str6 = s.concat("@").concat(s2);  
    System.out.println(str6);  
}
}
/*
manon mani Reader
manon!!!
manon@mani

*/