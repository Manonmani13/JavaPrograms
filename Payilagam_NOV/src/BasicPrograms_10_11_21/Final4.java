package BasicPrograms_10_11_21;

import java.io.IOException;

public class Final4 {
	 void method()throws IOException{  
		  throw new IOException("device error");  
		 }  
	  public static void main(String args[]){  
		    try{  
		     Final4 m=new Final4();  
		     m.method();  
		    }catch(Exception e){System.out.println("exception handled");}     
		  
		    System.out.println("normal flow...");  
		  }  
}
/*
exception handled
normal flow...
*/