package String_28_10_21;

public class Length_2 {
	public static void main(String[] args) {  
        String str = "manonmani p";  
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