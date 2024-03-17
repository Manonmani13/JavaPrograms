package String_28_10_21;

public class CharAt_Ex2 {
	 public static void main(String[] args) {  
	        String str = "Welcome";          
	        for (int i=0; i<=str.length()-1; i++) {  
	            if(i%2!=0) {  
	                System.out.println("Char at "+i+" place "+str.charAt(i));  
	            }  
	        }  
	    }  
}
/*
Char at 1 place e
Char at 3 place c
Char at 5 place m
*/