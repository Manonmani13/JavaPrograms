package String_28_10_21;

public class ToCharArray_Ex2 {
	 public static void main(String[] args) {  
	        String s1 = "Welcome to worlds of ours";  
	        char[] ch = s1.toCharArray();  
	        int len = ch.length;  
	        System.out.println("Char Array length: " + len);  
	        System.out.println("Char Array elements: ");  
	        for (int i = 0; i < len; i++) {  
	            System.out.print(ch[i]+" ");  
	        }  
	    }  
}
/*
Char Array length: 25
Char Array elements: 
W e l c o m e   t o   w o r l d s   o f   o u r s 
*/