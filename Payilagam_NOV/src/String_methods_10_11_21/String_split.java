package String_methods_10_11_21;
import java.util.*;  
public class String_split {
public static void main(String[] args) {
	String text=new String("hii, mano");
	String []sen=text.split("\\.");
	System.out.println(Arrays.toString(sen));
}
}
//[hii, mano