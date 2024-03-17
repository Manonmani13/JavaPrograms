package String_28_10_21;

public class CharAt_Ex5 {
	public static void main(String[] args) {  
        String name = "manonmani";  
        char key='n';
        for(int i=0;i<name.length();i++)
        {
            if(key==name.charAt(i))
            {
            	System.out.println(name.charAt(i));
            }
           
        }
    
        
    }  
}
/*
n
n
n
*/