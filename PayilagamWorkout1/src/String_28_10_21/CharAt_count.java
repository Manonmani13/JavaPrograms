package String_28_10_21;

public class CharAt_count {
	public static void main(String[] args) {  
        String str = "manonmani";  
        int count = 0;  
        for (int i=0; i<=str.length()-1; i++) {  
            if(str.charAt(i) == 'a') {  
                count++;  
                if(count>1)
                {
                	System.out.println(str.charAt(i)+"   occurs more than one time");
                	break;
                }
            }  
        }  
        System.out.println("Frequency of t is: "+count);  
    } 
}
/*
a   occurs more than one time
Frequency of t is: 2

*/