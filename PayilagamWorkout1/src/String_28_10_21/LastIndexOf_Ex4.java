package String_28_10_21;

public class LastIndexOf_Ex4 {
	public static void main(String[] args) {           
        String str = "This is last index of example";  
        int index = str.lastIndexOf("of", 25);  
        System.out.println(index);  
        index = str.lastIndexOf("of", 10);  
        System.out.println(index); // -1, if not found        

}
}
/*
 * 19
-1
 
*/