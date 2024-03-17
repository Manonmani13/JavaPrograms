package StringMethos_2;

public class Length2 {
public static void main(String[] args) {
    String str = "Javatpoint";  
    if(str.length()>0) {  
        System.out.println("String is not empty and length is: "+str.length());  
    }  
    str = "";  
    if(str.length()==0) {  
        System.out.println("String is empty now: "+str.length());  
    }  
}
}
/*
String is not empty and length is: 10
String is empty now: 0
*/