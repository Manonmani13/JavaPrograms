package StringMethods;

public class Contains1 {
	/*public boolean contains(CharSequence s) {    
	     // return indexOf(s.toString()) > -1;    
	  }*/   
	public static void main(String args[]){  
		String name="what do you know about me";  
		System.out.println(name.contains("do you know"));  
		System.out.println(name.contains("about"));  
		System.out.println(name.contains("hello"));  
		}
}
/*
true
true
false
*/