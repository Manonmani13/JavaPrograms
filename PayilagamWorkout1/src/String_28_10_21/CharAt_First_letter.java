package String_28_10_21;

public class CharAt_First_letter {
	public static void main(String[] args) {  
        String s1 = "Welcome";  
        char[] ch = s1.toCharArray();  
        int len = ch.length;  
        if(s1.charAt(0)=='W')
        {
        	System.out.println("Yes");
        }
        else 
        {
        	System.out.println("No");
        }
        
    }  

}
//Yes