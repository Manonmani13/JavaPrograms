package String_28_10_21;

public class CharAt_Ex4 {
	public static void main(String[] args) {  
        String str = "manonmani";  
        int count = 0;  
        for (int i=0; i<=str.length()-1; i++) {  
            if(str.charAt(i) == 'a') {  
                count++;  
            }  
        }  
        System.out.println("Frequency of t is: "+count);  
    }  
}
//Frequency of t is: 2