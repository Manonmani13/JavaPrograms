package String_28_10_21;

public class Indexof_Ex4 {
	public static void main(String[] args) {      
        String s1 = "This is indexOf method";         
        // Passing substring and index  
        int index = s1.indexOf("method"); //Returns the index of this substring  
        System.out.println("index of substring "+index);  
        index = s1.indexOf("method", 20); // It returns -1 if substring does not found  
        System.out.println("index of substring "+index);          
    }  
}
//doubt
/*
 * index of substring 16
index of substring -1
 */
